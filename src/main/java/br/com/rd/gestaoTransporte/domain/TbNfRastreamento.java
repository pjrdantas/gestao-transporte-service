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
@Table(name="TB_NF_RASTREAMENTO")
public class TbNfRastreamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TB_NF_RASTREAMENTO_IDNFRASTREAMENTO_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_NF_RASTREAMENTO_IDNFRASTREAMENTO_GENERATOR")
	@Column(name="ID_NF_RASTREAMENTO")
	private Long idNfRastreamento;

	@Column(name="CD_FUNCAO")
	private BigDecimal cdFuncao;

	@Column(name="CD_NF_ST_ATUALIZACAO")
	private BigDecimal cdNfStAtualizacao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_ATUALIZACAO")
	private Date dtAtualizacao;

	@ManyToOne
	@JoinColumn(name="ID_NF_ORIGEM")
	private TbNf tbNf1;

	@ManyToOne
	@JoinColumn(name="ID_NF")
	private TbNf tbNf2;

	@ManyToOne
	@JoinColumn(name="CD_OPERADOR")
	private TbOperador tbOperador;

	public TbNfRastreamento() {
	}


}