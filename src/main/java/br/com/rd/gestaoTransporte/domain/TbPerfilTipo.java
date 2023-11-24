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
@Table(name="TB_PERFIL_TIPO")
public class TbPerfilTipo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="Cd_PERFIL_TIPO")
	private String cdPerfilTipo;

	@Column(name="DS_PERFIL_TIPO")
	private String dsPerfilTipo;

	@OneToMany(mappedBy="tbPerfilTipo")
	private List<TbPerfil> tbPerfils;

	public TbPerfilTipo() {
	}

}