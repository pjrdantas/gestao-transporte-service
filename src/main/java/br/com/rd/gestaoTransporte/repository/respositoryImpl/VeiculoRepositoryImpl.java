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

import br.com.rd.gestaoTransporte.domain.dto.VeiculoDTO;
import br.com.rd.gestaoTransporte.repository.VeiculoRepository;

@Transactional
@Repository
public class VeiculoRepositoryImpl implements VeiculoRepository {

	private static final org.slf4j.Logger log = LoggerFactory.getLogger(FornecedorRepositoryImpl.class);

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	int add =0;

	/**
	 * 
	 */
	@Override
	public void addVeiculo(VeiculoDTO veiculoDTO) throws Exception, Throwable {
		
		getVeiculoLastId();

		if(veiculoDTO.isFlagAtivoBoolean()) {
			veiculoDTO.setFlagAtivo(1);
		} else {
			veiculoDTO.setFlagAtivo(0);
		}
		
		StringBuilder sql = new StringBuilder();			
		sql.append(" INSERT INTO ");
		sql.append(" TB_VEICULO (");
		sql.append(" CD_VEICULO, ");
		sql.append(" DS_PLACA, ");		
		sql.append(" NR_TARA, ");
		sql.append(" MD_CAPACIDADE_KG, ");
		sql.append(" MD_CAPACIDADE_M3, ");
		sql.append(" DT_ANO_FABRICACAO, ");
		sql.append(" NR_RENAVAM, ");
		sql.append(" QT_VOLUMES_MEDIA, ");
		sql.append(" FL_ATIVO, ");
		sql.append(" CD_TP_VEICULO, ");
		sql.append(" CD_TP_CARROCERIA, ");
		sql.append(" CD_MONTADORA, ");
		sql.append(" CD_FORNECEDOR, ");
		sql.append(" ID_CIDADE, ");
		sql.append(" SG_ESTADO) ");
		sql.append(" VALUES (:codigoVeiculo, :descricaoPlaca, :numeroTara, :mdCapacidadeKG, :mdCapacidadeM3, :dataAnoFabricacao,"
				+ ":numeroRenavam, :qtVolumesMedia, :flagAtivo, :tbTipoVeiculo, :tbTipoCarroceria, :tbMontadora,"
				+ ":tbFornecedor, :tbCidade, :tbEstado)");
		
		SqlParameterSource params = new MapSqlParameterSource()
				.addValue("codigoVeiculo", veiculoDTO.getCodigoVeiculo())
				.addValue("descricaoPlaca", veiculoDTO.getDescricaoPlaca())
				.addValue("numeroTara", veiculoDTO.getNumeroTara())
				.addValue("mdCapacidadeKG", veiculoDTO.getMdCapacidadeKG())
				.addValue("mdCapacidadeM3", veiculoDTO.getMdCapacidadeM3())
				.addValue("dataAnoFabricacao", veiculoDTO.getDataAnoFabricacao())
				.addValue("numeroRenavam", veiculoDTO.getNumeroRenavam())
				.addValue("qtVolumesMedia", veiculoDTO.getQtVolumesMedia())
				.addValue("flAtivo", veiculoDTO.getFlagAtivo())
				.addValue("tbTipoVeiculo", veiculoDTO.getCdTpVeiculo())
				.addValue("tbTipoCarroceria", veiculoDTO.getCodigoTipoCarroceria())
				.addValue("tbMontadora", veiculoDTO.getCodigoMontadora())
				.addValue("tbFornecedor", veiculoDTO.getCdFornecedor())
				.addValue("tbCidade", veiculoDTO.getIdCidade())
				.addValue("sgEstado", veiculoDTO.getSgEstado());		
		jdbcTemplate.update(sql.toString(), params);
		log.info("VEICULO INCLUIDO COM SUCESSO!");	
		
	}

