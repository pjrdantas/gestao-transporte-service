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
public class TbMenuItemPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "CD_ITEM", unique = true, nullable = false, precision = 4)
	private Long codigoItem;

	@Column(name="CD_MENU", unique=true, nullable=false, precision=4)
	private Long codigoMenu;

    public TbMenuItemPK() {
    	
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codigoItem == null) ? 0 : codigoItem.hashCode());
		result = prime * result
				+ ((codigoMenu == null) ? 0 : codigoMenu.hashCode());
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
		TbMenuItemPK other = (TbMenuItemPK) obj;
		if (codigoItem == null) {
			if (other.codigoItem != null)
				return false;
		} else if (!codigoItem.equals(other.codigoItem))
			return false;
		if (codigoMenu == null) {
			if (other.codigoMenu != null)
				return false;
		} else if (!codigoMenu.equals(other.codigoMenu))
			return false;
		return true;
	}
    
}