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

import br.com.rd.gestaoTransporte.domain.dto.EquipamentoFilialRotaDTO;
import br.com.rd.gestaoTransporte.repository.EmailDanfeRepository;

@Transactional
@Repository
public class EmailDanfeRepositoryImpl implements EmailDanfeRepository{

	private static final org.slf4j.Logger log =  LoggerFactory.getLogger(EmailDanfeRepositoryImpl.class);
	
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	int add =0;
	
	@Override
	public void addEquipamentoFilialRota(EquipamentoFilialRotaDTO equipamentoFilialRotaDTO) throws Exception, Throwable {
		
		getEquipamentoFilialRotaLastId();
		
		if(equipamentoFilialRotaDTO.isFlagAtivoBoolean()) {
			equipamentoFilialRotaDTO.setFlagAtivo(1);
		} else {
			equipamentoFilialRotaDTO.setFlagAtivo(0);
		}
				
		StringBuilder sql = new StringBuilder();			
		sql.append(" INSERT INTO ");
		sql.append(" TB_EQUIPAMENTO_FILIAL_ROTA (");
		sql.append(" CD_EQUIPAMENTO_FILIAL_ROTA, ");
		sql.append(" CD_EQUIPAMENTO, ");
		sql.append(" DS_EMAIL_FILIAL_ROTA, ");
		sql.append(" FL_ATIVO, ");
		sql.append(" CD_FILIAL_ROTA) ");
		sql.append(" VALUES (:codigoEquipamentoFilialRota, :codigoEquipamento, :descricaoEmailFilialRota, :flagAtivo, :tbFilialRota)");		
		SqlParameterSource params = new MapSqlParameterSource()
				.addValue("codigoEquipamentoFilialRota", Long.valueOf(add))
				.addValue("codigoEquipamento", equipamentoFilialRotaDTO.getCodigoEquipamento())
				.addValue("descricaoEmailFilialRota", equipamentoFilialRotaDTO.getDescricaoEmailFilialRota())
				.addValue("flagAtivo", equipamentoFilialRotaDTO.getFlagAtivo())
				.addValue("tbFilialRota", equipamentoFilialRotaDTO.getCdFilialRota());
		jdbcTemplate.update(sql.toString(), params);
		log.info("EQUIPAMENTO_FILIAL_ROTA INCLUIDO COM SUCESSO!");		
	}

	@Override
	public void updateEquipamentoFilialRota(EquipamentoFilialRotaDTO equipamentoFilialRotaDTO) throws Exception, Throwable {
		
		if(equipamentoFilialRotaDTO.isFlagAtivoBoolean()) {
			equipamentoFilialRotaDTO.setFlagAtivo(1);
		} else {
			equipamentoFilialRotaDTO.setFlagAtivo(2);
		}
		
		StringBuilder sql = new StringBuilder();
		sql.append(" UPDATE  TB_EQUIPAMENTO_FILIAL_ROTA ");
		sql.append(" SET ");
 	 	sql.append(" CD_EQUIPAMENTO = :codigoEquipamento, ");
 	 	sql.append(" DS_EMAIL_FILIAL_ROTA = :descricaoEmailFilialRota, ");
        sql.append(" FL_ATIVO = :flAtivo, ");
        sql.append(" CD_FILIAL_ROTA = :cdFilialRota ");
        sql.append(" WHERE  CD_EQUIPAMENTO_FILIAL_ROTA = :codigoEquipamentoFilialRota ");
        SqlParameterSource params = new MapSqlParameterSource()
    		 	.addValue("codigoEquipamentoFilialRota", equipamentoFilialRotaDTO.getCodigoEquipamentoFilialRota())
    		 	.addValue("codigoEquipamento", equipamentoFilialRotaDTO.getCodigoEquipamento())
    		 	.addValue("descricaoEmailFilialRota", equipamentoFilialRotaDTO.getDescricaoEmailFilialRota())
    		 	.addValue("flAtivo", equipamentoFilialRotaDTO.getFlagAtivo())
    		 	.addValue("cdFilialRota", equipamentoFilialRotaDTO.getCdFilialRota());    		 	
        jdbcTemplate.update(sql.toString(), params);
		log.info("EMAIL DANFE ATUALIZADO COM SUCESSO!");				
	}