	/**
	 * 
	 */
	@Override
	public void updateVeiculo(VeiculoDTO veiculoDTO) throws Exception, Throwable {
		
		if(veiculoDTO.isFlagAtivoBoolean()) {
			veiculoDTO.setFlagAtivo(1);
		} else {
			veiculoDTO.setFlagAtivo(0);
		}
				
		StringBuilder sql = new StringBuilder();
		sql.append(" UPDATE  TB_VEICULO ");
		sql.append(" SET ");
 	 	sql.append(" NR_TARA = :numeroTara, ");
 	 	sql.append(" MD_CAPACIDADE_KG = :mdCapacidadeKG, ");
 	 	sql.append(" MD_CAPACIDADE_M3 = :mdCapacidadeM3, ");
 	 	sql.append(" DT_ANO_FABRICACAO = :dataAnoFabricacao, ");
 	 	sql.append(" NR_RENAVAM = :numeroRenavam, ");
 	 	sql.append(" QT_VOLUMES_MEDIA = :qtVolumesMedia, ");
        sql.append(" FL_ATIVO = :flAtivo, ");
        sql.append(" CD_TP_VEICULO = :cdTpVeiculo, ");
        sql.append(" CD_TP_CARROCERIA = :codigoTipoCarroceria, ");
        sql.append(" CD_MONTADORA = :codigoMontadora, ");
        sql.append(" CD_FORNECEDOR = :cdFornecedor, ");
        sql.append(" ID_CIDADE = :idCidade, ");
        sql.append(" SG_ESTADO = :sgEstado "); 		
	    sql.append(" WHERE  CD_VEICULO = :codigoVeiculo ");
	    SqlParameterSource params = new MapSqlParameterSource()
			 	.addValue("codigoVeiculo", veiculoDTO.getCodigoVeiculo())
			 	.addValue("numeroTara", veiculoDTO.getNumeroTara())
			 	.addValue("mdCapacidadeKG", veiculoDTO.getMdCapacidadeKG())
			 	.addValue("mdCapacidadeM3", veiculoDTO.getMdCapacidadeM3())
			 	.addValue("dataAnoFabricacao", veiculoDTO.getDataAnoFabricacao()) 
			 	.addValue("numeroRenavam", veiculoDTO.getNumeroRenavam())
			 	.addValue("qtVolumesMedia", veiculoDTO.getQtVolumesMedia())
			 	.addValue("flAtivo", veiculoDTO.getFlagAtivo())
			 	.addValue("cdTpVeiculo", veiculoDTO.getCdTpVeiculo())
			 	.addValue("codigoTipoCarroceria", veiculoDTO.getCodigoTipoCarroceria())
			 	.addValue("codigoMontadora", veiculoDTO.getCodigoMontadora())
			 	.addValue("cdFornecedor", veiculoDTO.getCdFornecedor())
			 	.addValue("idCidade", veiculoDTO.getIdCidade())
			 	.addValue("sgEstado", veiculoDTO.getSgEstado());
	    
	    jdbcTemplate.update(sql.toString(), params);
		log.info("VEICULO ATUALIZADO COM SUCESSO!");		
	   	    
	}

	
	/**
	 * 
	 */
	@Override
	public void deleteVeiculo(int codigoVeiculo) throws Exception, Throwable {
		StringBuilder sql = new StringBuilder();
		sql.append(" DELETE FROM ");
		sql.append(" TB_VEICULO ");
		sql.append(" WHERE  CD_VEICULO = :codigoVeiculo ");
		SqlParameterSource params = new MapSqlParameterSource().addValue("codigoVeiculo", codigoVeiculo);
		jdbcTemplate.update(sql.toString(), params);
		log.info("VEICULO EXCLUIDO COM SUCESSO!");	
		
	}

	
	/**
	 * 
	 */
	@Override
	public VeiculoDTO getVeiculoById(int codigoVeiculo) throws SQLException, Throwable {		 
		try {
			StringBuilder sql = new StringBuilder(sqlSelectPrincipal);
			sql.append("  WHERE  T1.CD_VEICULO = :codigoVeiculo ");
			SqlParameterSource params = new MapSqlParameterSource().addValue("codigoVeiculo", codigoVeiculo);
			return devolveObjeto(sql, params);
		} catch(SQLException e) {
			log.error("NÃO FOI POSSIVEL LOCALIZAR O VEICULO.",e.getSQLState());
			return null;
		}		
	}

