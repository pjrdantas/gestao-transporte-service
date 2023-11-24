package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name="TB_MDFE_RASTREAMENTO")
public class TbMdfeRastreamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TB_MDFE_RASTREAMENTO_IDMDFERASTREAMENTO_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_MDFE_RASTREAMENTO_IDMDFERASTREAMENTO_GENERATOR")
	@Column(name="ID_MDFE_RASTREAMENTO")
	private Long idMdfeRastreamento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_OPERACAO")
	private Date dtOperacao;
	 
	@ManyToOne
	@JoinColumn(name="ID_MDFE", referencedColumnName="ID_MDFE", nullable = false, insertable = false, updatable = false)
	private TbMdfe tbMdfe;
	 
	@ManyToOne
	@JoinColumn(name="CD_MDFE_STATUS", referencedColumnName="CD_MDFE_STATUS", nullable = false, insertable = false, updatable = false)
	private TbMdfeStatus tbMdfeStatus;
 
	@ManyToOne
	@JoinColumn(name="CD_OPERADOR")
	private TbOperador tbOperador;

	public TbMdfeRastreamento() {
	}



}