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
@Table(name="TB_NF")
public class TbNf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TB_NF_IDNF_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_NF_IDNF_GENERATOR")
	@Column(name="ID_NF")
	private Long idNf;

	@Column(name="CD_CAMPANHA")
	private BigDecimal cdCampanha;

	@Column(name="CD_CHAVE_ACESSO_NFE")
	private String cdChaveAcessoNfe;

	@Column(name="CD_CREDENCIADA")
	private BigDecimal cdCredenciada;

	@Column(name="CD_EMPRESA_VENDA_VINCULADA")
	private BigDecimal cdEmpresaVendaVinculada;

	@Column(name="CD_ENT_FILANT")
	private BigDecimal cdEntFilant;

	@Column(name="CD_FORMA_PAGTO")
	private BigDecimal cdFormaPagto;

	@Column(name="CD_MOTIVO_TRANSFERENCIA")
	private BigDecimal cdMotivoTransferencia;

	@Column(name="CD_NFE_TP_SERIE")
	private BigDecimal cdNfeTpSerie;

	@Column(name="CD_OPERACAO_FISCAL")
	private BigDecimal cdOperacaoFiscal;

	@Column(name="CD_OPERADOR")
	private BigDecimal cdOperador;

	@Column(name="CD_OPERADOR_VENDA")
	private BigDecimal cdOperadorVenda;

	@Column(name="CD_ORIGEM_NF")
	private BigDecimal cdOrigemNf;

	@Column(name="CD_PBR")
	private BigDecimal cdPbr;

	@Column(name="CD_RESPOSTA_PESQUISA")
	private BigDecimal cdRespostaPesquisa;

	@Column(name="CD_TELEVENDA")
	private BigDecimal cdTelevenda;

	@Column(name="CD_TIPO_GLOSA")
	private BigDecimal cdTipoGlosa;

	@Column(name="CD_TIPO_GLOSA_PBMR")
	private BigDecimal cdTipoGlosaPbmr;

	@Column(name="CD_TIPO_PDV")
	private BigDecimal cdTipoPdv;

	@Column(name="CD_TIPO_TRANSACAO")
	private BigDecimal cdTipoTransacao;

	@Column(name="CD_TOTALIZADOR")
	private String cdTotalizador;

	@Column(name="CD_TP_CUPOM")
	private BigDecimal cdTpCupom;

	@Column(name="CD_TP_NF")
	private BigDecimal cdTpNf;

	@Column(name="CD_TP_REGISTRO")
	private BigDecimal cdTpRegistro;

	@Column(name="CD_TP_TRIB_CLIENTE")
	private BigDecimal cdTpTribCliente;

	@Column(name="CD_TRANSACAO_CLIENTE")
	private BigDecimal cdTransacaoCliente;

	@Column(name="CDS_PEDIDO_CLIENTE")
	private String cdsPedidoCliente;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_ATUALIZACAO")
	private Date dtAtualizacao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_CREDENCIADA_FECHAMENTO")
	private Date dtCredenciadaFechamento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_CREDENCIADA_FECHTO")
	private Date dtCredenciadaFechto;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_EMISSAO")
	private Date dtEmissao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_ESTORNO_GLOSA_CONVENIO")
	private Date dtEstornoGlosaConvenio;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_FATURAMENTO")
	private Date dtFaturamento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_FECHTO")
	private Date dtFechto;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_FECHTO_CREDENCIADA")
	private Date dtFechtoCredenciada;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_GLOSA_CONVENIO")
	private Date dtGlosaConvenio;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_GLOSA_PBM_REPASSE")
	private Date dtGlosaPbmRepasse;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_GLOSA_PBM_SUBSIDIO")
	private Date dtGlosaPbmSubsidio;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_REGULARIZACAO_STATUS")
	private Date dtRegularizacaoStatus;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_SNCM_REGISTRO_EVENTO")
	private Date dtSncmRegistroEvento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_TIMESTAMP")
	private Date dtTimestamp;

	@Column(name="FL_VENDA_RG")
	private BigDecimal flVendaRg;

	@Column(name="ID_CLIENTE")
	private BigDecimal idCliente;

	@Column(name="NR_AUTORIZACAO")
	private BigDecimal nrAutorizacao;

	@Column(name="NR_AUTORIZACAO_PBM")
	private BigDecimal nrAutorizacaoPbm;

	@Column(name="NR_CAIXA")
	private BigDecimal nrCaixa;

	@Column(name="NR_CNPJ_CGC")
	private String nrCnpjCgc;

	@Column(name="NR_COO")
	private BigDecimal nrCoo;

	@Column(name="NR_CUPOM")
	private BigDecimal nrCupom;

	@Column(name="NR_NF")
	private BigDecimal nrNf;

	@Column(name="NR_SEQUE")
	private BigDecimal nrSeque;

	@Column(name="NR_SEQUENCIA_CUPOM")
	private BigDecimal nrSequenciaCupom;

	@Column(name="NR_SERIE_NF")
	private String nrSerieNf;

	@Column(name="NR_TRILHA_CARTAO")
	private String nrTrilhaCartao;

	@Column(name="PC_ICMS_FRETE")
	private BigDecimal pcIcmsFrete;

	@Column(name="QT_PONTOS")
	private BigDecimal qtPontos;

	@Column(name="ST_FATURAMENTO_CONVENIO")
	private String stFaturamentoConvenio;

	@Column(name="ST_TRANSMISSAO")
	private BigDecimal stTransmissao;

	@Column(name="ST_TRANSMISSAO_TERCEIROS")
	private BigDecimal stTransmissaoTerceiros;

	private BigDecimal teste;

	@Column(name="VL_BASE_COFINS")
	private BigDecimal vlBaseCofins;

	@Column(name="VL_BASE_FRETE")
	private BigDecimal vlBaseFrete;

	@Column(name="VL_BASE_ICMS")
	private BigDecimal vlBaseIcms;

	@Column(name="VL_BASE_ICMS_FCP_NF")
	private BigDecimal vlBaseIcmsFcpNf;

	@Column(name="VL_BASE_ICMS_ST_FCP_ANT_NF")
	private BigDecimal vlBaseIcmsStFcpAntNf;

	@Column(name="VL_BASE_ICMS_ST_FCP_NF")
	private BigDecimal vlBaseIcmsStFcpNf;

	@Column(name="VL_BASE_ICMS_ST_GARE_NF")
	private BigDecimal vlBaseIcmsStGareNf;

	@Column(name="VL_BASE_PIS")
	private BigDecimal vlBasePis;

	@Column(name="VL_BASE_REDUZIDA")
	private BigDecimal vlBaseReduzida;

	@Column(name="VL_COFINS")
	private BigDecimal vlCofins;

	@Column(name="VL_CONTABIL")
	private BigDecimal vlContabil;

	@Column(name="VL_ESTORNO_GLOSA_CONVENIO")
	private BigDecimal vlEstornoGlosaConvenio;

	@Column(name="VL_FRETE")
	private BigDecimal vlFrete;

	@Column(name="VL_GLOSA_CONVENIO")
	private BigDecimal vlGlosaConvenio;

	@Column(name="VL_GLOSA_PBM_REPASSE")
	private BigDecimal vlGlosaPbmRepasse;

	@Column(name="VL_GLOSA_PBM_SUBSIDIO")
	private BigDecimal vlGlosaPbmSubsidio;

	@Column(name="VL_ICMS_DESONERADO_NF")
	private BigDecimal vlIcmsDesoneradoNf;

	@Column(name="VL_ICMS_FCP_NF")
	private BigDecimal vlIcmsFcpNf;

	@Column(name="VL_ICMS_FRETE")
	private BigDecimal vlIcmsFrete;

	@Column(name="VL_ICMS_NF")
	private BigDecimal vlIcmsNf;

	@Column(name="VL_ICMS_ST_FCP_ANT_NF")
	private BigDecimal vlIcmsStFcpAntNf;

	@Column(name="VL_ICMS_ST_FCP_NF")
	private BigDecimal vlIcmsStFcpNf;

	@Column(name="VL_ICMS_ST_GARE_NF")
	private BigDecimal vlIcmsStGareNf;

	@Column(name="VL_IPI_NF")
	private BigDecimal vlIpiNf;

	@Column(name="VL_NF")
	private BigDecimal vlNf;

	@Column(name="VL_NF_REPASSE")
	private BigDecimal vlNfRepasse;

	@Column(name="VL_PBM_REEMBOLSO")
	private BigDecimal vlPbmReembolso;

	@Column(name="VL_PIS")
	private BigDecimal vlPis;

	@Column(name="VL_SEGURO")
	private BigDecimal vlSeguro;

	@Column(name="VL_SINAL_BRINDES")
	private BigDecimal vlSinalBrindes;

	@Column(name="VL_SINAL_ESTOQUE")
	private BigDecimal vlSinalEstoque;

	@Column(name="VL_SINAL_ESTOQUE_INDISP_ORIGEM")
	private BigDecimal vlSinalEstoqueIndispOrigem;

	@Column(name="VL_SINAL_PONTOS")
	private BigDecimal vlSinalPontos;

	@Column(name="VL_SINAL_SALDO")
	private BigDecimal vlSinalSaldo;

	@Column(name="VL_SUBSIDIO_EMPRESA")
	private BigDecimal vlSubsidioEmpresa;

	@Column(name="VL_TOTAL_CUSTO")
	private BigDecimal vlTotalCusto;

	@Column(name="VL_TROCO_NF")
	private BigDecimal vlTrocoNf;

	@OneToMany(mappedBy="tbNf")
	private List<TbItemDanfeVerde> tbItemDanfeVerdes;

	@ManyToOne
	@JoinColumn(name="CD_FILIAL")
	private TbFilial tbFilial;

	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(
		name="TB_MDFE_NFE"
		, joinColumns={
			@JoinColumn(name="ID_NF",referencedColumnName="ID_NF", nullable = false, insertable = false, updatable = false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="ID_MDFE", referencedColumnName="ID_MDFE", nullable = false, insertable = false, updatable = false)
			}
		)
	private List<TbMdfe> tbMdfes;


	@OneToMany(mappedBy="tbNf1")
	private List<TbNfRastreamento> tbNfRastreamentos1;

	@OneToMany(mappedBy="tbNf2")
	private List<TbNfRastreamento> tbNfRastreamentos2;

	@ManyToMany(mappedBy="tbNfs")
	private List<TbPmaxxiEnvio> tbPmaxxiEnvios;

	public TbNf() {
	}

	public Long getIdNf() {
		return this.idNf;
	}

	public void setIdNf(Long idNf) {
		this.idNf = idNf;
	}

	public BigDecimal getCdCampanha() {
		return this.cdCampanha;
	}

	public void setCdCampanha(BigDecimal cdCampanha) {
		this.cdCampanha = cdCampanha;
	}

	public String getCdChaveAcessoNfe() {
		return this.cdChaveAcessoNfe;
	}

	public void setCdChaveAcessoNfe(String cdChaveAcessoNfe) {
		this.cdChaveAcessoNfe = cdChaveAcessoNfe;
	}

	public BigDecimal getCdCredenciada() {
		return this.cdCredenciada;
	}

	public void setCdCredenciada(BigDecimal cdCredenciada) {
		this.cdCredenciada = cdCredenciada;
	}

	public BigDecimal getCdEmpresaVendaVinculada() {
		return this.cdEmpresaVendaVinculada;
	}

	public void setCdEmpresaVendaVinculada(BigDecimal cdEmpresaVendaVinculada) {
		this.cdEmpresaVendaVinculada = cdEmpresaVendaVinculada;
	}

	public BigDecimal getCdEntFilant() {
		return this.cdEntFilant;
	}

	public void setCdEntFilant(BigDecimal cdEntFilant) {
		this.cdEntFilant = cdEntFilant;
	}

	public BigDecimal getCdFormaPagto() {
		return this.cdFormaPagto;
	}

	public void setCdFormaPagto(BigDecimal cdFormaPagto) {
		this.cdFormaPagto = cdFormaPagto;
	}

	public BigDecimal getCdMotivoTransferencia() {
		return this.cdMotivoTransferencia;
	}

	public void setCdMotivoTransferencia(BigDecimal cdMotivoTransferencia) {
		this.cdMotivoTransferencia = cdMotivoTransferencia;
	}

	public BigDecimal getCdNfeTpSerie() {
		return this.cdNfeTpSerie;
	}

	public void setCdNfeTpSerie(BigDecimal cdNfeTpSerie) {
		this.cdNfeTpSerie = cdNfeTpSerie;
	}

	public BigDecimal getCdOperacaoFiscal() {
		return this.cdOperacaoFiscal;
	}

	public void setCdOperacaoFiscal(BigDecimal cdOperacaoFiscal) {
		this.cdOperacaoFiscal = cdOperacaoFiscal;
	}

	public BigDecimal getCdOperador() {
		return this.cdOperador;
	}

	public void setCdOperador(BigDecimal cdOperador) {
		this.cdOperador = cdOperador;
	}

	public BigDecimal getCdOperadorVenda() {
		return this.cdOperadorVenda;
	}

	public void setCdOperadorVenda(BigDecimal cdOperadorVenda) {
		this.cdOperadorVenda = cdOperadorVenda;
	}

	public BigDecimal getCdOrigemNf() {
		return this.cdOrigemNf;
	}

	public void setCdOrigemNf(BigDecimal cdOrigemNf) {
		this.cdOrigemNf = cdOrigemNf;
	}

	public BigDecimal getCdPbr() {
		return this.cdPbr;
	}

	public void setCdPbr(BigDecimal cdPbr) {
		this.cdPbr = cdPbr;
	}

	public BigDecimal getCdRespostaPesquisa() {
		return this.cdRespostaPesquisa;
	}

	public void setCdRespostaPesquisa(BigDecimal cdRespostaPesquisa) {
		this.cdRespostaPesquisa = cdRespostaPesquisa;
	}

	public BigDecimal getCdTelevenda() {
		return this.cdTelevenda;
	}

	public void setCdTelevenda(BigDecimal cdTelevenda) {
		this.cdTelevenda = cdTelevenda;
	}

	public BigDecimal getCdTipoGlosa() {
		return this.cdTipoGlosa;
	}

	public void setCdTipoGlosa(BigDecimal cdTipoGlosa) {
		this.cdTipoGlosa = cdTipoGlosa;
	}

	public BigDecimal getCdTipoGlosaPbmr() {
		return this.cdTipoGlosaPbmr;
	}

	public void setCdTipoGlosaPbmr(BigDecimal cdTipoGlosaPbmr) {
		this.cdTipoGlosaPbmr = cdTipoGlosaPbmr;
	}

	public BigDecimal getCdTipoPdv() {
		return this.cdTipoPdv;
	}

	public void setCdTipoPdv(BigDecimal cdTipoPdv) {
		this.cdTipoPdv = cdTipoPdv;
	}

	public BigDecimal getCdTipoTransacao() {
		return this.cdTipoTransacao;
	}

	public void setCdTipoTransacao(BigDecimal cdTipoTransacao) {
		this.cdTipoTransacao = cdTipoTransacao;
	}

	public String getCdTotalizador() {
		return this.cdTotalizador;
	}

	public void setCdTotalizador(String cdTotalizador) {
		this.cdTotalizador = cdTotalizador;
	}

	public BigDecimal getCdTpCupom() {
		return this.cdTpCupom;
	}

	public void setCdTpCupom(BigDecimal cdTpCupom) {
		this.cdTpCupom = cdTpCupom;
	}

	public BigDecimal getCdTpNf() {
		return this.cdTpNf;
	}

	public void setCdTpNf(BigDecimal cdTpNf) {
		this.cdTpNf = cdTpNf;
	}

	public BigDecimal getCdTpRegistro() {
		return this.cdTpRegistro;
	}

	public void setCdTpRegistro(BigDecimal cdTpRegistro) {
		this.cdTpRegistro = cdTpRegistro;
	}

	public BigDecimal getCdTpTribCliente() {
		return this.cdTpTribCliente;
	}

	public void setCdTpTribCliente(BigDecimal cdTpTribCliente) {
		this.cdTpTribCliente = cdTpTribCliente;
	}

	public BigDecimal getCdTransacaoCliente() {
		return this.cdTransacaoCliente;
	}

	public void setCdTransacaoCliente(BigDecimal cdTransacaoCliente) {
		this.cdTransacaoCliente = cdTransacaoCliente;
	}

	public String getCdsPedidoCliente() {
		return this.cdsPedidoCliente;
	}

	public void setCdsPedidoCliente(String cdsPedidoCliente) {
		this.cdsPedidoCliente = cdsPedidoCliente;
	}

	public Date getDtAtualizacao() {
		return this.dtAtualizacao;
	}

	public void setDtAtualizacao(Date dtAtualizacao) {
		this.dtAtualizacao = dtAtualizacao;
	}

	public Date getDtCredenciadaFechamento() {
		return this.dtCredenciadaFechamento;
	}

	public void setDtCredenciadaFechamento(Date dtCredenciadaFechamento) {
		this.dtCredenciadaFechamento = dtCredenciadaFechamento;
	}

	public Date getDtCredenciadaFechto() {
		return this.dtCredenciadaFechto;
	}

	public void setDtCredenciadaFechto(Date dtCredenciadaFechto) {
		this.dtCredenciadaFechto = dtCredenciadaFechto;
	}

	public Date getDtEmissao() {
		return this.dtEmissao;
	}

	public void setDtEmissao(Date dtEmissao) {
		this.dtEmissao = dtEmissao;
	}

	public Date getDtEstornoGlosaConvenio() {
		return this.dtEstornoGlosaConvenio;
	}

	public void setDtEstornoGlosaConvenio(Date dtEstornoGlosaConvenio) {
		this.dtEstornoGlosaConvenio = dtEstornoGlosaConvenio;
	}

	public Date getDtFaturamento() {
		return this.dtFaturamento;
	}

	public void setDtFaturamento(Date dtFaturamento) {
		this.dtFaturamento = dtFaturamento;
	}

	public Date getDtFechto() {
		return this.dtFechto;
	}

	public void setDtFechto(Date dtFechto) {
		this.dtFechto = dtFechto;
	}

	public Date getDtFechtoCredenciada() {
		return this.dtFechtoCredenciada;
	}

	public void setDtFechtoCredenciada(Date dtFechtoCredenciada) {
		this.dtFechtoCredenciada = dtFechtoCredenciada;
	}

	public Date getDtGlosaConvenio() {
		return this.dtGlosaConvenio;
	}

	public void setDtGlosaConvenio(Date dtGlosaConvenio) {
		this.dtGlosaConvenio = dtGlosaConvenio;
	}

	public Date getDtGlosaPbmRepasse() {
		return this.dtGlosaPbmRepasse;
	}

	public void setDtGlosaPbmRepasse(Date dtGlosaPbmRepasse) {
		this.dtGlosaPbmRepasse = dtGlosaPbmRepasse;
	}

	public Date getDtGlosaPbmSubsidio() {
		return this.dtGlosaPbmSubsidio;
	}

	public void setDtGlosaPbmSubsidio(Date dtGlosaPbmSubsidio) {
		this.dtGlosaPbmSubsidio = dtGlosaPbmSubsidio;
	}

	public Date getDtRegularizacaoStatus() {
		return this.dtRegularizacaoStatus;
	}

	public void setDtRegularizacaoStatus(Date dtRegularizacaoStatus) {
		this.dtRegularizacaoStatus = dtRegularizacaoStatus;
	}

	public Date getDtSncmRegistroEvento() {
		return this.dtSncmRegistroEvento;
	}

	public void setDtSncmRegistroEvento(Date dtSncmRegistroEvento) {
		this.dtSncmRegistroEvento = dtSncmRegistroEvento;
	}

	public Date getDtTimestamp() {
		return this.dtTimestamp;
	}

	public void setDtTimestamp(Date dtTimestamp) {
		this.dtTimestamp = dtTimestamp;
	}

	public BigDecimal getFlVendaRg() {
		return this.flVendaRg;
	}

	public void setFlVendaRg(BigDecimal flVendaRg) {
		this.flVendaRg = flVendaRg;
	}

	public BigDecimal getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(BigDecimal idCliente) {
		this.idCliente = idCliente;
	}

	public BigDecimal getNrAutorizacao() {
		return this.nrAutorizacao;
	}

	public void setNrAutorizacao(BigDecimal nrAutorizacao) {
		this.nrAutorizacao = nrAutorizacao;
	}

	public BigDecimal getNrAutorizacaoPbm() {
		return this.nrAutorizacaoPbm;
	}

	public void setNrAutorizacaoPbm(BigDecimal nrAutorizacaoPbm) {
		this.nrAutorizacaoPbm = nrAutorizacaoPbm;
	}

	public BigDecimal getNrCaixa() {
		return this.nrCaixa;
	}

	public void setNrCaixa(BigDecimal nrCaixa) {
		this.nrCaixa = nrCaixa;
	}

	public String getNrCnpjCgc() {
		return this.nrCnpjCgc;
	}

	public void setNrCnpjCgc(String nrCnpjCgc) {
		this.nrCnpjCgc = nrCnpjCgc;
	}

	public BigDecimal getNrCoo() {
		return this.nrCoo;
	}

	public void setNrCoo(BigDecimal nrCoo) {
		this.nrCoo = nrCoo;
	}

	public BigDecimal getNrCupom() {
		return this.nrCupom;
	}

	public void setNrCupom(BigDecimal nrCupom) {
		this.nrCupom = nrCupom;
	}

	public BigDecimal getNrNf() {
		return this.nrNf;
	}

	public void setNrNf(BigDecimal nrNf) {
		this.nrNf = nrNf;
	}

	public BigDecimal getNrSeque() {
		return this.nrSeque;
	}

	public void setNrSeque(BigDecimal nrSeque) {
		this.nrSeque = nrSeque;
	}

	public BigDecimal getNrSequenciaCupom() {
		return this.nrSequenciaCupom;
	}

	public void setNrSequenciaCupom(BigDecimal nrSequenciaCupom) {
		this.nrSequenciaCupom = nrSequenciaCupom;
	}

	public String getNrSerieNf() {
		return this.nrSerieNf;
	}

	public void setNrSerieNf(String nrSerieNf) {
		this.nrSerieNf = nrSerieNf;
	}

	public String getNrTrilhaCartao() {
		return this.nrTrilhaCartao;
	}

	public void setNrTrilhaCartao(String nrTrilhaCartao) {
		this.nrTrilhaCartao = nrTrilhaCartao;
	}

	public BigDecimal getPcIcmsFrete() {
		return this.pcIcmsFrete;
	}

	public void setPcIcmsFrete(BigDecimal pcIcmsFrete) {
		this.pcIcmsFrete = pcIcmsFrete;
	}

	public BigDecimal getQtPontos() {
		return this.qtPontos;
	}

	public void setQtPontos(BigDecimal qtPontos) {
		this.qtPontos = qtPontos;
	}

	public String getStFaturamentoConvenio() {
		return this.stFaturamentoConvenio;
	}

	public void setStFaturamentoConvenio(String stFaturamentoConvenio) {
		this.stFaturamentoConvenio = stFaturamentoConvenio;
	}

	public BigDecimal getStTransmissao() {
		return this.stTransmissao;
	}

	public void setStTransmissao(BigDecimal stTransmissao) {
		this.stTransmissao = stTransmissao;
	}

	public BigDecimal getStTransmissaoTerceiros() {
		return this.stTransmissaoTerceiros;
	}

	public void setStTransmissaoTerceiros(BigDecimal stTransmissaoTerceiros) {
		this.stTransmissaoTerceiros = stTransmissaoTerceiros;
	}

	public BigDecimal getTeste() {
		return this.teste;
	}

	public void setTeste(BigDecimal teste) {
		this.teste = teste;
	}

	public BigDecimal getVlBaseCofins() {
		return this.vlBaseCofins;
	}

	public void setVlBaseCofins(BigDecimal vlBaseCofins) {
		this.vlBaseCofins = vlBaseCofins;
	}

	public BigDecimal getVlBaseFrete() {
		return this.vlBaseFrete;
	}

	public void setVlBaseFrete(BigDecimal vlBaseFrete) {
		this.vlBaseFrete = vlBaseFrete;
	}

	public BigDecimal getVlBaseIcms() {
		return this.vlBaseIcms;
	}

	public void setVlBaseIcms(BigDecimal vlBaseIcms) {
		this.vlBaseIcms = vlBaseIcms;
	}

	public BigDecimal getVlBaseIcmsFcpNf() {
		return this.vlBaseIcmsFcpNf;
	}

	public void setVlBaseIcmsFcpNf(BigDecimal vlBaseIcmsFcpNf) {
		this.vlBaseIcmsFcpNf = vlBaseIcmsFcpNf;
	}

	public BigDecimal getVlBaseIcmsStFcpAntNf() {
		return this.vlBaseIcmsStFcpAntNf;
	}

	public void setVlBaseIcmsStFcpAntNf(BigDecimal vlBaseIcmsStFcpAntNf) {
		this.vlBaseIcmsStFcpAntNf = vlBaseIcmsStFcpAntNf;
	}

	public BigDecimal getVlBaseIcmsStFcpNf() {
		return this.vlBaseIcmsStFcpNf;
	}

	public void setVlBaseIcmsStFcpNf(BigDecimal vlBaseIcmsStFcpNf) {
		this.vlBaseIcmsStFcpNf = vlBaseIcmsStFcpNf;
	}

	public BigDecimal getVlBaseIcmsStGareNf() {
		return this.vlBaseIcmsStGareNf;
	}

	public void setVlBaseIcmsStGareNf(BigDecimal vlBaseIcmsStGareNf) {
		this.vlBaseIcmsStGareNf = vlBaseIcmsStGareNf;
	}

	public BigDecimal getVlBasePis() {
		return this.vlBasePis;
	}

	public void setVlBasePis(BigDecimal vlBasePis) {
		this.vlBasePis = vlBasePis;
	}

	public BigDecimal getVlBaseReduzida() {
		return this.vlBaseReduzida;
	}

	public void setVlBaseReduzida(BigDecimal vlBaseReduzida) {
		this.vlBaseReduzida = vlBaseReduzida;
	}

	public BigDecimal getVlCofins() {
		return this.vlCofins;
	}

	public void setVlCofins(BigDecimal vlCofins) {
		this.vlCofins = vlCofins;
	}

	public BigDecimal getVlContabil() {
		return this.vlContabil;
	}

	public void setVlContabil(BigDecimal vlContabil) {
		this.vlContabil = vlContabil;
	}

	public BigDecimal getVlEstornoGlosaConvenio() {
		return this.vlEstornoGlosaConvenio;
	}

	public void setVlEstornoGlosaConvenio(BigDecimal vlEstornoGlosaConvenio) {
		this.vlEstornoGlosaConvenio = vlEstornoGlosaConvenio;
	}

	public BigDecimal getVlFrete() {
		return this.vlFrete;
	}

	public void setVlFrete(BigDecimal vlFrete) {
		this.vlFrete = vlFrete;
	}

	public BigDecimal getVlGlosaConvenio() {
		return this.vlGlosaConvenio;
	}

	public void setVlGlosaConvenio(BigDecimal vlGlosaConvenio) {
		this.vlGlosaConvenio = vlGlosaConvenio;
	}

	public BigDecimal getVlGlosaPbmRepasse() {
		return this.vlGlosaPbmRepasse;
	}

	public void setVlGlosaPbmRepasse(BigDecimal vlGlosaPbmRepasse) {
		this.vlGlosaPbmRepasse = vlGlosaPbmRepasse;
	}

	public BigDecimal getVlGlosaPbmSubsidio() {
		return this.vlGlosaPbmSubsidio;
	}

	public void setVlGlosaPbmSubsidio(BigDecimal vlGlosaPbmSubsidio) {
		this.vlGlosaPbmSubsidio = vlGlosaPbmSubsidio;
	}

	public BigDecimal getVlIcmsDesoneradoNf() {
		return this.vlIcmsDesoneradoNf;
	}

	public void setVlIcmsDesoneradoNf(BigDecimal vlIcmsDesoneradoNf) {
		this.vlIcmsDesoneradoNf = vlIcmsDesoneradoNf;
	}

	public BigDecimal getVlIcmsFcpNf() {
		return this.vlIcmsFcpNf;
	}

	public void setVlIcmsFcpNf(BigDecimal vlIcmsFcpNf) {
		this.vlIcmsFcpNf = vlIcmsFcpNf;
	}

	public BigDecimal getVlIcmsFrete() {
		return this.vlIcmsFrete;
	}

	public void setVlIcmsFrete(BigDecimal vlIcmsFrete) {
		this.vlIcmsFrete = vlIcmsFrete;
	}

	public BigDecimal getVlIcmsNf() {
		return this.vlIcmsNf;
	}

	public void setVlIcmsNf(BigDecimal vlIcmsNf) {
		this.vlIcmsNf = vlIcmsNf;
	}

	public BigDecimal getVlIcmsStFcpAntNf() {
		return this.vlIcmsStFcpAntNf;
	}

	public void setVlIcmsStFcpAntNf(BigDecimal vlIcmsStFcpAntNf) {
		this.vlIcmsStFcpAntNf = vlIcmsStFcpAntNf;
	}

	public BigDecimal getVlIcmsStFcpNf() {
		return this.vlIcmsStFcpNf;
	}

	public void setVlIcmsStFcpNf(BigDecimal vlIcmsStFcpNf) {
		this.vlIcmsStFcpNf = vlIcmsStFcpNf;
	}

	public BigDecimal getVlIcmsStGareNf() {
		return this.vlIcmsStGareNf;
	}

	public void setVlIcmsStGareNf(BigDecimal vlIcmsStGareNf) {
		this.vlIcmsStGareNf = vlIcmsStGareNf;
	}

	public BigDecimal getVlIpiNf() {
		return this.vlIpiNf;
	}

	public void setVlIpiNf(BigDecimal vlIpiNf) {
		this.vlIpiNf = vlIpiNf;
	}

	public BigDecimal getVlNf() {
		return this.vlNf;
	}

	public void setVlNf(BigDecimal vlNf) {
		this.vlNf = vlNf;
	}

	public BigDecimal getVlNfRepasse() {
		return this.vlNfRepasse;
	}

	public void setVlNfRepasse(BigDecimal vlNfRepasse) {
		this.vlNfRepasse = vlNfRepasse;
	}

	public BigDecimal getVlPbmReembolso() {
		return this.vlPbmReembolso;
	}

	public void setVlPbmReembolso(BigDecimal vlPbmReembolso) {
		this.vlPbmReembolso = vlPbmReembolso;
	}

	public BigDecimal getVlPis() {
		return this.vlPis;
	}

	public void setVlPis(BigDecimal vlPis) {
		this.vlPis = vlPis;
	}

	public BigDecimal getVlSeguro() {
		return this.vlSeguro;
	}

	public void setVlSeguro(BigDecimal vlSeguro) {
		this.vlSeguro = vlSeguro;
	}

	public BigDecimal getVlSinalBrindes() {
		return this.vlSinalBrindes;
	}

	public void setVlSinalBrindes(BigDecimal vlSinalBrindes) {
		this.vlSinalBrindes = vlSinalBrindes;
	}

	public BigDecimal getVlSinalEstoque() {
		return this.vlSinalEstoque;
	}

	public void setVlSinalEstoque(BigDecimal vlSinalEstoque) {
		this.vlSinalEstoque = vlSinalEstoque;
	}

	public BigDecimal getVlSinalEstoqueIndispOrigem() {
		return this.vlSinalEstoqueIndispOrigem;
	}

	public void setVlSinalEstoqueIndispOrigem(BigDecimal vlSinalEstoqueIndispOrigem) {
		this.vlSinalEstoqueIndispOrigem = vlSinalEstoqueIndispOrigem;
	}

	public BigDecimal getVlSinalPontos() {
		return this.vlSinalPontos;
	}

	public void setVlSinalPontos(BigDecimal vlSinalPontos) {
		this.vlSinalPontos = vlSinalPontos;
	}

	public BigDecimal getVlSinalSaldo() {
		return this.vlSinalSaldo;
	}

	public void setVlSinalSaldo(BigDecimal vlSinalSaldo) {
		this.vlSinalSaldo = vlSinalSaldo;
	}

	public BigDecimal getVlSubsidioEmpresa() {
		return this.vlSubsidioEmpresa;
	}

	public void setVlSubsidioEmpresa(BigDecimal vlSubsidioEmpresa) {
		this.vlSubsidioEmpresa = vlSubsidioEmpresa;
	}

	public BigDecimal getVlTotalCusto() {
		return this.vlTotalCusto;
	}

	public void setVlTotalCusto(BigDecimal vlTotalCusto) {
		this.vlTotalCusto = vlTotalCusto;
	}

	public BigDecimal getVlTrocoNf() {
		return this.vlTrocoNf;
	}

	public void setVlTrocoNf(BigDecimal vlTrocoNf) {
		this.vlTrocoNf = vlTrocoNf;
	}

	public List<TbItemDanfeVerde> getTbItemDanfeVerdes() {
		return this.tbItemDanfeVerdes;
	}

	public void setTbItemDanfeVerdes(List<TbItemDanfeVerde> tbItemDanfeVerdes) {
		this.tbItemDanfeVerdes = tbItemDanfeVerdes;
	}

	public TbItemDanfeVerde addTbItemDanfeVerde(TbItemDanfeVerde tbItemDanfeVerde) {
		getTbItemDanfeVerdes().add(tbItemDanfeVerde);
		tbItemDanfeVerde.setTbNf(this);

		return tbItemDanfeVerde;
	}

	public TbItemDanfeVerde removeTbItemDanfeVerde(TbItemDanfeVerde tbItemDanfeVerde) {
		getTbItemDanfeVerdes().remove(tbItemDanfeVerde);
		tbItemDanfeVerde.setTbNf(null);

		return tbItemDanfeVerde;
	}

	public TbFilial getTbFilial() {
		return this.tbFilial;
	}

	public void setTbFilial(TbFilial tbFilial) {
		this.tbFilial = tbFilial;
	}

	public List<TbMdfe> getTbMdfes() {
		return this.tbMdfes;
	}

	public void setTbMdfes(List<TbMdfe> tbMdfes) {
		this.tbMdfes = tbMdfes;
	}

	public List<TbNfRastreamento> getTbNfRastreamentos1() {
		return this.tbNfRastreamentos1;
	}

	public void setTbNfRastreamentos1(List<TbNfRastreamento> tbNfRastreamentos1) {
		this.tbNfRastreamentos1 = tbNfRastreamentos1;
	}

	public TbNfRastreamento addTbNfRastreamentos1(TbNfRastreamento tbNfRastreamentos1) {
		getTbNfRastreamentos1().add(tbNfRastreamentos1);
		tbNfRastreamentos1.setTbNf1(this);

		return tbNfRastreamentos1;
	}

	public TbNfRastreamento removeTbNfRastreamentos1(TbNfRastreamento tbNfRastreamentos1) {
		getTbNfRastreamentos1().remove(tbNfRastreamentos1);
		tbNfRastreamentos1.setTbNf1(null);

		return tbNfRastreamentos1;
	}

	public List<TbNfRastreamento> getTbNfRastreamentos2() {
		return this.tbNfRastreamentos2;
	}

	public void setTbNfRastreamentos2(List<TbNfRastreamento> tbNfRastreamentos2) {
		this.tbNfRastreamentos2 = tbNfRastreamentos2;
	}

	public TbNfRastreamento addTbNfRastreamentos2(TbNfRastreamento tbNfRastreamentos2) {
		getTbNfRastreamentos2().add(tbNfRastreamentos2);
		tbNfRastreamentos2.setTbNf2(this);

		return tbNfRastreamentos2;
	}

	public TbNfRastreamento removeTbNfRastreamentos2(TbNfRastreamento tbNfRastreamentos2) {
		getTbNfRastreamentos2().remove(tbNfRastreamentos2);
		tbNfRastreamentos2.setTbNf2(null);

		return tbNfRastreamentos2;
	}

	public List<TbPmaxxiEnvio> getTbPmaxxiEnvios() {
		return this.tbPmaxxiEnvios;
	}

	public void setTbPmaxxiEnvios(List<TbPmaxxiEnvio> tbPmaxxiEnvios) {
		this.tbPmaxxiEnvios = tbPmaxxiEnvios;
	}

}