	/**
	 * 
	 */
	@Override
	public List<VeiculoDTO> getAllVeiculo() throws SQLException, Throwable {
		try {
			StringBuilder sql = new StringBuilder(sqlSelectPrincipal)					
			.append(" ORDER BY T1.CD_VEICULO, T1.CD_FORNECEDOR   ");
			return devolveListaObjetos(sql, null);
		} catch(SQLException e) {
			log.error("ERRO NA EMISSÃO DA LISTA DE VEICULOS.",e.getSQLState());		
			return null;	
		}	
	}

	
	/**
	 * 
	 * @return
	 * @throws SQLException
	 * @throws Throwable
	 */
	public VeiculoDTO getVeiculoLastId() throws SQLException, Throwable {
		
		try {
			StringBuilder sql = new StringBuilder(sqlSelectLast)
			.append(" WHERE CD_VEICULO = (SELECT MAX(CD_VEICULO) FROM TB_VEICULO) ");
			SqlParameterSource params = new MapSqlParameterSource();
			return devolveObjetoLast(sql, params);
		} catch(SQLException e) {
			log.error("NÃO FOI POSSIVEL LOCALIZAR O ULTIMO VEICULO.",e.getSQLState());
			return null;
		}		 
	}

	
	
	
	final static StringBuilder sqlSelectPrincipal = new StringBuilder()
			.append(" SELECT  ")
			.append(" T1.CD_VEICULO ")
			.append(" ,T1.DS_PLACA ")
			.append(" ,T1.NR_TARA ")
			.append(" ,T1.MD_CAPACIDADE_KG ")
			.append(" ,T1.MD_CAPACIDADE_M3 ")
			.append(" ,T1.DT_ANO_FABRICACAO")
			.append(" ,T1.NR_RENAVAM")
			.append(" ,T1.QT_VOLUMES_MEDIA")
			.append(" ,T1.FL_ATIVO")						
			.append(" ,T2.CD_TP_VEICULO")
			.append(" ,T2.DS_TP_VEICULO")	
			.append(" ,T3.CD_TP_CARROCERIA")
			.append(" ,T3.DS_TP_CARROCERIA")
			.append(" ,T4.CD_MONTADORA")
			.append(" ,T4.DS_MARCA")
			.append(" ,T4.DS_MODELO")	
			.append(" ,T5.CD_FORNECEDOR")	
			.append(" ,T5.NM_FANTASIA")						
			.append(" ,T6.ID_CIDADE")
			.append(" ,T6.NM_CIDADE")
			.append(" ,T6.SG_ESTADO")				
			.append(" ,T7.DS_ESTADO")			
			.append(" FROM TB_VEICULO T1 ")
			.append(" INNER JOIN TB_TP_VEICULO T2 ")
			.append(" ON T2.CD_TP_VEICULO = T1.CD_TP_VEICULO ")
			.append(" INNER JOIN TB_TP_CARROCERIA T3 ")
			.append(" ON T3.CD_TP_CARROCERIA = T1.CD_TP_CARROCERIA ")			
			.append(" INNER JOIN TB_MONTADORA T4 ")
			.append(" ON T4.CD_MONTADORA = T1.CD_MONTADORA ")			
			.append(" INNER JOIN TB_FORNECEDOR T5 ")
			.append(" ON T5.CD_FORNECEDOR = T1.CD_FORNECEDOR ")			
			.append(" INNER JOIN TB_CIDADE T6 ")
			.append(" ON T6.ID_CIDADE = T1.ID_CIDADE ")			
			.append(" INNER JOIN TB_ESTADO T7 ")
			.append(" ON T7.SG_ESTADO = T1.SG_ESTADO ");