	@Override
	public void deleteEquipamentoFilialRota(int idEquipamentoFilialRota) throws Exception, Throwable {		
		StringBuilder sql = new StringBuilder();
		sql.append(" DELETE FROM ");
		sql.append(" TB_EQUIPAMENTO_FILIAL_ROTA ");
		sql.append(" WHERE  CD_EQUIPAMENTO_FILIAL_ROTA = :codigoEquipamentoFilialRota ");
		SqlParameterSource params = new MapSqlParameterSource().addValue("codigoEquipamentoFilialRota", idEquipamentoFilialRota);
		jdbcTemplate.update(sql.toString(), params);
		log.info("EMAIL DANFE EXCLUIDO COM SUCESSO!");			
	}

	@Override
	public EquipamentoFilialRotaDTO getEquipamentoFilialRotaById(int idEquipamentoFilialRota) throws Exception, Throwable {
		try {
			StringBuilder sql = new StringBuilder(sqlSelectPrincipal);
			sql.append("  WHERE  T1.CD_EQUIPAMENTO_FILIAL_ROTA = :codigoEquipamentoFilialRota ");
			SqlParameterSource params = new MapSqlParameterSource().addValue("codigoEquipamentoFilialRota", idEquipamentoFilialRota);
			return devolveObjeto(sql, params);
		} catch(SQLException e) {
			log.error("NÃO FOI POSSIVEL LOCALIZAR O EMAIL DANFE.",e.getSQLState());
			return null;
		}		 
	}

	@Override
	public List<EquipamentoFilialRotaDTO> getAllEquipamentoFilialRota() throws Exception, Throwable {	
		try {
			StringBuilder sql = new StringBuilder(sqlSelectPrincipal)					
			.append(" ORDER BY T1.CD_EQUIPAMENTO_FILIAL_ROTA ");
			return devolveListaObjetos(sql, null);
		} catch(SQLException e) {
			log.error("ERRO NA EMISSÃO DA LISTA DE EMAIL DANFE",e.getSQLState());		
			return null;	
		}			
	}

	
	
	public EquipamentoFilialRotaDTO getEquipamentoFilialRotaLastId() throws SQLException, Throwable {		
		try {
			StringBuilder sql = new StringBuilder(sqlSelectLast)
			.append(" WHERE CD_EQUIPAMENTO_FILIAL_ROTA = (SELECT MAX(CD_EQUIPAMENTO_FILIAL_ROTA) FROM TB_EQUIPAMENTO_FILIAL_ROTA) ");
			SqlParameterSource params = new MapSqlParameterSource();
			return devolveObjetoLast(sql, params);
		} catch(SQLException e) {
			log.error("NÃO FOI POSSIVEL LOCALIZAR O ULTIMO EMAIL DANFE",e.getSQLState());
			return null;
		}		 
	}

	
	
	final static StringBuilder sqlSelectPrincipal = new StringBuilder()
			.append(" SELECT  ")
			.append(" T1.CD_EQUIPAMENTO_FILIAL_ROTA ")
			.append(" ,T1.CD_EQUIPAMENTO ")
			.append(" ,T1.DS_EMAIL_FILIAL_ROTA ")
			.append(" ,T1.FL_ATIVO ")
			.append(" ,T1.CD_FILIAL_ROTA ")
			.append(" ,T2.DS_FILIAL_ROTA ")
			.append(" FROM   TB_EQUIPAMENTO_FILIAL_ROTA T1 INNER JOIN TB_FILIAL_ROTA T2 ")
			.append(" ON T2.CD_FILIAL_ROTA = T1.CD_FILIAL_ROTA ");

