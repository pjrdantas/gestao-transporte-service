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
@Table(name = "TB_MOTIVO_CANCEL")
public class TbMotivoCancelamento implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @Column(name = "CD_MOTIVO_CANCEL")
    private Long codigoMotivoCancelamento;
	
	@Column(name = "DS_MOTIVO_CANCEL")
    private String descricaoMotivoCancelamento;

	public TbMotivoCancelamento() {
		
	}

		
}