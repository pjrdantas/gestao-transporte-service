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

import br.com.rd.gestaoTransporte.domain.dto.FornecedorDTO;
import br.com.rd.gestaoTransporte.repository.FornecedorRepository;

@Transactional
@Repository
public class FornecedorRepositoryImpl implements FornecedorRepository {

	private static final org.slf4j.Logger log = LoggerFactory.getLogger(FornecedorRepositoryImpl.class);

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Override
	public FornecedorDTO getFornecedorById(Long cdFornecedor) throws SQLException, Throwable {		
		try {
			StringBuilder sql = new StringBuilder(sqlSelectPrincipal)
					.append(" WHERE CD_FORNECEDOR = :codigoFornecedor ");
			SqlParameterSource params = new MapSqlParameterSource().addValue("codigoFornecedor", cdFornecedor);		
			return devolveObjeto(sql, params);
		} catch(SQLException e) {
			log.error("NÃO FOI POSSIVEL LOCALIZAR O FORNECEDOR.",e.getSQLState());		
			return null;	
		}
	}

	@Override
	public List<FornecedorDTO> getAllFornecedor() throws SQLException, Throwable {
		try {
			StringBuilder sql = new StringBuilder(sqlSelectPrincipal)
					.append(" WHERE CD_TP_FORNECEDOR IN (11, 12) AND FL_DELETADO = 0 ")
					.append(" ORDER BY CD_FORNECEDOR, CD_TP_FORNECEDOR ");
			return devolveListaObjetos(sql, null);
		} catch(SQLException e) {
			log.error("ERRO NA EMISSÃO DA LISTA DE FORNECEDORES.",e.getSQLState());		
			return null;	
		}
	}

	
		
	final static StringBuilder sqlSelectPrincipal = new StringBuilder()
			.append(" SELECT ")
			.append(" CD_FORNECEDOR ")
			.append(" ,NM_FANTASIA ")
			.append(" FROM TB_FORNECEDOR ");
		
	private FornecedorDTO  devolveObjeto(StringBuilder sql, SqlParameterSource params) throws Exception, Throwable {
		return jdbcTemplate.queryForObject(sql.toString(), params, (rs, i) -> {			
			FornecedorDTO fornecedorDTO = new FornecedorDTO();
			fornecedorDTO.setCdFornecedor(rs.getLong("CD_FORNECEDOR"));
			fornecedorDTO.setNmFantasia(rs.getString("NM_FANTASIA"));
			
			return fornecedorDTO;
		});
	}
	
	private List<FornecedorDTO>  devolveListaObjetos(StringBuilder sql, SqlParameterSource params) throws Exception, Throwable {
		return jdbcTemplate.query(sql.toString(), params, (rs, i) -> {			
			FornecedorDTO fornecedorDTO = new FornecedorDTO();
			fornecedorDTO.setCdFornecedor(rs.getLong("CD_FORNECEDOR"));
			fornecedorDTO.setNmFantasia(rs.getString("NM_FANTASIA"));
			
			return fornecedorDTO;
		});
	}

}
