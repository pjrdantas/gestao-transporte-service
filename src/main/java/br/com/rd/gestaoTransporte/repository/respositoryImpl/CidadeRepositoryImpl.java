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

import br.com.rd.gestaoTransporte.domain.dto.CidadeDTO;
import br.com.rd.gestaoTransporte.repository.CidadeRepository;

@Transactional
@Repository
public class CidadeRepositoryImpl implements CidadeRepository {
	
	private static final org.slf4j.Logger log = LoggerFactory.getLogger(CidadeRepositoryImpl.class);
	
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public CidadeDTO getCidadeById(Long idCidade) throws SQLException, Throwable {
		try {
			StringBuilder sql = new StringBuilder(sqlSelectPrincipal)
					.append(" WHERE ID_CIDADE = :idCidade ");
			SqlParameterSource params = new MapSqlParameterSource().addValue("idCidade", idCidade);		
			return devolveObjeto(sql, params);
		} catch(SQLException e) {
			log.error("NÃO FOI POSSIVEL LOCALIZAR O CIDADE.",e.getSQLState());		
			return null;	
		}
	}

	@Override
	public List<CidadeDTO> getAllCidade() throws SQLException, Throwable {
		try {
			StringBuilder sql = new StringBuilder(sqlSelectPrincipal)
					.append(" ORDER BY SG_ESTADO, NM_CIDADE ");
			return devolveListaObjetos(sql, null);
		} catch(SQLException e) {
			log.error("ERRO NA EMISSÃO DA LISTA DE CIDADES.",e.getSQLState());		
			return null;	
		}
	}
	
	final static StringBuilder sqlSelectPrincipal = new StringBuilder()
			.append(" SELECT ")
			.append(" ID_CIDADE ")
			.append(" ,NM_CIDADE ")
			.append(" ,SG_ESTADO ")
			.append(" FROM TB_CIDADE ");
	
	private CidadeDTO  devolveObjeto(StringBuilder sql, SqlParameterSource params) 
			throws Exception, Throwable {
		return jdbcTemplate.queryForObject(sql.toString(), params, (rs, i) -> {			
			CidadeDTO cidadeDTO = new CidadeDTO();
			cidadeDTO.setIdCidade(rs.getLong("ID_CIDADE"));
			cidadeDTO.setNomeCidade(rs.getString("NM_CIDADE"));
			cidadeDTO.setSiglaEstado(rs.getString("SG_ESTADO"));
			return cidadeDTO;
		});
	}
	
	private List<CidadeDTO>  devolveListaObjetos(StringBuilder sql, SqlParameterSource params) 
			throws Exception, Throwable {
		return jdbcTemplate.query(sql.toString(), params, (rs, i) -> {			
			CidadeDTO cidadeDTO = new CidadeDTO();
			cidadeDTO.setIdCidade(rs.getLong("ID_CIDADE"));
			cidadeDTO.setNomeCidade(rs.getString("NM_CIDADE"));
			cidadeDTO.setSiglaEstado(rs.getString("SG_ESTADO"));			
			return cidadeDTO;
		});
	}


}
