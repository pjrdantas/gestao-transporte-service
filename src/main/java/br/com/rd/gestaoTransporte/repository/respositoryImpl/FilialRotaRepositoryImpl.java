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

import br.com.rd.gestaoTransporte.domain.dto.FilialRotaDTO;
import br.com.rd.gestaoTransporte.repository.FilialRotaRepository;

@Transactional
@Repository
public class FilialRotaRepositoryImpl implements FilialRotaRepository {

	private static final org.slf4j.Logger log = LoggerFactory.getLogger(FilialRotaRepositoryImpl.class);
	
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
		
	@Override
	public FilialRotaDTO getFilialRotaById(Long idFilialRota) throws SQLException, Throwable {
		try {
			StringBuilder sql = new StringBuilder(sqlSelectPrincipal)
					.append(" WHERE CD_FILIAL_ROTA = :cdFilialRota ");
			SqlParameterSource params = new MapSqlParameterSource().addValue("codigoFornecedor", idFilialRota);		
			return devolveObjeto(sql, params);
		} catch(SQLException e) {
			log.error("NÃO FOI POSSIVEL LOCALIZAR O FILIAL_ROTA.",e.getSQLState());		
			return null;	
		}

	}

	@Override
	public List<FilialRotaDTO> getAllFilialRota() throws SQLException, Throwable {
		try {
			StringBuilder sql = new StringBuilder(sqlSelectPrincipal)
					.append(" ORDER BY CD_FILIAL_ROTA ");
			return devolveListaObjetos(sql, null);
		} catch(SQLException e) {
			log.error("ERRO NA EMISSÃO DA LISTA DE FILIAL_ROTA.",e.getSQLState());		
			return null;	
		}
	}
	
	
	

	final static StringBuilder sqlSelectPrincipal = new StringBuilder()
			.append(" SELECT DISTINCT ")
			.append(" CD_FILIAL_ROTA ")
			.append(" ,DS_FILIAL_ROTA ")
			.append(" ,FL_ATIVO ")
			.append(" FROM TB_FILIAL_ROTA ");
	
	private FilialRotaDTO  devolveObjeto(StringBuilder sql, SqlParameterSource params) 
			throws Exception, Throwable {
		return jdbcTemplate.queryForObject(sql.toString(), params, (rs, i) -> {			
			FilialRotaDTO filialRotaDTO = new FilialRotaDTO();
			filialRotaDTO.setCdFilialRota(rs.getLong("CD_FILIAL_ROTA"));
			filialRotaDTO.setDsFilialRota(rs.getString("DS_FILIAL_ROTA"));
			filialRotaDTO.setFlAtivo(rs.getInt("FL_ATIVO"));
			return filialRotaDTO;
		});
	}

	private List<FilialRotaDTO>  devolveListaObjetos(StringBuilder sql, SqlParameterSource params) 
			throws Exception, Throwable {
		return jdbcTemplate.query(sql.toString(), params, (rs, i) -> {			
			FilialRotaDTO filialRotaDTO = new FilialRotaDTO();
			filialRotaDTO.setCdFilialRota(rs.getLong("CD_FILIAL_ROTA"));
			filialRotaDTO.setDsFilialRota(rs.getString("DS_FILIAL_ROTA"));
			filialRotaDTO.setFlAtivo(rs.getInt("FL_ATIVO"));
			return filialRotaDTO;
		});
	}
}
