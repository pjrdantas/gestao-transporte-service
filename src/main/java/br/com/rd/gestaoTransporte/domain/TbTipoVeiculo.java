package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
public class TbTipoVeiculo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CD_TP_VEICULO")
	private Long codigoTipoVeiculo;
	
	@Column(name="DS_TP_VEICULO")
	private String descricaoTipoVeiculo;

	public TbTipoVeiculo() {
		
	}

	
}