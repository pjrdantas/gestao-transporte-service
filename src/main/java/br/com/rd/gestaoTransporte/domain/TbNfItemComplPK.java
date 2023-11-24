package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Embeddable
public class TbNfItemComplPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name="ID_NF", insertable=false, updatable=false)
	private long idNf;

	@Column(name="NR_NF_ITEM", insertable=false, updatable=false)
	private long nrNfItem;

	public TbNfItemComplPK() {
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TbNfItemComplPK)) {
			return false;
		}
		TbNfItemComplPK castOther = (TbNfItemComplPK)other;
		return 
			(this.idNf == castOther.idNf)
			&& (this.nrNfItem == castOther.nrNfItem);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.idNf ^ (this.idNf >>> 32)));
		hash = hash * prime + ((int) (this.nrNfItem ^ (this.nrNfItem >>> 32)));
		
		return hash;
	}
}