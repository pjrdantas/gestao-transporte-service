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
@Table(name="TB_PRODUTO")
public class TbProduto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CD_PRODUTO")
	private Long cdProduto;

	@Column(name="CD_CATEGORIA")
	private BigDecimal cdCategoria;

	@Column(name="CD_CATEGORIA_EXPOSICAO")
	private BigDecimal cdCategoriaExposicao;

	@Column(name="CD_CATEGORIA_INTERNET")
	private BigDecimal cdCategoriaInternet;

	@Column(name="CD_CATEGORIA_MASTER")
	private BigDecimal cdCategoriaMaster;

	@Column(name="CD_CATEGORIA_MASTER_INTERNET")
	private BigDecimal cdCategoriaMasterInternet;

	@Column(name="CD_CLAS_FISCAL")
	private String cdClasFiscal;

	@Column(name="CD_CLAS_FISCAL_TIPI")
	private String cdClasFiscalTipi;

	@Column(name="CD_CLASSETERAP")
	private String cdClasseterap;

	@Column(name="CD_CLASSIF_COMERCIAL")
	private BigDecimal cdClassifComercial;

	@Column(name="CD_CLASSIF_PROD")
	private BigDecimal cdClassifProd;

	@Column(name="CD_COMERCIALIZACAO")
	private BigDecimal cdComercializacao;

	@Column(name="CD_COMPOSICAO")
	private BigDecimal cdComposicao;

	@Column(name="CD_DCB")
	private String cdDcb;

	@Column(name="CD_FORMA_FARMA")
	private BigDecimal cdFormaFarma;

	@Column(name="CD_GRCOMPRAS")
	private BigDecimal cdGrcompras;

	@Column(name="CD_GRFICHA")
	private BigDecimal cdGrficha;

	@Column(name="CD_GRUPO_INTERNET")
	private BigDecimal cdGrupoInternet;

	@Column(name="CD_GRUPO_REMARCACAO")
	private BigDecimal cdGrupoRemarcacao;

	@Column(name="CD_GRUPO_REMARCACAO_INT")
	private BigDecimal cdGrupoRemarcacaoInt;

	@Column(name="CD_INDICA")
	private BigDecimal cdIndica;

	@Column(name="CD_LISTA_PIS_COFINS")
	private BigDecimal cdListaPisCofins;

	@Column(name="CD_LOCAL_PRODUTO")
	private BigDecimal cdLocalProduto;

	@Column(name="CD_LOCAL_PRODUTO_LOJA")
	private BigDecimal cdLocalProdutoLoja;

	@Column(name="CD_MENSAGEM")
	private BigDecimal cdMensagem;

	@Column(name="CD_PRINCIPIO_ATIVO_COMPOSTO")
	private BigDecimal cdPrincipioAtivoComposto;

	@Column(name="CD_PRODUTO_LINHA")
	private BigDecimal cdProdutoLinha;

	@Column(name="CD_PRODUTO_MARCA")
	private BigDecimal cdProdutoMarca;

	@Column(name="CD_PRODUTO_ORIGEM")
	private BigDecimal cdProdutoOrigem;

	@Column(name="CD_PRODUTO_SAZONALIDADE")
	private BigDecimal cdProdutoSazonalidade;

	@Column(name="CD_PRODUTO_SEM_ETIQUETA")
	private BigDecimal cdProdutoSemEtiqueta;

	@Column(name="CD_PRODUTO_STATUS")
	private BigDecimal cdProdutoStatus;

	@Column(name="CD_PRODUTO_SUBMARCA")
	private BigDecimal cdProdutoSubmarca;

	@Column(name="CD_PRODUTO_VLR_AGREGADO")
	private BigDecimal cdProdutoVlrAgregado;

	@Column(name="CD_PSICOTROPICOS")
	private BigDecimal cdPsicotropicos;

	@Column(name="CD_SAL")
	private BigDecimal cdSal;

	@Column(name="CD_SETOR_SEPARACAO")
	private String cdSetorSeparacao;

	@Column(name="CD_SUB_CATEGORIA")
	private BigDecimal cdSubCategoria;

	@Column(name="CD_SUB_CATEGORIA_INTERNET")
	private BigDecimal cdSubCategoriaInternet;

	@Column(name="CD_SUBGRUPO")
	private BigDecimal cdSubgrupo;

	@Column(name="CD_SUBGRUPO_INTERNET")
	private BigDecimal cdSubgrupoInternet;

	@Column(name="CD_TARJA")
	private BigDecimal cdTarja;

	@Column(name="CD_TIPO_ETQ")
	private BigDecimal cdTipoEtq;

	@Column(name="CD_UNIDADE")
	private BigDecimal cdUnidade;

	@Column(name="CD_UNIDADE_FORMA_QUANTIDADE")
	private BigDecimal cdUnidadeFormaQuantidade;

	@Column(name="CD_USO")
	private BigDecimal cdUso;

	@Column(name="CL_CURVA_FIN")
	private String clCurvaFin;

	@Column(name="CL_CURVA_FIS")
	private String clCurvaFis;

	@Column(name="DS_PRODUTO")
	private String dsProduto;

	@Column(name="DS_PRODUTO_ANVISA")
	private String dsProdutoAnvisa;

	@Column(name="DS_PRODUTO_COR_RGB")
	private String dsProdutoCorRgb;

	@Column(name="DS_PRODUTO_DET")
	private String dsProdutoDet;

	@Column(name="DS_PRODUTO_FONETICA")
	private String dsProdutoFonetica;

	@Column(name="DS_PRODUTO_SIAC")
	private String dsProdutoSiac;

	@Column(name="DS_PRODUTO_TECNICA")
	private String dsProdutoTecnica;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_ATUALIZACAO_PDV")
	private Date dtAtualizacaoPdv;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_BLOQUEIA_ENCOMENDA")
	private Date dtBloqueiaEncomenda;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_CADASTRO")
	private Date dtCadastro;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_PRIMEIRA_ENTRADA")
	private Date dtPrimeiraEntrada;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_PRODUTO_INATIVO")
	private Date dtProdutoInativo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_REGULARIZACAO_STATUS")
	private Date dtRegularizacaoStatus;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_ULT_ALT_CLAS_FISCAL")
	private Date dtUltAltClasFiscal;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_ULT_ENTRADA")
	private Date dtUltEntrada;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_ULT_REMARC")
	private Date dtUltRemarc;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_VENCIMENTO_REGISTRO_ANVISA")
	private Date dtVencimentoRegistroAnvisa;

	@Column(name="FC_ULTIMA_TRANSFERENCIA")
	private BigDecimal fcUltimaTransferencia;

	@Column(name="FL_AEROSSOL")
	private BigDecimal flAerossol;

	@Column(name="FL_AVULSO")
	private BigDecimal flAvulso;

	@Column(name="FL_BLOQUEIA_ENCOMENDA")
	private BigDecimal flBloqueiaEncomenda;

	@Column(name="FL_BMPO")
	private BigDecimal flBmpo;

	@Column(name="FL_BSPO")
	private BigDecimal flBspo;

	@Column(name="FL_CADASTRO_GENERICO")
	private BigDecimal flCadastroGenerico;

	@Column(name="FL_CADASTRO_PROVISORIO")
	private BigDecimal flCadastroProvisorio;

	@Column(name="FL_CARTELADO_NAO_NEGOCIADO")
	private BigDecimal flCarteladoNaoNegociado;

	@Column(name="FL_COMPRA_FABRICANTE")
	private BigDecimal flCompraFabricante;

	@Column(name="FL_CUPONAVEL")
	private BigDecimal flCuponavel;

	@Column(name="FL_DELETADO")
	private BigDecimal flDeletado;

	@Column(name="FL_DESATIVACAO_PSICO")
	private BigDecimal flDesativacaoPsico;

	@Column(name="FL_ENVIO_SNGPC")
	private BigDecimal flEnvioSngpc;

	@Column(name="FL_ESPACO_BELEZA")
	private BigDecimal flEspacoBeleza;

	@Column(name="FL_EXIGE_CUPOM")
	private BigDecimal flExigeCupom;

	@Column(name="FL_HABILITA_EAN")
	private BigDecimal flHabilitaEan;

	@Column(name="FL_INATIVO")
	private BigDecimal flInativo;

	@Column(name="FL_INTERNET")
	private BigDecimal flInternet;

	@Column(name="FL_JATEAVEL")
	private BigDecimal flJateavel;

	@Column(name="FL_LOTE_FATURAMENTO")
	private BigDecimal flLoteFaturamento;

	@Column(name="FL_MARCA_PROPRIA")
	private BigDecimal flMarcaPropria;

	@Column(name="FL_OTC")
	private BigDecimal flOtc;

	@Column(name="FL_PSICO_BALANCO_CONTR_ESP")
	private BigDecimal flPsicoBalancoContrEsp;

	@Column(name="FL_TRANSMITIDO")
	private BigDecimal flTransmitido;

	@Column(name="MD_ALTURA_CM")
	private BigDecimal mdAlturaCm;

	@Column(name="MD_COMPRIMENTO_CM")
	private BigDecimal mdComprimentoCm;

	@Column(name="MD_LARGURA_CM")
	private BigDecimal mdLarguraCm;

	@Column(name="NR_REGISTRO_ANVISA")
	private BigDecimal nrRegistroAnvisa;

	@Column(name="NR_SHELF_LIFE")
	private BigDecimal nrShelfLife;

	@Column(name="NR_ULT_LOTE")
	private String nrUltLote;

	@Column(name="PC_ICMS_ENTRADA")
	private BigDecimal pcIcmsEntrada;

	@Column(name="PC_IPI")
	private BigDecimal pcIpi;

	@Column(name="QT_DOSAGEM")
	private BigDecimal qtDosagem;

	@Column(name="QT_EMBALAGEM")
	private BigDecimal qtEmbalagem;

	@Column(name="QT_PESO")
	private BigDecimal qtPeso;

	@Column(name="QT_PRODUTO_COMPACTO")
	private BigDecimal qtProdutoCompacto;

	@Column(name="QT_UNID_MAX_ABAST")
	private BigDecimal qtUnidMaxAbast;

	@Column(name="VL_CUSTO_MEDIO")
	private BigDecimal vlCustoMedio;

	@Column(name="VL_CUSTO_MEDIO_ANTERIOR")
	private BigDecimal vlCustoMedioAnterior;

	@Column(name="VL_CUSTO_MEDIO_SEM_TRIB")
	private BigDecimal vlCustoMedioSemTrib;

	@Column(name="VL_CUSTO_RAIA")
	private BigDecimal vlCustoRaia;

	@Column(name="VL_CUSTO_ULT_ENTRADA")
	private BigDecimal vlCustoUltEntrada;

	@Column(name="VL_DESCONTO_FINANCEIRO_MEDIO")
	private BigDecimal vlDescontoFinanceiroMedio;

	@Column(name="VL_ICMS_MEDIO_ENTRADA")
	private BigDecimal vlIcmsMedioEntrada;

	@OneToMany(mappedBy="tbProduto")
	private List<TbNfItemFiscal> tbNfItemFiscals;

	@ManyToOne
	@JoinColumn(name="CD_FORNECEDOR_ULT_ENTRADA")
	private TbFornecedor tbFornecedor;

	@ManyToOne
	@JoinColumn(name="CD_GRUPO")
	private TbGrupo tbGrupo;

	@ManyToOne
	@JoinColumn(name="CD_OPERADOR")
	private TbOperador tbOperador;

	@ManyToOne
	@JoinColumn(name="CD_PRODUTO_COMPACTO")
	private TbProduto tbProduto;

	@OneToMany(mappedBy="tbProduto")
	private List<TbProduto> tbProdutos;

	@OneToMany(mappedBy="tbProduto")
	private List<TbRegistroProduto> tbRegistroProdutos;

	public TbProduto() {
	}

}