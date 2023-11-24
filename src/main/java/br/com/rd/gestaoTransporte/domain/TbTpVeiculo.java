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
@Table(name="TB_TP_VEICULO")
public class TbTpVeiculo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TB_TP_VEICULO_CDTPVEICULO_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_TP_VEICULO_CDTPVEICULO_GENERATOR")
	@Column(name="CD_TP_VEICULO")
	private Long cdTpVeiculo;

	@Column(name="DS_TP_VEICULO")
	private String dsTpVeiculo;

	public TbTpVeiculo() {
	}


}