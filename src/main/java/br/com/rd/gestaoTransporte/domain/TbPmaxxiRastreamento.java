package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
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
@Table(name="TB_PMAXXI_RASTREAMENTO")
public class TbPmaxxiRastreamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TB_PMAXXI_RASTREAMENTO_IDPMAXXIRASTREAMENTO_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_PMAXXI_RASTREAMENTO_IDPMAXXIRASTREAMENTO_GENERATOR")
	@Column(name="ID_PMAXXI_RASTREAMENTO")
	private Long idPmaxxiRastreamento;

	@Lob
	@Column(name="CL_ENVIO")
	private String clEnvio;

	@Lob
	@Column(name="CL_RETORNO")
	private String clRetorno;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_ENVIO")
	private Date dtEnvio;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_RETORNO")
	private Date dtRetorno;

	@ManyToOne
	@JoinColumn(name="CD_OPERADOR")
	private TbOperador tbOperador;

	@ManyToOne
	@JoinColumn(name="ID_PMAXXI_ENTREGA")
	private TbPmaxxiEntrega tbPmaxxiEntrega;

	@ManyToOne
	@JoinColumn(name="ID_PMAXXI_ENVIO")
	private TbPmaxxiEnvio tbPmaxxiEnvio;

	@ManyToOne
	@JoinColumn(name="CD_PMAXXI_STATUS")
	private TbPmaxxiStatus tbPmaxxiStatus;

	@ManyToOne
	@JoinColumn(name="CD_SERVICO")
	private TbServico tbServico;

	public TbPmaxxiRastreamento() {
	}

}