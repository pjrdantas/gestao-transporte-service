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
@Table(name="TB_DEPARTAMENTO")
public class TbDepartamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TB_DEPARTAMENTO_CDDEPARTAMENTO_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_DEPARTAMENTO_CDDEPARTAMENTO_GENERATOR")
	@Column(name="CD_DEPARTAMENTO")
	private Long cdDepartamento;

	@Column(name="CD_AREA")
	private BigDecimal cdArea;

	@Column(name="DS_DEPARTAMENTO")
	private String dsDepartamento;

	public TbDepartamento() {
	}

}