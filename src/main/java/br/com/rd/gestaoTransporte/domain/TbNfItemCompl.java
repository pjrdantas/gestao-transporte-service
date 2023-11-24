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
@Table(name="TB_NF_ITEM_COMPL")
public class TbNfItemCompl implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TbNfItemComplPK id;

	@Column(name="CD_EAN")
	private BigDecimal cdEan;

	@Column(name="CD_MOTIVO")
	private BigDecimal cdMotivo;

	@Column(name="CD_PRODUTO_FORNECEDOR")
	private String cdProdutoFornecedor;

	@Column(name="CD_TIPO_TRANSACAO")
	private BigDecimal cdTipoTransacao;

	@Column(name="CD_TIPO_TRANSACAO_DESTINO")
	private BigDecimal cdTipoTransacaoDestino;

	@Column(name="CD_TIPO_TRANSACAO_ORIGEM")
	private BigDecimal cdTipoTransacaoOrigem;

	@Column(name="CD_UNIDADE_COMERCIAL")
	private String cdUnidadeComercial;

	@Column(name="CD_UNIDADE_FORNECEDOR")
	private BigDecimal cdUnidadeFornecedor;

	@Column(name="CDS_REGISTRO_ANVISA")
	private String cdsRegistroAnvisa;

	@Column(name="CDS_SSCC")
	private String cdsSscc;

	@Column(name="DS_OBSERVACAO")
	private String dsObservacao;

	@Column(name="DS_PRODUTO_SEM_CADASTRO")
	private String dsProdutoSemCadastro;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_ATUALIZACAO")
	private Date dtAtualizacao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_EMISSAO")
	private Date dtEmissao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_EMISSAO_NF_ORIGEM")
	private Date dtEmissaoNfOrigem;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_VENCTO_LOTE")
	private Date dtVenctoLote;

	@Column(name="FL_FALTA")
	private BigDecimal flFalta;

	@Column(name="FL_ITEM_UTILIZADO")
	private BigDecimal flItemUtilizado;

	@Column(name="FL_LMPM")
	private BigDecimal flLmpm;
	
	@Column(name="ID_NF_ORIGEM")
	private BigDecimal idNfOrigem;

	@Column(name="NR_LOTE")
	private String nrLote;
	
	@Column(name="NR_NF_ITEM_ORIGEM")
	private BigDecimal nrNfItemOrigem;

	@Column(name="NR_NF_ORIGEM")
	private BigDecimal nrNfOrigem;

	@Column(name="NR_SERIE_NF_ORIGEM")
	private BigDecimal nrSerieNfOrigem;

	@Column(name="PC_DESCONTO_NF")
	private BigDecimal pcDescontoNf;

	@Column(name="PC_ICM_NF")
	private BigDecimal pcIcmNf;

	@Column(name="QT_CORTE")
	private BigDecimal qtCorte;

	@Column(name="QT_ESTOQUE_DEPOSITO_ANT")
	private BigDecimal qtEstoqueDepositoAnt;

	@Column(name="QT_ESTOQUE_FILIAIS_ANT")
	private BigDecimal qtEstoqueFiliaisAnt;

	@Column(name="QT_ESTOQUE_FILIAL")
	private BigDecimal qtEstoqueFilial;

	@Column(name="QT_ITEM_COMERCIAL")
	private BigDecimal qtItemComercial;

	@Column(name="QT_ITEM_TRIBUTAVEL")
	private BigDecimal qtItemTributavel;

	@Column(name="QT_NF_FORN_CONTAGEM")
	private BigDecimal qtNfFornContagem;

	@Column(name="QT_NF_FORNECEDOR")
	private BigDecimal qtNfFornecedor;

	@Column(name="QT_PEDIDO_COMPRA_SALDO")
	private BigDecimal qtPedidoCompraSaldo;

	@Column(name="VL_BASE_ICMS_ST_RESSC")
	private BigDecimal vlBaseIcmsStRessc;

	@Column(name="VL_BONIFICACAO")
	private BigDecimal vlBonificacao;

	@Column(name="VL_CUSTO_MEDIO_ANT")
	private BigDecimal vlCustoMedioAnt;

	@Column(name="VL_CUSTO_MEDIO_NOVO")
	private BigDecimal vlCustoMedioNovo;

	@Column(name="VL_CUSTO_RAIA_ANT")
	private BigDecimal vlCustoRaiaAnt;

	@Column(name="VL_CUSTO_RAIA_NOVO")
	private BigDecimal vlCustoRaiaNovo;

	@Column(name="VL_DESCONTO_NF")
	private BigDecimal vlDescontoNf;

	@Column(name="VL_ICMS_ORIGEM")
	private BigDecimal vlIcmsOrigem;

	@Column(name="VL_ICMS_ST_RESSC")
	private BigDecimal vlIcmsStRessc;

	@Column(name="VL_IPI_NF")
	private BigDecimal vlIpiNf;

	@Column(name="VL_PRODUTO_LMPM")
	private BigDecimal vlProdutoLmpm;

	@Column(name="VL_REMARCACAO")
	private BigDecimal vlRemarcacao;

	@Column(name="VL_UNIT_REMARCACAO")
	private BigDecimal vlUnitRemarcacao;

	@Column(name="VL_UNITARIO_COMERCIAL")
	private BigDecimal vlUnitarioComercial;

	@Column(name="VL_UNITARIO_NF")
	private BigDecimal vlUnitarioNf;

	@Column(name="VL_UNITARIO_TRIBUTAVEL")
	private BigDecimal vlUnitarioTributavel;

	@OneToOne
	@JoinColumns({
		@JoinColumn(name="ID_NF", referencedColumnName="ID_NF", nullable = false, insertable = false, updatable = false),
		@JoinColumn(name="NR_NF_ITEM", referencedColumnName="NR_NF_ITEM", nullable = false, insertable = false, updatable = false)
		})
	private TbNfItem tbNfItem;

	public TbNfItemCompl() {
	}

}