package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Entity
@Table(name="TB_NF_ITEM")
public class TbNfItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TbNfItemPK id;

	@Column(name="CD_CAMPANHA_OFERTA")
	private BigDecimal cdCampanhaOferta;

	@Column(name="CD_CFO")
	private String cdCfo;

	@Column(name="CD_CRM_TIPO_PONTUACAO_PREMIADA")
	private BigDecimal cdCrmTipoPontuacaoPremiada;

	@Column(name="CD_CST_COFINS")
	private BigDecimal cdCstCofins;

	@Column(name="CD_CST_PIS")
	private BigDecimal cdCstPis;

	@Column(name="CD_EAN")
	private BigDecimal cdEan;

	@Column(name="CD_PBM")
	private BigDecimal cdPbm;

	@Column(name="CD_PRODUTO")
	private BigDecimal cdProduto;

	@Column(name="CD_TIPO_CR")
	private BigDecimal cdTipoCr;

	@Column(name="CD_TIPO_DESCONTO")
	private BigDecimal cdTipoDesconto;

	@Column(name="CD_TOTALIZADOR")
	private String cdTotalizador;

	@Column(name="CD_TP_SITUACAO_TRIBUTARIA")
	private String cdTpSituacaoTributaria;

	@Column(name="CD_TP_STATUS_NF_ITEM")
	private BigDecimal cdTpStatusNfItem;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_ATUALIZACAO")
	private Date dtAtualizacao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_EMISSAO")
	private Date dtEmissao;

	@Column(name="FL_CANCELADO")
	private BigDecimal flCancelado;

	@Column(name="FL_CUPONAVEL")
	private BigDecimal flCuponavel;

	@Column(name="FL_DESC_BOGOF")
	private BigDecimal flDescBogof;

	@Column(name="FL_DESC_CRM")
	private BigDecimal flDescCrm;

	@Column(name="FL_DESC_GERENCIA")
	private BigDecimal flDescGerencia;

	@Column(name="FL_OFERTA")
	private BigDecimal flOferta;

	@Column(name="FL_TROCA_GENERICO")
	private BigDecimal flTrocaGenerico;

	@Column(name="ID_AUTORIZACAO_CONTROLADO")
	private BigDecimal idAutorizacaoControlado;

	@Column(name="ID_AUTORIZACAO_CONTROLADO_ITEM")
	private BigDecimal idAutorizacaoControladoItem;

	@Column(name="ID_MEMORIA")
	private BigDecimal idMemoria;

	@Column(name="ID_SNCM_IUM")
	private BigDecimal idSncmIum;

	@Column(name="NR_AUTORIZACAO_ITEM")
	private String nrAutorizacaoItem;

	@Column(name="NR_CR")
	private String nrCr;

	@Column(name="NR_DEPENDENTE")
	private BigDecimal nrDependente;

	@Column(name="NR_NSR")
	private BigDecimal nrNsr;

	@Column(name="NR_NSU")
	private BigDecimal nrNsu;

	@Column(name="NR_PEDIDO_ENCOMENDA")
	private BigDecimal nrPedidoEncomenda;

	@Column(name="PC_COFINS")
	private BigDecimal pcCofins;

	@Column(name="PC_ICMS_ITEM")
	private BigDecimal pcIcmsItem;

	@Column(name="PC_ICMS_ITEM_ST")
	private BigDecimal pcIcmsItemSt;

	@Column(name="PC_IPI_ITEM")
	private BigDecimal pcIpiItem;

	@Column(name="PC_PIS")
	private BigDecimal pcPis;

	@Column(name="QT_CONSIGNACAO")
	private BigDecimal qtConsignacao;

	@Column(name="QT_CONTAGEM_RAIA")
	private BigDecimal qtContagemRaia;

	@Column(name="QT_CUPOM")
	private BigDecimal qtCupom;

	@Column(name="QT_ENCOMENDA")
	private BigDecimal qtEncomenda;

	@Column(name="QT_INDISPONIVEL")
	private BigDecimal qtIndisponivel;

	@Column(name="QT_ITEM")
	private BigDecimal qtItem;

	@Column(name="QT_PONTOS")
	private BigDecimal qtPontos;

	@Column(name="VL_BASE_COFINS")
	private BigDecimal vlBaseCofins;

	@Column(name="VL_BASE_ICMS_ITEM")
	private BigDecimal vlBaseIcmsItem;

	@Column(name="VL_BASE_ICMS_PROPRIO_ST")
	private BigDecimal vlBaseIcmsProprioSt;

	@Column(name="VL_BASE_ICMS_SUBST_TRIB_ESP")
	private BigDecimal vlBaseIcmsSubstTribEsp;

	@Column(name="VL_BASE_ICMS_SUBST_TRIBUTARIA")
	private BigDecimal vlBaseIcmsSubstTributaria;

	@Column(name="VL_BASE_PIS")
	private BigDecimal vlBasePis;

	@Column(name="VL_BASE_REDUZIDA")
	private BigDecimal vlBaseReduzida;

	@Column(name="VL_COFINS")
	private BigDecimal vlCofins;

	@Column(name="VL_CUSTO_UNITARIO")
	private BigDecimal vlCustoUnitario;

	@Column(name="VL_DEPOSITO_ICMS_ST_RETIDO_ESP")
	private BigDecimal vlDepositoIcmsStRetidoEsp;

	@Column(name="VL_DESC_FIN_PBM")
	private BigDecimal vlDescFinPbm;

	@Column(name="VL_DESC_ITEM")
	private BigDecimal vlDescItem;

	@Column(name="VL_DESC_ITEM_PBM")
	private BigDecimal vlDescItemPbm;

	@Column(name="VL_DESC_UNIT_GERENCIA")
	private BigDecimal vlDescUnitGerencia;

	@Column(name="VL_FRETE")
	private BigDecimal vlFrete;

	@Column(name="VL_ICMS_ITEM")
	private BigDecimal vlIcmsItem;

	@Column(name="VL_ICMS_ITEM_SUBST_TRIB_ESP")
	private BigDecimal vlIcmsItemSubstTribEsp;

	@Column(name="VL_ICMS_ITEM_SUBST_TRIBUTARIA")
	private BigDecimal vlIcmsItemSubstTributaria;

	@Column(name="VL_ICMS_PROPRIO_ST")
	private BigDecimal vlIcmsProprioSt;

	@Column(name="VL_ICMS_PROPRIO_ST_ESP")
	private BigDecimal vlIcmsProprioStEsp;

	@Column(name="VL_ICMSINTERNO_ST")
	private BigDecimal vlIcmsinternoSt;

	@Column(name="VL_IPI_ITEM")
	private BigDecimal vlIpiItem;

	@Column(name="VL_OUTRAS_DESPESAS")
	private BigDecimal vlOutrasDespesas;

	@Column(name="VL_PBM_REEMBOLSO_ITEM")
	private BigDecimal vlPbmReembolsoItem;

	@Column(name="VL_PBM_REPOSICAO")
	private BigDecimal vlPbmReposicao;

	@Column(name="VL_PBM_SUBSIDIO")
	private BigDecimal vlPbmSubsidio;

	@Column(name="VL_PIS")
	private BigDecimal vlPis;

	@Column(name="VL_REPASSE")
	private BigDecimal vlRepasse;

	@Column(name="VL_REPASSE_ICMS_ST")
	private BigDecimal vlRepasseIcmsSt;

	@Column(name="VL_REPASSE_ICMS_ST_ESP")
	private BigDecimal vlRepasseIcmsStEsp;

	@Column(name="VL_REPASSE_PBM")
	private BigDecimal vlRepassePbm;

	@Column(name="VL_SUBSIDIO_EMPRESA_ITEM")
	private BigDecimal vlSubsidioEmpresaItem;

	@Column(name="VL_TOTAL_ITEM")
	private BigDecimal vlTotalItem;

	@Column(name="VL_UNITARIO")
	private BigDecimal vlUnitario;

	@Column(name="VL_UNITARIO_BRUTO")
	private BigDecimal vlUnitarioBruto;

	@OneToOne(mappedBy="tbNfItem")
	private TbNfItemCompl tbNfItemCompl;

	@OneToOne(mappedBy="tbNfItem")
	private TbNfItemFiscal tbNfItemFiscal;

	@OneToMany(mappedBy="tbNfItem")
	private List<TbNfItemLote> tbNfItemLotes;

	@OneToMany(mappedBy="tbNfItem")
	private List<TbRegistroProduto> tbRegistroProdutos;

	public TbNfItem() {
	}

}