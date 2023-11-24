package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Entity
@Table(name="TB_CIDADE")
public class TbCidade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TB_CIDADE_IDCIDADE_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_CIDADE_IDCIDADE_GENERATOR")
	@Column(name="ID_CIDADE")
	private Long idCidade;

	@Column(name="CD_IBGE")
	private BigDecimal cdIbge;

	@Column(name="NM_CIDADE")
	private String nmCidade;

	@ManyToOne
	@JoinColumn(name="SG_ESTADO", referencedColumnName="SG_ESTADO", nullable = false, insertable = false, updatable = false)
	private TbEstado tbEstado;

	public TbCidade() {
	}



}