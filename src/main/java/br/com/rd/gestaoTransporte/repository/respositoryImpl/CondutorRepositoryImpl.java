package br.com.rd.gestaoTransporte.repository.respositoryImpl;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import br.com.rd.gestaoTransporte.domain.dto.CondutorDTO;
import br.com.rd.gestaoTransporte.repository.CondutorRepository;

@Transactional
@Repository
public class CondutorRepositoryImpl implements CondutorRepository{
	
	private static final org.slf4j.Logger log =  LoggerFactory.getLogger(CondutorRepositoryImpl.class);
	
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	int add =0;
		
	@Override
	public void addCondutor(CondutorDTO condutorDTO) throws Exception, Throwable {
				
		getCondutorLastId();
		
		if(condutorDTO.isFlagAtivoBoolean()) {
			condutorDTO.setFlagAtivo(1);
		} else {
			condutorDTO.setFlagAtivo(2);
		}
				
		String troca = condutorDTO.getNumeroCpf().replace("/", "");		

		troca =troca.replace(".", "");		
		condutorDTO.setNumeroCpf(troca);
		
		StringBuilder sql = new StringBuilder();			
		sql.append(" INSERT INTO ");
		sql.append(" TB_CONDUTOR (");
		sql.append(" CD_CONDUTOR, ");
		sql.append(" DT_CADASTRO, ");		
		sql.append(" FL_ATIVO, ");
		sql.append(" NM_CONDUTOR, ");
		sql.append(" NR_CNH, ");
		sql.append(" NR_CPF, ");
		sql.append(" CD_FORNECEDOR) ");
		sql.append(" VALUES (:cdCondutor, :dtCadastro, :flAtivo, :nmCondutor, :nrCnh, :nrCpf, :tbFornecedor)");		
		SqlParameterSource params = new MapSqlParameterSource()
				.addValue("cdCondutor", Long.valueOf(add))
				.addValue("dtCadastro", new Date())
				.addValue("flAtivo", condutorDTO.getFlagAtivo())
				.addValue("nmCondutor", condutorDTO.getNmCondutor())
				.addValue("nrCnh", condutorDTO.getNumeroCnh())
				.addValue("nrCpf", Long.valueOf(condutorDTO.getNumeroCpf()))
				.addValue("tbFornecedor", condutorDTO.getCdFornecedor());		
		jdbcTemplate.update(sql.toString(), params);
		log.info("CONDUTOR INCLUIDO COM SUCESSO!");		
	}

	@Override
	public void updateCondutor(CondutorDTO condutorDTO) throws Exception, Throwable {
						
		if(condutorDTO.isFlagAtivoBoolean()) {
			condutorDTO.setFlagAtivo(1);
		} else {
			condutorDTO.setFlagAtivo(2);
		}
		
		String troca = condutorDTO.getNumeroCpf().replace("/", "");		
		troca =troca.replace(".", "");				
		condutorDTO.setNumeroCpf(troca);
	 	 
		StringBuilder sql = new StringBuilder();
		sql.append(" UPDATE  TB_CONDUTOR ");
		sql.append(" SET ");
 	 	sql.append(" CD_FORNECEDOR = :cdFornecedor, ");
        sql.append(" FL_ATIVO = :flAtivo, ");
 		sql.append(" NM_CONDUTOR = :nmCondutor,  ");
	  	sql.append(" NR_CNH = :nrCnh,  ");
	    sql.append(" NR_CPF = :nrCpf ");
		sql.append(" WHERE  CD_CONDUTOR = :cdCondutor ");
		SqlParameterSource params = new MapSqlParameterSource()
		 	.addValue("cdCondutor", condutorDTO.getCdCondutor())
 		 	.addValue("cdFornecedor", condutorDTO.getCdFornecedor()) 
    	 	.addValue("flAtivo", condutorDTO.getFlagAtivo())
		 	.addValue("nmCondutor", condutorDTO.getNmCondutor())  
		 	.addValue("nrCnh", condutorDTO.getNumeroCnh())   
		  	.addValue("nrCpf", Long.valueOf(condutorDTO.getNumeroCpf()));			
		jdbcTemplate.update(sql.toString(), params);
		log.info("CONDUTOR ATUALIZADO COM SUCESSO!");		
	}
	
	@Override
	public void deleteCondutor(int cdCondutor) throws Exception, Throwable {
		StringBuilder sql = new StringBuilder();
		sql.append(" DELETE FROM ");
		sql.append(" TB_CONDUTOR ");
		sql.append(" WHERE  CD_CONDUTOR = :cdCondutor ");
		SqlParameterSource params = new MapSqlParameterSource().addValue("cdCondutor", cdCondutor);
		jdbcTemplate.update(sql.toString(), params);
		log.info("CONDUTOR EXCLUIDO COM SUCESSO.");	
	}


	@Override
	public CondutorDTO getCondutorById(int cdCondutor) throws SQLException, Throwable {		
		try {
			StringBuilder sql = new StringBuilder(sqlSelectPrincipal);
			sql.append("  WHERE  T1.CD_CONDUTOR = :cdCondutor ");
			SqlParameterSource params = new MapSqlParameterSource().addValue("cdCondutor", cdCondutor);
			return devolveObjeto(sql, params);
		} catch(SQLException e) {
			log.error("NÃO FOI POSSIVEL LOCALIZAR O CONDUTOR.",e.getSQLState());
			return null;
		}		 
	}

