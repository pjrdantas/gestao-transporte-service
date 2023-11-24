package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;



@Entity
@Table(name="TB_SISTEMA")
public class TbSistema implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CD_SISTEMA")
	private Long cdSistema;

	@Column(name="NM_SISTEMA")
	private String nmSistema;

	@Column(name="DS_VERSAO")
	private String dsVersao;

	@OneToMany(mappedBy="tbSistema")
	private List<TbMenu> tbMenus;

	@OneToMany(mappedBy="tbSistema")
	private List<TbParametroSistema> tbParametroSistemas;

	public TbSistema() {
	}

	public String getDsVersao() {
		return this.dsVersao;
	}

	public void setDsVersao(String dsVersao) {
		this.dsVersao = dsVersao;
	}

	public String getNmSistema() {
		return this.nmSistema;
	}

	public void setNmSistema(String nmSistema) {
		this.nmSistema = nmSistema;
	}

	public List<TbMenu> getTbMenus() {
		return this.tbMenus;
	}

	public void setTbMenus(List<TbMenu> tbMenus) {
		this.tbMenus = tbMenus;
	}

	public TbMenu addTbMenus(TbMenu tbMenus) {
		getTbMenus().add(tbMenus);
		tbMenus.setTbSistema(this);

		return tbMenus;
	}

	public TbMenu removeTbMenus(TbMenu tbMenus) {
		getTbMenus().remove(tbMenus);
		tbMenus.setTbSistema(null);

		return tbMenus;
	}

	public List<TbParametroSistema> getTbParametroSistemas() {
		return this.tbParametroSistemas;
	}

	public void setTbParametroSistemas(List<TbParametroSistema> tbParametroSistemas) {
		this.tbParametroSistemas = tbParametroSistemas;
	}

	public TbParametroSistema addTbParametroSistema(TbParametroSistema tbParametroSistema) {
		getTbParametroSistemas().add(tbParametroSistema);
		tbParametroSistema.setTbSistema(this);

		return tbParametroSistema;
	}

	public TbParametroSistema removeTbParametroSistema(TbParametroSistema tbParametroSistema) {
		getTbParametroSistemas().remove(tbParametroSistema);
		tbParametroSistema.setTbSistema(null);

		return tbParametroSistema;
	}

}