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
@Table(name="TB_MDFE_STATUS")
public class TbMdfeStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "CD_MDFE_STATUS")
    private Long codigoMDFeStatus;
	
	@Column(name="DS_MDFE_STATUS")
	private String dsMdfeStatus;


	public TbMdfeStatus() {
	}



}