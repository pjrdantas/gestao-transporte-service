package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Entity
@Table(name="TB_MONTADORA")
public class TbMontadora implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TB_MONTADORA_CDMONTADORA_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_MONTADORA_CDMONTADORA_GENERATOR")
	@Column(name="CD_MONTADORA")
	private Long cdMontadora;

	@Column(name="DS_MARCA")
	private String dsMarca;

	@Column(name="DS_MODELO")
	private String dsModelo;

	public TbMontadora() {
	}


}