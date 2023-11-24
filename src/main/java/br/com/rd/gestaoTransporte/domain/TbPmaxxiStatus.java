package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Entity
@Table(name="TB_PMAXXI_STATUS")
public class TbPmaxxiStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CD_PMAXXI_STATUS")
	private Long cdPmaxxiStatus;

	@Column(name="DS_PMAXXI_STATUS")
	private String dsPmaxxiStatus;

	@OneToMany(mappedBy="tbPmaxxiStatus")
	private List<TbPmaxxiEnvio> tbPmaxxiEnvios;

	@OneToMany(mappedBy="tbPmaxxiStatus")
	private List<TbPmaxxiRastreamento> tbPmaxxiRastreamentos;

	public TbPmaxxiStatus() {
	}


}