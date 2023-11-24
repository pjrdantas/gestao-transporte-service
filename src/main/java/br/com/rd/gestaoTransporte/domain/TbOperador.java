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
@Table(name="TB_OPERADOR")
public class TbOperador implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TB_OPERADOR_CDOPERADOR_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_OPERADOR_CDOPERADOR_GENERATOR")
	@Column(name="CD_OPERADOR")
	private long cdOperador;

	@Column(name="CD_AREA")
	private BigDecimal cdArea;

	@Column(name="CD_CARGO")
	private BigDecimal cdCargo;

	@Column(name="CD_CENTRO_CUSTO")
	private BigDecimal cdCentroCusto;

	@Column(name="CD_CENTRO_PESQUISA")
	private BigDecimal cdCentroPesquisa;

	@Column(name="CD_CONTRATADO")
	private BigDecimal cdContratado;

	@Column(name="CD_CREDENCIADA")
	private BigDecimal cdCredenciada;

	@Column(name="CD_EMPRESA")
	private BigDecimal cdEmpresa;

	@Column(name="CD_LOGOMARCA")
	private BigDecimal cdLogomarca;

	@Column(name="CD_PBM")
	private BigDecimal cdPbm;

	@Column(name="DS_EMAIL")
	private String dsEmail;

	@Column(name="DS_SENHA")
	private String dsSenha;

	@Column(name="DS_SENHA_APROVACAO")
	private String dsSenhaAprovacao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_ADMISSAO")
	private Date dtAdmissao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_ATUALIZACAO_PDV")
	private Date dtAtualizacaoPdv;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_DEMISSAO")
	private Date dtDemissao;

	@Column(name="FL_DESATIVADO")
	private BigDecimal flDesativado;

	@Column(name="FL_GRUPO")
	private BigDecimal flGrupo;

	@Column(name="FL_TERMINAL_CONSULTA")
	private BigDecimal flTerminalConsulta;

	@Column(name="ID_LOGIN_ORACLE")
	private String idLoginOracle;

	@Column(name="NM_OPERADOR")
	private String nmOperador;

	@Column(name="NR_MATRICULA")
	private BigDecimal nrMatricula;

	@OneToMany(mappedBy="tbOperador")
	private List<TbFilialRota> tbFilialRotas;

	@OneToMany(mappedBy="tbOperador")
	private List<TbMdfeRastreamento> tbMdfeRastreamentos;

	@OneToMany(mappedBy="tbOperador1")
	private List<TbNfCompleUnica> tbNfCompleUnicas1;

	@OneToMany(mappedBy="tbOperador2")
	private List<TbNfCompleUnica> tbNfCompleUnicas2;

	@OneToMany(mappedBy="tbOperador")
	private List<TbNfRastreamento> tbNfRastreamentos;

	@ManyToOne
	@JoinColumn(name="CD_FILIAL")
	private TbFilial tbFilial;

	@ManyToOne
	@JoinColumn(name="CD_OPERADOR_SUPERVISOR")
	private TbOperador tbOperador;

	@OneToMany(mappedBy="tbOperador")
	private List<TbOperador> tbOperadors;

	@OneToMany(mappedBy="tbOperador")
	private List<TbOperadorPerfil> tbOperadorPerfils;

	@OneToMany(mappedBy="tbOperador")
	private List<TbParametroSistema> tbParametroSistemas;

	@OneToMany(mappedBy="tbOperador")
	private List<TbPmaxxiRastreamento> tbPmaxxiRastreamentos;

	@OneToMany(mappedBy="tbOperador")
	private List<TbProduto> tbProdutos;

	public TbOperador() {
	}

}