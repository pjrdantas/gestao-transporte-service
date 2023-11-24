package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Embeddable
public class TbMDFeNFePK implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "ID_MDFE")
	private Long idMDFe;

	@Column(name="ID_NF")
	private Long idNotaFiscal;

	public Long getIdMDFe() {
		return idMDFe;
	}
	
	public TbMDFeNFePK() {
		
	}

	
}