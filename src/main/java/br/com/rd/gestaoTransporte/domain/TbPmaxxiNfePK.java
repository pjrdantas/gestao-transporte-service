package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@Embeddable
@Cacheable(false)
public class TbPmaxxiNfePK implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column(name = "ID_PMAXXI_ENVIO")
	private Long idPmaxxiEnvio;

	@Column(name = "ID_NF")
	private Long idNf;


	public TbPmaxxiNfePK() {
		
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idNf == null) ? 0 : idNf.hashCode());
		result = prime * result + ((idPmaxxiEnvio == null) ? 0 : idPmaxxiEnvio.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TbPmaxxiNfePK other = (TbPmaxxiNfePK) obj;
		if (idNf == null) {
			if (other.idNf != null)
				return false;
		} else if (!idNf.equals(other.idNf))
			return false;
		if (idPmaxxiEnvio == null) {
			if (other.idPmaxxiEnvio != null)
				return false;
		} else if (!idPmaxxiEnvio.equals(other.idPmaxxiEnvio))
			return false;
		return true;
	}

	
	
}