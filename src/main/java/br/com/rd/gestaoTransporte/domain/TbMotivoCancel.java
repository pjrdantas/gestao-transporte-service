package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name="TB_MOTIVO_CANCEL")
public class TbMotivoCancel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CD_MOTIVO_CANCEL")
	private long cdMotivoCancel;

	@Column(name="DS_MOTIVO_CANCEL")
	private String dsMotivoCancel;

	public TbMotivoCancel() {
	}

	public String getDsMotivoCancel() {
		return this.dsMotivoCancel;
	}

	public void setDsMotivoCancel(String dsMotivoCancel) {
		this.dsMotivoCancel = dsMotivoCancel;
	}

	

}