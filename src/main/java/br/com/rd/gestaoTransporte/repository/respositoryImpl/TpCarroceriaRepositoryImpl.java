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

import br.com.rd.gestaoTransporte.domain.dto.TpCarroceriaDTO;
import br.com.rd.gestaoTransporte.repository.TpCarroceriaRepository;

@Transactional
@Repository
public class TpCarroceriaRepositoryImpl implements TpCarroceriaRepository{

	private static final org.slf4j.Logger log = LoggerFactory.getLogger(FornecedorRepositoryImpl.class);

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public TpCarroceriaDTO getTpCarroceriaById(Long cdTpCarroceria) throws SQLException, Throwable {
		try {
			StringBuilder sql = new StringBuilder(sqlSelectPrincipal)
					.append(" WHERE CD_TP_CARROCERIA = :cdTpCarroceria ");
			SqlParameterSource params = new MapSqlParameterSource().addValue("cdTpCarroceria", cdTpCarroceria);		
			return devolveObjeto(sql, params);
		} catch(SQLException e) {
			log.error("NÃO FOI POSSIVEL LOCALIZAR O TIPO DE CARROCERIA.",e.getSQLState());		
			return null;	
		}
	}

	@Override
	public List<TpCarroceriaDTO> getAllTpCarroceria() throws SQLException, Throwable {
		try {
			StringBuilder sql = new StringBuilder(sqlSelectPrincipal)
					.append(" ORDER BY CD_TP_CARROCERIA ");
			return devolveListaObjetos(sql, null);
		} catch(SQLException e) {
			log.error("ERRO NA EMISSÃO DA LISTA DE FORNECEDORES.",e.getSQLState());		
			return null;	
		}
	}

	final static StringBuilder sqlSelectPrincipal = new StringBuilder()
			.append(" SELECT ")
			.append(" CD_TP_CARROCERIA ")
			.append(" ,DS_TP_CARROCERIA ")
			.append(" FROM TB_TP_CARROCERIA ");
		
	private TpCarroceriaDTO  devolveObjeto(StringBuilder sql, SqlParameterSource params) throws Exception, Throwable {
		return jdbcTemplate.queryForObject(sql.toString(), params, (rs, i) -> {			
			TpCarroceriaDTO tpCarroceriaDTO = new TpCarroceriaDTO();
			tpCarroceriaDTO.setCdTpCarroceria(rs.getLong("CD_TP_CARROCERIA"));
			tpCarroceriaDTO.setDsTpCarroceria(rs.getString("DS_TP_CARROCERIA"));			
			return tpCarroceriaDTO;
		});
	}
	
	private List<TpCarroceriaDTO>  devolveListaObjetos(StringBuilder sql, SqlParameterSource params) throws Exception, Throwable {
		return jdbcTemplate.query(sql.toString(), params, (rs, i) -> {			
			TpCarroceriaDTO tpCarroceriaDTO = new TpCarroceriaDTO();
			tpCarroceriaDTO.setCdTpCarroceria(rs.getLong("CD_TP_CARROCERIA"));
			tpCarroceriaDTO.setDsTpCarroceria(rs.getString("DS_TP_CARROCERIA"));			
			return tpCarroceriaDTO;
		});
	}

}
