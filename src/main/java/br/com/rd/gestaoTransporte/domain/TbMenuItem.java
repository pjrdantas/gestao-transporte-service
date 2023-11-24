package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;


@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Entity
@Table(name="TB_MENU_ITEM")
@Cacheable(false)
public class TbMenuItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TbMenuItemPK id;

	@Column(name="DS_ITEM")
	private String dsItem;

	@Column(name="DS_VALOR")
	private String dsValor;

	@Column(name="FL_ATIVO")
	private BigDecimal flAtivo;

	@Column(name="NM_URL")
	private String nmUrl;

	 
	@ManyToOne
	@JoinColumn(name="CD_MENU", nullable = false, insertable = false, updatable = false)
	private TbMenu tbMenu;

	 
	@OneToMany(mappedBy="tbMenuItem")
	private List<TbMenuItemAcesso> tbMenuItemAcessos;

	public TbMenuItem() {
	}


}