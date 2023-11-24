package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Entity
@Table(name="TB_MENU_ITEM_ACESSO")
public class TbMenuItemAcesso implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TbMenuItemAcessoPK id;
	
	@Column(name="FL_ESCRITA")
	private Long flEscrita;

	
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="CD_ITEM", referencedColumnName="CD_ITEM", nullable = false, insertable = false, updatable = false),
		@JoinColumn(name="CD_MENU", referencedColumnName="CD_MENU", nullable = false, insertable = false, updatable = false)
		})
	private TbMenuItem tbMenuItem;

	
	@ManyToOne
	@JoinColumn(name="ID_PERFIL", referencedColumnName="ID_PERFIL", nullable = false, insertable = false, updatable = false)
	private TbPerfil tbPerfil;

	public TbMenuItemAcesso() {
	}



}