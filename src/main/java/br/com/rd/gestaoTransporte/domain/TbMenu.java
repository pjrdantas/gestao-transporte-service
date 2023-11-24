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
@Table(name="TB_MENU")
public class TbMenu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CD_MENU", unique = true, nullable = false, precision = 4)
	private Long codigoMenu;


	@Column(name="DS_MENU")
	private String dsMenu;

	@Column(name="FL_ATIVO")
	private int flAtivo;

	 
	@ManyToOne
	@JoinColumn(name="CD_SISTEMA")
	private TbSistema tbSistema;

	 
	@OneToMany(mappedBy="tbMenu")
	private List<TbMenuItem> tbMenuItems;

	 
	@ManyToMany(mappedBy="tbMenus")
	private List<TbPerfil> tbPerfils;

	public TbMenu() {
	}


}