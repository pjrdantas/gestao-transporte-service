package br.com.rd.gestaoTransporte.repository.respositoryImpl;

import java.sql.SQLException;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import br.com.rd.gestaoTransporte.domain.dto.TipoVeiculoDTO;
import br.com.rd.gestaoTransporte.repository.TipoVeiculoRepository;

@Transactional
@Repository
public class TipoVeiculoRepositoryImpl implements TipoVeiculoRepository {

	private static final org.slf4j.Logger log = LoggerFactory.getLogger(TipoVeiculoRepositoryImpl.class);

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public TipoVeiculoDTO getTipoVeiculoById(Long codigoTipoVeiculo) throws SQLException, Throwable {
		try {
			StringBuilder sql = new StringBuilder(sqlSelectPrincipal)
					.append(" WHERE CD_TP_VEICULO = :codigoTipoVeiculo ");
			SqlParameterSource params = new MapSqlParameterSource().addValue("codigoTipoVeiculo", codigoTipoVeiculo);		
			return devolveObjeto(sql, params);
		} catch(SQLException e) {
			log.error("NÃO FOI POSSIVEL LOCALIZAR O VEICULO.",e.getSQLState());		
			return null;	
		}
	}

	@Override
	public List<TipoVeiculoDTO> getAllTipoVeiculo() throws SQLException, Throwable {
		try {
			StringBuilder sql = new StringBuilder(sqlSelectPrincipal)
					.append(" ORDER BY CD_TP_VEICULO ");
			return devolveListaObjetos(sql, null);
		} catch(SQLException e) {
			log.error("ERRO NA EMISSÃO DA LISTA DE TIPOS DE VEICULO.",e.getSQLState());		
			return null;	
		}
	}

	final static StringBuilder sqlSelectPrincipal = new StringBuilder()
			.append(" SELECT ")
			.append(" CD_TP_VEICULO ")
			.append(" ,DS_TP_VEICULO ")
			.append(" FROM TB_TP_VEICULO ");
		
	private TipoVeiculoDTO  devolveObjeto(StringBuilder sql, SqlParameterSource params) throws Exception, Throwable {
		return jdbcTemplate.queryForObject(sql.toString(), params, (rs, i) -> {			
			TipoVeiculoDTO tipoVeiculoDTO = new TipoVeiculoDTO();
			tipoVeiculoDTO.setCodigoTipoVeiculo(rs.getLong("CD_TP_VEICULO"));
			tipoVeiculoDTO.setDescricaoTipoVeiculo(rs.getString("DS_TP_VEICULO"));			
			return tipoVeiculoDTO;
		});
	}
	
	private List<TipoVeiculoDTO>  devolveListaObjetos(StringBuilder sql, SqlParameterSource params) throws Exception, Throwable {
		return jdbcTemplate.query(sql.toString(), params, (rs, i) -> {			
			TipoVeiculoDTO tipoVeiculoDTO = new TipoVeiculoDTO();
			tipoVeiculoDTO.setCodigoTipoVeiculo(rs.getLong("CD_TP_VEICULO"));
			tipoVeiculoDTO.setDescricaoTipoVeiculo(rs.getString("DS_TP_VEICULO"));			
			return tipoVeiculoDTO;
		});
	}
}
