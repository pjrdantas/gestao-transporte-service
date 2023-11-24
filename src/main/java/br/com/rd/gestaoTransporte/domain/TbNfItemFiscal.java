package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Entity
@Table(name="TB_NF_ITEM_FISCAL")
public class TbNfItemFiscal implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TbNfItemFiscalPK id;
	
	@Column(name="CD_CLAS_FISCAL")
	private String cdClasFiscal;

	@Column(name="CD_LISTA_PIS_COFINS")
	private BigDecimal cdListaPisCofins;

	@Column(name="CD_MODALIDADE_BASE_ICMS")
	private BigDecimal cdModalidadeBaseIcms;

	@Column(name="CD_MODALIDADE_BASE_ST")
	private BigDecimal cdModalidadeBaseSt;

	@Column(name="CD_MOTIVO_DESONERACAO")
	private BigDecimal cdMotivoDesoneracao;

	@Column(name="CD_TP_CALCULO_ICMS")
	private BigDecimal cdTpCalculoIcms;

	@Column(name="CD_TP_CALCULO_MODULO")
	private BigDecimal cdTpCalculoModulo;

	@Column(name="CDS_BENEFICIO_FISCAL")
	private String cdsBeneficioFiscal;

	@Column(name="CDS_CEST")
	private String cdsCest;

	@Column(name="DS_MOTIVO_ISENCAO")
	private String dsMotivoIsencao;

	@Column(name="PC_ACRES_CG_EFET")
	private BigDecimal pcAcresCgEfet;

	@Column(name="PC_ACRES_CG_EFET_CB")
	private BigDecimal pcAcresCgEfetCb;

	@Column(name="PC_ACRES_CG_FECOMP")
	private BigDecimal pcAcresCgFecomp;

	@Column(name="PC_ACRES_CG_IMPORTADO")
	private BigDecimal pcAcresCgImportado;

	@Column(name="PC_ACRESC_MARGEM_ST")
	private BigDecimal pcAcrescMargemSt;

	@Column(name="PC_ALIQ_CONSUMIDOR_FINAL")
	private BigDecimal pcAliqConsumidorFinal;

	@Column(name="PC_DESCONTO_NF_FORNECEDOR")
	private BigDecimal pcDescontoNfFornecedor;

	@Column(name="PC_DIFAL")
	private BigDecimal pcDifal;

	@Column(name="PC_ICMS_ANTEC_GARANT")
	private BigDecimal pcIcmsAntecGarant;

	@Column(name="PC_ICMS_CRED_OUTORGADO")
	private BigDecimal pcIcmsCredOutorgado;

	@Column(name="PC_ICMS_EFETIVO")
	private BigDecimal pcIcmsEfetivo;

	@Column(name="PC_ICMS_INT_FCP")
	private BigDecimal pcIcmsIntFcp;

	@Column(name="PC_ICMS_INT_SEM_FCP")
	private BigDecimal pcIcmsIntSemFcp;

	@Column(name="PC_ICMS_INTERNO_ST")
	private BigDecimal pcIcmsInternoSt;

	@Column(name="PC_ICMS_ITEM_FCP")
	private BigDecimal pcIcmsItemFcp;

	@Column(name="PC_ICMS_PROTEGIDO")
	private BigDecimal pcIcmsProtegido;

	@Column(name="PC_ICMS_RESP_DIR")
	private BigDecimal pcIcmsRespDir;

	@Column(name="PC_ICMS_RESP_DIR_OSIM")
	private BigDecimal pcIcmsRespDirOsim;

	@Column(name="PC_ICMS_SEM_FCP")
	private BigDecimal pcIcmsSemFcp;

	@Column(name="PC_ISS_ALIQUOTA")
	private BigDecimal pcIssAliquota;

	@Column(name="PC_IVA_ANTEC_GARANT")
	private BigDecimal pcIvaAntecGarant;

	@Column(name="PC_IVA_NF")
	private BigDecimal pcIvaNf;

	@Column(name="PC_MERC_DEVOLVIDA")
	private BigDecimal pcMercDevolvida;

	@Column(name="PC_RED_BASE_COMPRAS")
	private BigDecimal pcRedBaseCompras;

	@Column(name="PC_RED_BASE_ICMS")
	private BigDecimal pcRedBaseIcms;

	@Column(name="PC_RED_BASE_ICMS_ST")
	private BigDecimal pcRedBaseIcmsSt;

	@Column(name="PC_RED_BASE_SUBS_TRIBUTARIA")
	private BigDecimal pcRedBaseSubsTributaria;

	@Column(name="QT_ITEM")
	private BigDecimal qtItem;

	@Column(name="VL_BASE_ICMS_ANTEC_GARANT")
	private BigDecimal vlBaseIcmsAntecGarant;

	@Column(name="VL_BASE_ICMS_EFETIVO")
	private BigDecimal vlBaseIcmsEfetivo;

	@Column(name="VL_BASE_ICMS_ITEM_FCP")
	private BigDecimal vlBaseIcmsItemFcp;

	@Column(name="VL_BASE_ICMS_ITEM_ST_FCP")
	private BigDecimal vlBaseIcmsItemStFcp;

	@Column(name="VL_BASE_ICMS_ITEM_ST_FCP_ANT")
	private BigDecimal vlBaseIcmsItemStFcpAnt;

	@Column(name="VL_BASE_ICMS_ITEM_ST_FCP_GARE")
	private BigDecimal vlBaseIcmsItemStFcpGare;

	@Column(name="VL_BASE_ICMS_PROPRIO_ST")
	private BigDecimal vlBaseIcmsProprioSt;

	@Column(name="VL_BASE_ICMS_RESP_DIR")
	private BigDecimal vlBaseIcmsRespDir;

	@Column(name="VL_BASE_ICMS_ST_GARE")
	private BigDecimal vlBaseIcmsStGare;

	@Column(name="VL_BASE_ICMS_ST_SUBSTITUIDO")
	private BigDecimal vlBaseIcmsStSubstituido;

	@Column(name="VL_BASE_ICMS_SUBST_TRIBUTARIA")
	private BigDecimal vlBaseIcmsSubstTributaria;

	@Column(name="VL_BASE_ITEM_ICMS_SUBSTITUTO")
	private BigDecimal vlBaseItemIcmsSubstituto;

	@Column(name="VL_BASE_RED_ICMS")
	private BigDecimal vlBaseRedIcms;

	@Column(name="VL_BASE_RED_ICMS_ST")
	private BigDecimal vlBaseRedIcmsSt;

	@Column(name="VL_DIFAL")
	private BigDecimal vlDifal;

	@Column(name="VL_ICMS_ANTEC_GARANT")
	private BigDecimal vlIcmsAntecGarant;

	@Column(name="VL_ICMS_CRED_OUTORGADO")
	private BigDecimal vlIcmsCredOutorgado;

	@Column(name="VL_ICMS_DESONERADO")
	private BigDecimal vlIcmsDesonerado;

	@Column(name="VL_ICMS_EFETIVO")
	private BigDecimal vlIcmsEfetivo;

	@Column(name="VL_ICMS_INTERNO_ST")
	private BigDecimal vlIcmsInternoSt;

	@Column(name="VL_ICMS_ITEM_FCP")
	private BigDecimal vlIcmsItemFcp;

	@Column(name="VL_ICMS_ITEM_PROPRIO_FCP")
	private BigDecimal vlIcmsItemProprioFcp;

	@Column(name="VL_ICMS_ITEM_PROPRIO_SEM_FCP")
	private BigDecimal vlIcmsItemProprioSemFcp;

	@Column(name="VL_ICMS_ITEM_SEM_FCP")
	private BigDecimal vlIcmsItemSemFcp;

	@Column(name="VL_ICMS_ITEM_ST_ANT_SEM_FCP")
	private BigDecimal vlIcmsItemStAntSemFcp;

	@Column(name="VL_ICMS_ITEM_ST_FCP")
	private BigDecimal vlIcmsItemStFcp;

	@Column(name="VL_ICMS_ITEM_ST_FCP_ANT")
	private BigDecimal vlIcmsItemStFcpAnt;

	@Column(name="VL_ICMS_ITEM_ST_FCP_GARE")
	private BigDecimal vlIcmsItemStFcpGare;

	@Column(name="VL_ICMS_ITEM_ST_GARE_SEM_FCP")
	private BigDecimal vlIcmsItemStGareSemFcp;

	@Column(name="VL_ICMS_ITEM_ST_SEM_FCP")
	private BigDecimal vlIcmsItemStSemFcp;

	@Column(name="VL_ICMS_ITEM_SUBST_TRIBUTARIA")
	private BigDecimal vlIcmsItemSubstTributaria;

	@Column(name="VL_ICMS_ITEM_SUBSTITUTO")
	private BigDecimal vlIcmsItemSubstituto;

	@Column(name="VL_ICMS_PROPRIO_ST")
	private BigDecimal vlIcmsProprioSt;

	@Column(name="VL_ICMS_PROTEGIDO")
	private BigDecimal vlIcmsProtegido;

	@Column(name="VL_ICMS_RESP_DIR")
	private BigDecimal vlIcmsRespDir;

	@Column(name="VL_ICMS_ST_GARE")
	private BigDecimal vlIcmsStGare;

	@Column(name="VL_ICMS_ST_SUBSTITUIDO")
	private BigDecimal vlIcmsStSubstituido;

	@Column(name="VL_ICMS_SUBSTITUTO")
	private BigDecimal vlIcmsSubstituto;

	@Column(name="VL_ISS")
	private BigDecimal vlIss;

	@Column(name="VL_ISS_BASE_CALCULO")
	private BigDecimal vlIssBaseCalculo;

	@Column(name="VL_ITEM_CONTABIL")
	private BigDecimal vlItemContabil;

	@Column(name="VL_PAUTA")
	private BigDecimal vlPauta;

	@Column(name="VL_PRECO_FABRICA")
	private BigDecimal vlPrecoFabrica;

	@Column(name="VL_RED_ICMS")
	private BigDecimal vlRedIcms;

	@Column(name="VL_RED_ICMS_ST")
	private BigDecimal vlRedIcmsSt;

	@Column(name="VL_TOTAL_ITEM")
	private BigDecimal vlTotalItem;

	@Column(name="VL_TOTAL_ITEM_BRUTO")
	private BigDecimal vlTotalItemBruto;

	@Column(name="VL_TOTAL_ITEM_COM_ST")
	private BigDecimal vlTotalItemComSt;

	@Column(name="VL_UNITARIO_BRUTO")
	private BigDecimal vlUnitarioBruto;

	@OneToOne
	@JoinColumns({
		@JoinColumn(name="ID_NF", referencedColumnName="ID_NF", nullable = false, insertable = false, updatable = false),
		@JoinColumn(name="NR_NF_ITEM", referencedColumnName="NR_NF_ITEM", nullable = false, insertable = false, updatable = false)
		})
	private TbNfItem tbNfItem;

	@ManyToOne
	@JoinColumn(name="CD_PRODUTO", referencedColumnName="CD_PRODUTO", nullable = false, insertable = false, updatable = false)
	private TbProduto tbProduto;

	public TbNfItemFiscal() {
	}


}