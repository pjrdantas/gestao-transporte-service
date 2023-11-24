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

import br.com.rd.gestaoTransporte.domain.dto.MontadoraDTO;
import br.com.rd.gestaoTransporte.repository.MontadoraRepository;

@Transactional
@Repository
public class MontadoraRepositoryImpl implements MontadoraRepository{

	private static final org.slf4j.Logger log = LoggerFactory.getLogger(MontadoraRepositoryImpl.class);
	
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Override
	public MontadoraDTO getMontadoraById(Long codigoMontadora) throws SQLException, Throwable {
		try {
			StringBuilder sql = new StringBuilder(sqlSelectPrincipal)
					.append(" WHERE CD_MONTADORA = :codigoMontadora ");
			SqlParameterSource params = new MapSqlParameterSource().addValue("codigoMontadora", codigoMontadora);		
			return devolveObjeto(sql, params);
		} catch(SQLException e) {
			log.error("N�O FOI POSSIVEL LOCALIZAR A MONTADORA.",e.getSQLState());		
			return null;	
		}
	}

	@Override
	public List<MontadoraDTO> getAllMontadora() throws SQLException, Throwable {
		try {
			StringBuilder sql = new StringBuilder(sqlSelectPrincipal)
					.append(" ORDER BY CD_MONTADORA ");
			return devolveListaObjetos(sql, null);
		} catch(SQLException e) {
			log.error("ERRO NA EMISSÃO DA LISTA DE MONTADORAS.",e.getSQLState());		
			return null;	
		}
	}

	final static StringBuilder sqlSelectPrincipal = new StringBuilder()
			.append(" SELECT ")
			.append(" CD_MONTADORA ")
			.append(" ,DS_MARCA ")
			.append(" ,DS_MODELO ")
			.append(" FROM TB_MONTADORA ");
		
	private MontadoraDTO  devolveObjeto(StringBuilder sql, SqlParameterSource params) throws Exception, Throwable {
		return jdbcTemplate.queryForObject(sql.toString(), params, (rs, i) -> {			
			MontadoraDTO montadoraDTO = new MontadoraDTO();
			montadoraDTO.setCodigoMontadora(rs.getLong("CD_MONTADORA"));
			montadoraDTO.setDescricaoMarca(rs.getString("DS_MARCA"));
			montadoraDTO.setDescricaoModelo(rs.getString("DS_MODELO"));
			return montadoraDTO;
		});
	}
	
	private List<MontadoraDTO>  devolveListaObjetos(StringBuilder sql, SqlParameterSource params) throws Exception, Throwable {
		return jdbcTemplate.query(sql.toString(), params, (rs, i) -> {			
			MontadoraDTO montadoraDTO = new MontadoraDTO();
			montadoraDTO.setCodigoMontadora(rs.getLong("CD_MONTADORA"));
			montadoraDTO.setDescricaoMarca(rs.getString("DS_MARCA"));
			montadoraDTO.setDescricaoModelo(rs.getString("DS_MODELO"));
			return montadoraDTO;
		});
	}
}
