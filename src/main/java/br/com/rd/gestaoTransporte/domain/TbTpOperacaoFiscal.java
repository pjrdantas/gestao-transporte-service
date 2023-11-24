package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Entity
@Table(name="TB_TP_OPERACAO_FISCAL")
public class TbTpOperacaoFiscal implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private TbTpOperacaoFiscalPK id;

	@Column(name="CD_CFO")
	private String cdCfo;

	@Column(name="CD_LIVRO_FISCAL_COLUNA")
	private BigDecimal cdLivroFiscalColuna;

	@Column(name="CD_OPERACAO_FISCAL_CANCELAMENT")
	private BigDecimal cdOperacaoFiscalCancelament;

	@Column(name="CD_OPERACAO_FISCAL_ESTORNO")
	private BigDecimal cdOperacaoFiscalEstorno;

	@Column(name="CD_SNGPC_TIPO_MOVIMENTO")
	private BigDecimal cdSngpcTipoMovimento;

	@Column(name="CD_SPED_GRUPO_REGRA_ENT")
	private BigDecimal cdSpedGrupoRegraEnt;

	@Column(name="CD_SPED_GRUPO_REGRA_SAI")
	private BigDecimal cdSpedGrupoRegraSai;

	@Column(name="CD_TIPO_CONTA_PAGAR_RECEBER")
	private BigDecimal cdTipoContaPagarReceber;

	@Column(name="CD_TP_MOVTO_PEPS")
	private BigDecimal cdTpMovtoPeps;

	@Column(name="CD_TP_OPER_FISCAL_AGRUPAMENTO")
	private BigDecimal cdTpOperFiscalAgrupamento;

	@Column(name="CD_TP_OPER_FISCAL_NATUREZA")
	private BigDecimal cdTpOperFiscalNatureza;

	@Column(name="CD_TRANSACAO_CLIENTE")
	private BigDecimal cdTransacaoCliente;

	@Column(name="DS_ICM_NF")
	private String dsIcmNf;

	@Column(name="DS_OBSERVACOES")
	private String dsObservacoes;

	@Column(name="DS_OPERACAO_FISCAL")
	private String dsOperacaoFiscal;

	@Column(name="DS_TIPO_DOC")
	private String dsTipoDoc;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_ATUALIZACAO_PDV")
	private Date dtAtualizacaoPdv;

	@Column(name="FL_ALTERA_CUSTO")
	private BigDecimal flAlteraCusto;

	@Column(name="FL_BONIFICACAO_REMARCACAO")
	private BigDecimal flBonificacaoRemarcacao;

	@Column(name="FL_CANCELAMENTO")
	private BigDecimal flCancelamento;

	@Column(name="FL_COMPRA")
	private BigDecimal flCompra;

	@Column(name="FL_COMPRA_BONIFICADA")
	private BigDecimal flCompraBonificada;

	@Column(name="FL_CONTABILIZA_PERDA")
	private BigDecimal flContabilizaPerda;

	@Column(name="FL_CONTROLE_RETORNO")
	private BigDecimal flControleRetorno;

	@Column(name="FL_DELETADO")
	private BigDecimal flDeletado;

	@Column(name="FL_DOC_NAO_FISCAL")
	private BigDecimal flDocNaoFiscal;

	@Column(name="FL_EXIGE_PEDIDO_COMPRA")
	private BigDecimal flExigePedidoCompra;

	@Column(name="FL_GERA_DUPLICATA")
	private BigDecimal flGeraDuplicata;

	@Column(name="FL_INCIDE_ICM")
	private BigDecimal flIncideIcm;

	@Column(name="FL_INCIDE_IPI")
	private BigDecimal flIncideIpi;

	@Column(name="FL_RECEITA_COMERCIAL")
	private BigDecimal flReceitaComercial;

	@Column(name="NR_SERIE_NF")
	private String nrSerieNf;

	@Column(name="PC_RED_BASE")
	private BigDecimal pcRedBase;

	@Column(name="VL_SINAL_ESTOQUE")
	private BigDecimal vlSinalEstoque;

	@Column(name="VL_SINAL_ESTOQUE_DESTINO")
	private BigDecimal vlSinalEstoqueDestino;

	@Column(name="VL_SINAL_ESTOQUE_INDISP_DESTIN")
	private BigDecimal vlSinalEstoqueIndispDestin;

	@Column(name="VL_SINAL_ESTOQUE_INDISP_ORIGEM")
	private BigDecimal vlSinalEstoqueIndispOrigem;


	public TbTpOperacaoFiscal() {
	}

}