	final static StringBuilder sqlSelectLast = new StringBuilder()
			.append(" SELECT CD_VEICULO FROM TB_VEICULO ");

	
	/**
	 * 
	 * @param sql
	 * @param params
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	private VeiculoDTO devolveObjeto(StringBuilder sql, SqlParameterSource params) 
			throws Exception, Throwable {
		return jdbcTemplate.queryForObject(sql.toString(), params, (rs, i) -> {
			
			VeiculoDTO veiculoDTO = new VeiculoDTO();
			veiculoDTO.setCodigoVeiculo(rs.getLong("CD_VEICULO"));
			veiculoDTO.setDescricaoPlaca(rs.getString("DS_PLACA"));		
			veiculoDTO.setNumeroTara(rs.getDouble("NR_TARA"));		
			veiculoDTO.setMdCapacidadeKG(rs.getDouble("MD_CAPACIDADE_KG"));		
			veiculoDTO.setMdCapacidadeM3(rs.getDouble("MD_CAPACIDADE_M3"));		
			veiculoDTO.setDataAnoFabricacao(rs.getDate("DT_ANO_FABRICACAO"));		
			veiculoDTO.setNumeroRenavam(rs.getLong("NR_RENAVAM"));		
			veiculoDTO.setQtVolumesMedia(rs.getLong("QT_VOLUMES_MEDIA"));								
			veiculoDTO.setFlagAtivo(rs.getInt("FL_ATIVO"));			
			if (veiculoDTO.getFlagAtivo() == 0) {
				veiculoDTO.setFlagAtivoString("NÃO");
				veiculoDTO.setFlagAtivoBoolean(false);
			} else {  
				veiculoDTO.setFlagAtivoString("SIM");
				veiculoDTO.setFlagAtivoBoolean(true);
			}						
	 	    veiculoDTO.setCdTpVeiculo(rs.getLong("CD_TP_VEICULO"));		 
			veiculoDTO.setDsTpVeiculo(rs.getString("DS_TP_VEICULO"));
		  	veiculoDTO.setCodigoTipoCarroceria(rs.getLong("CD_TP_CARROCERIA"));  
			veiculoDTO.setDescricaoTipoCarroceria(rs.getString("DS_MARCA"));
		 	veiculoDTO.setCodigoMontadora(rs.getLong("CD_MONTADORA"));  
			veiculoDTO.setDescricaoMarca(rs.getString("DS_MARCA"));
			veiculoDTO.setDescricaoModelo(rs.getString("DS_MODELO"));
		 	veiculoDTO.setCdFornecedor(rs.getLong("CD_FORNECEDOR"));  
			veiculoDTO.setNmFantasia(rs.getString("NM_FANTASIA"));
		 	veiculoDTO.setIdCidade(rs.getLong("ID_CIDADE"));  
			veiculoDTO.setNomeCidade(rs.getString("NM_CIDADE"));
			veiculoDTO.setSgEstado(rs.getString("SG_ESTADO"));
			veiculoDTO.setDsEstado(rs.getString("DS_ESTADO"));   			
			return veiculoDTO;
		});
	}
	
	
	
	/**
	 * 
	 * @param sql
	 * @param params
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	private List<VeiculoDTO>  devolveListaObjetos(StringBuilder sql, SqlParameterSource params) 
			throws Exception, Throwable {
		return jdbcTemplate.query(sql.toString(), params, (rs, i) -> {	
			
			VeiculoDTO veiculoDTO = new VeiculoDTO();
			veiculoDTO.setCodigoVeiculo(rs.getLong("CD_VEICULO"));
			veiculoDTO.setDescricaoPlaca(rs.getString("DS_PLACA"));		
			veiculoDTO.setNumeroTara(rs.getDouble("NR_TARA"));		
			veiculoDTO.setMdCapacidadeKG(rs.getDouble("MD_CAPACIDADE_KG"));		
			veiculoDTO.setMdCapacidadeM3(rs.getDouble("MD_CAPACIDADE_M3"));		
			veiculoDTO.setDataAnoFabricacao(rs.getDate("DT_ANO_FABRICACAO"));		
			veiculoDTO.setNumeroRenavam(rs.getLong("NR_RENAVAM"));		
			veiculoDTO.setQtVolumesMedia(rs.getLong("QT_VOLUMES_MEDIA"));								
			veiculoDTO.setFlagAtivo(rs.getInt("FL_ATIVO"));			
			if (veiculoDTO.getFlagAtivo() == 0) {
				veiculoDTO.setFlagAtivoString("NÃO");
				veiculoDTO.setFlagAtivoBoolean(false);
			} else {  
				veiculoDTO.setFlagAtivoString("SIM");
				veiculoDTO.setFlagAtivoBoolean(true);
			}						
	 	    veiculoDTO.setCdTpVeiculo(rs.getLong("CD_TP_VEICULO"));		 
			veiculoDTO.setDsTpVeiculo(rs.getString("DS_TP_VEICULO"));
		  	veiculoDTO.setCodigoTipoCarroceria(rs.getLong("CD_TP_CARROCERIA"));  
			veiculoDTO.setDescricaoTipoCarroceria(rs.getString("DS_MARCA"));
		 	veiculoDTO.setCodigoMontadora(rs.getLong("CD_MONTADORA"));  
			veiculoDTO.setDescricaoMarca(rs.getString("DS_MARCA"));
			veiculoDTO.setDescricaoModelo(rs.getString("DS_MODELO"));
		 	veiculoDTO.setCdFornecedor(rs.getLong("CD_FORNECEDOR"));  
			veiculoDTO.setNmFantasia(rs.getString("NM_FANTASIA"));
		 	veiculoDTO.setIdCidade(rs.getLong("ID_CIDADE"));  
			veiculoDTO.setNomeCidade(rs.getString("NM_CIDADE"));
			veiculoDTO.setSgEstado(rs.getString("SG_ESTADO"));
			veiculoDTO.setDsEstado(rs.getString("DS_ESTADO"));   			
			return veiculoDTO;
		});
	}
	
	/**
	 * 
	 * @param sql
	 * @param params
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	private VeiculoDTO devolveObjetoLast(StringBuilder sql, SqlParameterSource params) 
			throws Exception, Throwable {
		return jdbcTemplate.queryForObject(sql.toString(), params, (rs, i) -> {			
				VeiculoDTO veiculoDTO = new VeiculoDTO();
				veiculoDTO.setCdTpVeiculo(rs.getLong("CD_TP_VEICULO"));					
				add = veiculoDTO.getCodigoVeiculo().intValue();
				add = add+1;		
				return veiculoDTO;
		});
	}
	
	

}
