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
public class TbOperadorPerfilPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "CD_OPERADOR", unique = true, nullable = false, precision = 12)
	private Long cdOperador;

	@Column(name = "ID_PERFIL", unique = true, nullable = false, precision = 2)
	private Long idPerfil;

    public TbOperadorPerfilPK() {

    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdOperador == null) ? 0 : cdOperador.hashCode());
		result = prime * result + ((idPerfil == null) ? 0 : idPerfil.hashCode());
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
		TbOperadorPerfilPK other = (TbOperadorPerfilPK) obj;
		if (cdOperador == null) {
			if (other.cdOperador != null)
				return false;
		} else if (!cdOperador.equals(other.cdOperador))
			return false;
		if (idPerfil == null) {
			if (other.idPerfil != null)
				return false;
		} else if (!idPerfil.equals(other.idPerfil))
			return false;
		return true;
	}
	
    
}