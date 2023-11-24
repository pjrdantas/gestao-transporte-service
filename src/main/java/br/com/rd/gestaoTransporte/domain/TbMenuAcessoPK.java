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
public class TbMenuAcessoPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "CD_MENU", unique = true, nullable = false, precision = 4)
	private Long codigoMenu;

	@Column(name = "ID_PERFIL", unique = true, nullable = false, precision = 4)
	private Long idPerfil;

    public TbMenuAcessoPK() {
    	
    }



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoMenu == null) ? 0 : codigoMenu.hashCode());
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
		TbMenuAcessoPK other = (TbMenuAcessoPK) obj;
		if (codigoMenu == null) {
			if (other.codigoMenu != null)
				return false;
		} else if (!codigoMenu.equals(other.codigoMenu))
			return false;
		if (idPerfil == null) {
			if (other.idPerfil != null)
				return false;
		} else if (!idPerfil.equals(other.idPerfil))
			return false;
		return true;
	}
	
	
	
	
	
}