package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;


@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Entity
@Table(name="TB_FORNECEDOR")
public class TbFornecedor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TB_FORNECEDOR_CDFORNECEDOR_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_FORNECEDOR_CDFORNECEDOR_GENERATOR")
	@Column(name="CD_FORNECEDOR")
	private Long cdFornecedor;

	@Column(name="CD_CONDICAO_PAGTO")
	private Integer cdCondicaoPagto;

	@Column(name="CD_EAN_FORNECEDOR")
	private String cdEanFornecedor;

	@Column(name="CD_FORNECEDOR_SAP")
	private Integer cdFornecedorSap;

	@Column(name="CD_LAYOUT")
	private Integer cdLayout;

	@Column(name="CD_PORTE_EMPRESA")
	private Integer cdPorteEmpresa;

	@Column(name="CD_TIPO_FRETE")
	private Integer cdTipoFrete;

	@Column(name="CD_TP_CALCULO_ICMS")
	private Integer cdTpCalculoIcms;

	@Column(name="CD_TP_FORNECEDOR")
	private Integer cdTpFornecedor;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_CADASTRO")
	private Date dtCadastro;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_ULT_ALTERACAO")
	private Date dtUltAlteracao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_ULT_PEDIDO")
	private Date dtUltPedido;

	@Column(name="FL_DELETADO")
	private boolean flDeletado;

	@Column(name="FL_DESTACA_IPI")
	private boolean flDestacaIpi;

	@Column(name="FL_DISTRIBUIDOR")
	private boolean flDistribuidor;

	@Column(name="FL_EDI")
	private boolean flEdi;

	@Column(name="FL_EMITE_BOLETO")
	private boolean flEmiteBoleto;

	@Column(name="FL_ENTREGA_SALDO")
	private boolean flEntregaSaldo;

	@Column(name="FL_FIELD_SERVICE")
	private boolean flFieldService;

	@Column(name="FL_IMPORTADOR")
	private boolean flImportador;

	@Column(name="FL_ITX")
	private boolean flItx;

	@Column(name="FL_PRECO_TOTAL_ITX")
	private boolean flPrecoTotalItx;

	@Column(name="FL_SITUACAO_CADASTRAL_RECEITA")
	private boolean flSituacaoCadastralReceita;

	@Column(name="FL_USA_UNIDADE_CONV_FATURA")
	private boolean flUsaUnidadeConvFatura;

	@Column(name="ID_NICK_VAN")
	private Integer idNickVan;

	@Column(name="NM_FANTASIA")
	private String nmFantasia;

	@Column(name="NM_RAZAO_SOCIAL")
	private String nmRazaoSocial;

	@Column(name="NR_CNPJ")
	private String nrCnpj;

	@Column(name="NR_CONTA_RECONCILIACAO")
	private String nrContaReconciliacao;

	@Column(name="NR_INSCR_ESTADUAL")
	private String nrInscrEstadual;

	@Column(name="NR_ORDEM_CONSULTA")
	private Integer nrOrdemConsulta;

	@Column(name="NR_PRODUTIVIDADE_HR")
	private Integer nrProdutividadeHr;

	@Column(name="PC_DESCONTO")
	private Integer pcDesconto;

	@Column(name="PC_DESCONTO_GERAL_COMERCIAL")
	private Integer pcDescontoGeralComercial;

	@Column(name="PC_DESCONTO_GERAL_FINANCEIRO")
	private Integer pcDescontoGeralFinanceiro;

	@Column(name="QT_DIAS_ENTREGA")
	private Integer qtDiasEntrega;

	@Column(name="QT_DIAS_FREQUENCIA_PEDIDO")
	private Integer qtDiasFrequenciaPedido;

	@Column(name="QT_DIAS_MARGEM_SEGURANCA")
	private Integer qtDiasMargemSeguranca;

	@Column(name="QT_DIAS_PEDIDO")
	private Integer qtDiasPedido;

	@Column(name="QT_MARGEM_SEG_CURVA_A")
	private Integer qtMargemSegCurvaA;

	@Column(name="QT_QUEBRA_PEDIDO")
	private Integer qtQuebraPedido;

	@OneToMany(mappedBy="tbFornecedor")
	private List<TbCondutor> tbCondutors;

	@OneToMany(mappedBy="tbFornecedor")
	private List<TbEnderecoGeral> tbEnderecoGerals;

	@ManyToOne
	@JoinColumn(name="CD_DEPOSITO_FILIAL")
	private TbFilial tbFilial;

	@ManyToOne
	@JoinColumn(name="CD_FORNECEDOR_ITX")
	private TbFornecedor tbFornecedor1;

	@OneToMany(mappedBy="tbFornecedor1")
	private List<TbFornecedor> tbFornecedors1;

	@ManyToOne
	@JoinColumn(name="CD_FORNECEDOR_PAI")
	private TbFornecedor tbFornecedor2;

	@OneToMany(mappedBy="tbFornecedor2")
	private List<TbFornecedor> tbFornecedors2;

	@OneToMany(mappedBy="tbFornecedor")
	private List<TbNfCompleUnica> tbNfCompleUnicas;

	@OneToMany(mappedBy="tbFornecedor")
	private List<TbNfTransporte> tbNfTransportes;

	@OneToMany(mappedBy="tbFornecedor")
	private List<TbProduto> tbProdutos;

	public TbFornecedor() {
	}


}