	@Override
	public List<CondutorDTO> getAllCondutor() throws SQLException, Throwable {		
		try {
			StringBuilder sql = new StringBuilder(sqlSelectPrincipal)					
			.append(" ORDER BY T1.CD_CONDUTOR ");
			return devolveListaObjetos(sql, null);
		} catch(SQLException e) {
			log.error("ERRO NA EMISSÃO DA LISTA DE CONDUTORES.",e.getSQLState());		
			return null;	
		}			
	}

	 
	public CondutorDTO getCondutorLastId() throws SQLException, Throwable {		
		try {
			StringBuilder sql = new StringBuilder(sqlSelectLast)
			.append(" WHERE CD_CONDUTOR = (SELECT MAX(CD_CONDUTOR) FROM TB_CONDUTOR) ");
			SqlParameterSource params = new MapSqlParameterSource();
			return devolveObjetoLast(sql, params);
		} catch(SQLException e) {
			log.error("NÃO FOI POSSIVEL LOCALIZAR O ULTIMO CONDUTOR.",e.getSQLState());
			return null;
		}		 
	}
	
	
	
	
	final static StringBuilder sqlSelectPrincipal = new StringBuilder()
			.append(" SELECT  ")
			.append(" T1.CD_CONDUTOR ")
			.append(" ,T1.NM_CONDUTOR ")
			.append(" ,T1.NR_CPF ")
			.append(" ,T1.FL_ATIVO ")
			.append(" ,T1.NR_CNH ")
			.append(" ,T1.CD_FORNECEDOR")
			.append(" ,T2.NM_FANTASIA")
			.append(" FROM   TB_CONDUTOR T1 INNER JOIN TB_FORNECEDOR T2 ")
			.append(" ON T2.CD_FORNECEDOR = T1.CD_FORNECEDOR ");
	
	
	final static StringBuilder sqlSelectLast = new StringBuilder()
			.append(" SELECT CD_CONDUTOR FROM TB_CONDUTOR ");
				
	
	private CondutorDTO devolveObjeto(StringBuilder sql, SqlParameterSource params) 
			throws Exception, Throwable {
		return jdbcTemplate.queryForObject(sql.toString(), params, (rs, i) -> {
			CondutorDTO condutorDTO = new CondutorDTO();
			condutorDTO.setCdCondutor(rs.getLong("CD_CONDUTOR"));
			condutorDTO.setFlagAtivo(rs.getInt("FL_ATIVO"));
			if (condutorDTO.getFlagAtivo() == 2) {
				condutorDTO.setFlagAtivoString("NÃO");
				condutorDTO.setFlagAtivoBoolean(false);
			} else {
				condutorDTO.setFlagAtivoString("SIM");
				condutorDTO.setFlagAtivoBoolean(true);
			}
			condutorDTO.setNmCondutor(rs.getString("NM_CONDUTOR"));
			condutorDTO.setNumeroCnh(String.valueOf(rs.getLong("NR_CNH")));	
			condutorDTO.setNumeroCpf(String.valueOf(rs.getLong("NR_CPF")));
			condutorDTO.setCdFornecedor(rs.getLong("CD_FORNECEDOR"));
			condutorDTO.setNmFornecedor(rs.getString("NM_FANTASIA"));
			return condutorDTO;
		});
	}
	
	private List<CondutorDTO>  devolveListaObjetos(StringBuilder sql, SqlParameterSource params) 
			throws Exception, Throwable {
		return jdbcTemplate.query(sql.toString(), params, (rs, i) -> {	
			
			CondutorDTO condutorDTO = new CondutorDTO();
			condutorDTO.setCdCondutor(rs.getLong("CD_CONDUTOR"));
			condutorDTO.setFlagAtivo(rs.getInt("FL_ATIVO"));
			if (condutorDTO.getFlagAtivo() == 2) {
				condutorDTO.setFlagAtivoString("NÃO");
				condutorDTO.setFlagAtivoBoolean(false);
			} else {  
				condutorDTO.setFlagAtivoString("SIM");
				condutorDTO.setFlagAtivoBoolean(true);
			}
		 	condutorDTO.setNmCondutor(rs.getString("NM_CONDUTOR"));		 			 	
		 	String teste = String.valueOf(rs.getLong("NR_CNH"));			 	
		 	teste = StringUtils.leftPad(teste, 11, "0");
		 	condutorDTO.setNumeroCnh(teste);			 			 	
			condutorDTO.setNumeroCpf(String.valueOf(rs.getLong("NR_CPF")));
		 	condutorDTO.setCdFornecedor(rs.getLong("CD_FORNECEDOR")); 
			condutorDTO.setNmFornecedor(rs.getString("NM_FANTASIA"));
			return condutorDTO;
		});
	}
	
	
	private CondutorDTO devolveObjetoLast(StringBuilder sql, SqlParameterSource params) 
			throws Exception, Throwable {
		return jdbcTemplate.queryForObject(sql.toString(), params, (rs, i) -> {			
				CondutorDTO condutorDTO = new CondutorDTO();
				condutorDTO.setCdCondutor(rs.getLong("CD_CONDUTOR"));				
				add = condutorDTO.getCdCondutor().intValue();
				add = add+1;		
				return condutorDTO;
		});
	}

}