	final static StringBuilder sqlSelectLast = new StringBuilder()
			.append(" SELECT CD_EQUIPAMENTO_FILIAL_ROTA FROM TB_EQUIPAMENTO_FILIAL_ROTA ");
	
	
	
	
	private EquipamentoFilialRotaDTO devolveObjeto(StringBuilder sql, SqlParameterSource params) 
			throws Exception, Throwable {
		return jdbcTemplate.queryForObject(sql.toString(), params, (rs, i) -> {
			
			EquipamentoFilialRotaDTO equipamentoFilialRotaDTO = new EquipamentoFilialRotaDTO();
			equipamentoFilialRotaDTO.setCodigoEquipamentoFilialRota(rs.getLong("CD_EQUIPAMENTO_FILIAL_ROTA"));
			equipamentoFilialRotaDTO.setFlagAtivo(rs.getInt("FL_ATIVO"));
			if (equipamentoFilialRotaDTO.getFlagAtivo() == 0) {
				equipamentoFilialRotaDTO.setFlagAtivoString("NÃO");
				equipamentoFilialRotaDTO.setFlagAtivoBoolean(false);
			} else {
				equipamentoFilialRotaDTO.setFlagAtivoString("SIM");
				equipamentoFilialRotaDTO.setFlagAtivoBoolean(true);
			}
			equipamentoFilialRotaDTO.setCodigoEquipamento(rs.getLong("CD_EQUIPAMENTO"));
			equipamentoFilialRotaDTO.setDescricaoEmailFilialRota(rs.getString("DS_EMAIL_FILIAL_ROTA"));	
			equipamentoFilialRotaDTO.setCdFilialRota(rs.getInt("CD_FILIAL_ROTA"));
			equipamentoFilialRotaDTO.setDescricaoFilialRota(rs.getString("DS_FILIAL_ROTA"));
			return equipamentoFilialRotaDTO;
		});
	}
	
	private List<EquipamentoFilialRotaDTO> devolveListaObjetos(StringBuilder sql, SqlParameterSource params) 
			throws Exception, Throwable {
		return jdbcTemplate.query(sql.toString(), params, (rs, i) -> {	
			
			EquipamentoFilialRotaDTO equipamentoFilialRotaDTO = new EquipamentoFilialRotaDTO();			
			equipamentoFilialRotaDTO.setCodigoEquipamentoFilialRota(rs.getLong("CD_EQUIPAMENTO_FILIAL_ROTA"));
			equipamentoFilialRotaDTO.setFlagAtivo(rs.getInt("FL_ATIVO"));
			if (equipamentoFilialRotaDTO.getFlagAtivo() == 0) {
				equipamentoFilialRotaDTO.setFlagAtivoString("NÃO");
				equipamentoFilialRotaDTO.setFlagAtivoBoolean(false);
			} else {
				equipamentoFilialRotaDTO.setFlagAtivoString("SIM");
				equipamentoFilialRotaDTO.setFlagAtivoBoolean(true);
			}
			equipamentoFilialRotaDTO.setCodigoEquipamento(rs.getLong("CD_EQUIPAMENTO"));
			equipamentoFilialRotaDTO.setDescricaoEmailFilialRota(rs.getString("DS_EMAIL_FILIAL_ROTA"));	
	  		equipamentoFilialRotaDTO.setCdFilialRota(rs.getInt("CD_FILIAL_ROTA"));
			equipamentoFilialRotaDTO.setDescricaoFilialRota(rs.getString("DS_FILIAL_ROTA"));
			return equipamentoFilialRotaDTO;
		});
	}
	
	
	private EquipamentoFilialRotaDTO devolveObjetoLast(StringBuilder sql, SqlParameterSource params) 
			throws Exception, Throwable {
		return jdbcTemplate.queryForObject(sql.toString(), params, (rs, i) -> {			
			EquipamentoFilialRotaDTO equipamentoFilialRotaDTO = new EquipamentoFilialRotaDTO();
			equipamentoFilialRotaDTO.setCodigoEquipamentoFilialRota(rs.getLong("CD_EQUIPAMENTO_FILIAL_ROTA"));				
				add = equipamentoFilialRotaDTO.getCodigoEquipamentoFilialRota().intValue();
				add = add+1;		
				return equipamentoFilialRotaDTO;
		});
	}

}
