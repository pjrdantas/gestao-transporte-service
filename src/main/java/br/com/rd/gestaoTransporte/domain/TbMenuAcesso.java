package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor@Entity
@Table(name = "TB_MENU_ACESSO")
@Cacheable(false)
public class TbMenuAcesso implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TbMenuAcessoPK id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "CD_MENU", nullable = false, insertable = false, updatable = false)
	private TbMenu tbMenu;
	
    @ManyToOne
	@JoinColumn(name = "ID_PERFIL", nullable = false, insertable = false, updatable = false)
	private TbPerfil tbPerfil;
    
    public TbMenuAcesso() {
    	
    }


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((tbMenu == null) ? 0 : tbMenu.hashCode());
		result = prime * result + ((tbPerfil == null) ? 0 : tbPerfil.hashCode());
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
		TbMenuAcesso other = (TbMenuAcesso) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (tbMenu == null) {
			if (other.tbMenu != null)
				return false;
		} else if (!tbMenu.equals(other.tbMenu))
			return false;
		if (tbPerfil == null) {
			if (other.tbPerfil != null)
				return false;
		} else if (!tbPerfil.equals(other.tbPerfil))
			return false;
		return true;
	}
	
	
	
}