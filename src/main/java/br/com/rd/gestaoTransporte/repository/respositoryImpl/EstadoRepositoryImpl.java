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

import br.com.rd.gestaoTransporte.domain.dto.EstadoDTO;
import br.com.rd.gestaoTransporte.repository.EstadoRepository;

@Transactional
@Repository
public class EstadoRepositoryImpl implements EstadoRepository{
	
	private static final org.slf4j.Logger log =  LoggerFactory.getLogger(EstadoRepositoryImpl.class);

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
		
	@Override
	public EstadoDTO getEstadoById(String siglaEstado) throws Exception, Throwable {
		try {
			StringBuilder sql = new StringBuilder(sqlSelectPrincipal)
					.append(" WHERE SG_ESTADO = :siglaEstado ");
			SqlParameterSource params = new MapSqlParameterSource().addValue("siglaEstado", siglaEstado);		
			return devolveObjeto(sql, params);
		} catch(SQLException e) {
			log.error("NÃO FOI POSSIVEL LOCALIZAR O ESTADO! : ",e.getSQLState());		
			return null;	
		}
	}

	@Override
	public List<EstadoDTO> getAllEstado() throws Exception, Throwable {
		try {
			StringBuilder sql = new StringBuilder(sqlSelectPrincipal)
					.append(" ORDER BY SG_ESTADO ");
			return devolveListaObjetos(sql, null);
		} catch(SQLException e) {
			log.error("ERRO NA EMISSÃO DA LISTA DE ESTADOS! :",e.getSQLState());		
			return null;	
		}
	}
	
	final static StringBuilder sqlSelectPrincipal = new StringBuilder()
			.append(" SELECT ")
			.append(" SG_ESTADO ")
			.append(" ,DS_ESTADO ")
			.append(" FROM TB_ESTADO ");
		
	private EstadoDTO  devolveObjeto(StringBuilder sql, SqlParameterSource params) throws Exception, Throwable {
		return jdbcTemplate.queryForObject(sql.toString(), params, (rs, i) -> {			
			EstadoDTO estadoDTO = new EstadoDTO();
			estadoDTO.setSiglaEstado(rs.getString("SG_ESTADO"));
			estadoDTO.setDescricaoEstado(rs.getString("DS_ESTADO"));				
			return estadoDTO;
		});
	}
	
	private List<EstadoDTO>  devolveListaObjetos(StringBuilder sql, SqlParameterSource params) throws Exception, Throwable {
		return jdbcTemplate.query(sql.toString(), params, (rs, i) -> {			
			EstadoDTO estadoDTO = new EstadoDTO();
			estadoDTO.setSiglaEstado(rs.getString("SG_ESTADO"));
			estadoDTO.setDescricaoEstado(rs.getString("DS_ESTADO"));				
			return estadoDTO;
		});
	}

}
