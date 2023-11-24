package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;


@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Entity
@Table(name="TB_NF_COMPLE_UNICA")
public class TbNfCompleUnica implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_NF")
	private Long idNf;

	@Column(name="CD_CFO")
	private String cdCfo;

	@Column(name="CD_CONDICAO_PAGTO")
	private BigDecimal cdCondicaoPagto;

	@Column(name="CD_NF_ORIGEM")
	private BigDecimal cdNfOrigem;

	@Column(name="CD_NF_ST_ATUALIZACAO")
	private BigDecimal cdNfStAtualizacao;

	@Column(name="CD_TRANSPORTADOR")
	private BigDecimal cdTransportador;

	@Column(name="CDS_CHAVE_ACESSO_NFE_ORIGEM")
	private String cdsChaveAcessoNfeOrigem;

	@Column(name="DS_ESPECIE_VOLUMES")
	private String dsEspecieVolumes;

	@Column(name="DS_OBS_COMPLE")
	private String dsObsComple;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_ATUALIZACAO")
	private Date dtAtualizacao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_EMISSAO")
	private Date dtEmissao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_ENTRADA")
	private Date dtEntrada;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_GERACAO_PRE_NOTA")
	private Date dtGeracaoPreNota;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_HORA_FIM_CONTAGEM")
	private Date dtHoraFimContagem;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_HORA_INICIO_CONTAGEM")
	private Date dtHoraInicioContagem;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_MOVTO_CONTABIL")
	private Date dtMovtoContabil;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_REGISTRO_PIN")
	private Date dtRegistroPin;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_SAIDA")
	private Date dtSaida;

	@Column(name="FL_CANCELADO")
	private BigDecimal flCancelado;

	@Column(name="FL_DEDUZ_DESONERADO")
	private BigDecimal flDeduzDesonerado;

	@Column(name="FL_IMPRESSO")
	private BigDecimal flImpresso;

	@Column(name="FL_INCIDE_ICM")
	private BigDecimal flIncideIcm;

	@Column(name="FL_INCIDE_IPI")
	private BigDecimal flIncideIpi;

	@Column(name="FL_INCIDE_ISS")
	private BigDecimal flIncideIss;

	@Column(name="FL_SUBST_TRIBUT")
	private BigDecimal flSubstTribut;

	@Column(name="ID_NF_COMPRA")
	private BigDecimal idNfCompra;

	@Column(name="MD_PESO_BRUTO_KG")
	private BigDecimal mdPesoBrutoKg;

	@Column(name="MD_PESO_LIQUIDO_KG")
	private BigDecimal mdPesoLiquidoKg;

	@Column(name="NR_CAIXA_FORNECEDOR")
	private String nrCaixaFornecedor;

	@Column(name="NR_CAMINHAO")
	private String nrCaminhao;

	@Column(name="NR_CAMINHAO_UF")
	private String nrCaminhaoUf;

	@Column(name="NR_FRETE_POR_CONTA")
	private BigDecimal nrFretePorConta;

	@Column(name="NR_LOTE_FATURAMENTO")
	private BigDecimal nrLoteFaturamento;

	@Column(name="NR_LOTE_FISCAL")
	private BigDecimal nrLoteFiscal;

	@Column(name="NR_OEE")
	private BigDecimal nrOee;

	@Column(name="NR_ORDEM_SERVICO")
	private BigDecimal nrOrdemServico;

	@Column(name="NR_PIN_SUFRAMA")
	private BigDecimal nrPinSuframa;

	@Column(name="NR_PRE_NOTA")
	private BigDecimal nrPreNota;

	@Column(name="NR_SEQUENCIA_ATUALIZACAO")
	private BigDecimal nrSequenciaAtualizacao;

	@Column(name="PC_ACRESCIMO_BASE_CALCULO")
	private BigDecimal pcAcrescimoBaseCalculo;

	@Column(name="PC_DESC_ADICIONAL")
	private BigDecimal pcDescAdicional;

	@Column(name="PC_RED_BASE")
	private BigDecimal pcRedBase;

	@Column(name="QT_VOLUMES")
	private BigDecimal qtVolumes;

	@Column(name="QT_VOLUMES_CONFERENCIA")
	private BigDecimal qtVolumesConferencia;

	@Column(name="SG_FRETE_POR_CONTA")
	private String sgFretePorConta;

	@Column(name="VL_BASE_ICMS_ST_COMPRA")
	private BigDecimal vlBaseIcmsStCompra;

	@Column(name="VL_DIFERENCA_BONIF_REMARCACAO")
	private BigDecimal vlDiferencaBonifRemarcacao;

	@Column(name="VL_ICMS_ST_COMPRA")
	private BigDecimal vlIcmsStCompra;

	@Column(name="VL_OUTRAS_DESPESAS")
	private BigDecimal vlOutrasDespesas;

	@Column(name="VL_SINAL_ESTOQUE_DESTINO")
	private BigDecimal vlSinalEstoqueDestino;

	@Column(name="VL_SINAL_ESTOQUE_INDISP_DESTIN")
	private BigDecimal vlSinalEstoqueIndispDestin;

	@Column(name="VL_TOTAL_APOS_MARGEM")
	private BigDecimal vlTotalAposMargem;

	@Column(name="VL_TOTAL_BASECALC_ST")
	private BigDecimal vlTotalBasecalcSt;

	@Column(name="VL_TOTAL_DESCONTO")
	private BigDecimal vlTotalDesconto;

	@Column(name="VL_TOTAL_DESCONTO_ST")
	private BigDecimal vlTotalDescontoSt;

	@Column(name="VL_TOTAL_ICMS")
	private BigDecimal vlTotalIcms;

	@Column(name="VL_TOTAL_ICMS_PROPRIO")
	private BigDecimal vlTotalIcmsProprio;

	@Column(name="VL_TOTAL_ICMS_RETIDO_ST")
	private BigDecimal vlTotalIcmsRetidoSt;

	@Column(name="VL_TOTAL_ICMSINTERNO_ST")
	private BigDecimal vlTotalIcmsinternoSt;

	@Column(name="VL_TOTAL_IPI")
	private BigDecimal vlTotalIpi;

	@Column(name="VL_TOTAL_LIQ_SEM_REPASSE_ST")
	private BigDecimal vlTotalLiqSemRepasseSt;

	@Column(name="VL_TOTAL_MARGEM")
	private BigDecimal vlTotalMargem;

	@Column(name="VL_TOTAL_NOTA_REPASSE")
	private BigDecimal vlTotalNotaRepasse;

	@Column(name="VL_TOTAL_REPASSE_ICMS_ST")
	private BigDecimal vlTotalRepasseIcmsSt;

	
	@ManyToOne
	@JoinColumn(name="CD_FILIAL_DESTINO")
	private TbFilial tbFilial;

	
	@ManyToOne
	@JoinColumn(name="CD_FILIAL_ROTA", referencedColumnName="CD_FILIAL_ROTA", nullable = false, insertable = false, updatable = false)
	private TbFilialRota tbFilialRota;

	
	@ManyToOne
	@JoinColumn(name="CD_FORNECEDOR")
	private TbFornecedor tbFornecedor;


	@ManyToOne
	@JoinColumn(name="ID_NF_TRANSPORTE")
	private TbNfTransporte tbNfTransporte;


	@ManyToOne
	@JoinColumn(name="CD_OPERADOR_CONTAGEM")
	private TbOperador tbOperador1;


	@ManyToOne
	@JoinColumn(name="CD_OPERADOR_ENTRADA")
	private TbOperador tbOperador2;

	public TbNfCompleUnica() {
	}


}