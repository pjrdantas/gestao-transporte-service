package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="TB_SITUACAO")
public class TbSituacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CD_SITUACAO")
	private Long cdSituacao;

	@Column(name="DS_SITUACAO")
	private String dsSituacao;

	@OneToMany(mappedBy="tbSituacao")
	private List<TbMdfe> tbMdfes;

	@ManyToOne
	@JoinColumn(name="CD_TP_OPERACAO")
	private TbTpOperacao tbTpOperacao;

	public TbSituacao() {
	}

	public String getDsSituacao() {
		return this.dsSituacao;
	}

	public void setDsSituacao(String dsSituacao) {
		this.dsSituacao = dsSituacao;
	}

	public List<TbMdfe> getTbMdfes() {
		return this.tbMdfes;
	}

	public void setTbMdfes(List<TbMdfe> tbMdfes) {
		this.tbMdfes = tbMdfes;
	}

	public TbMdfe addTbMdfe(TbMdfe tbMdfe) {
		getTbMdfes().add(tbMdfe);
		tbMdfe.setTbSituacao(this);

		return tbMdfe;
	}

	public TbMdfe removeTbMdfe(TbMdfe tbMdfe) {
		getTbMdfes().remove(tbMdfe);
		tbMdfe.setTbSituacao(null);

		return tbMdfe;
	}

	public TbTpOperacao getTbTpOperacao() {
		return this.tbTpOperacao;
	}

	public void setTbTpOperacao(TbTpOperacao tbTpOperacao) {
		this.tbTpOperacao = tbTpOperacao;
	}

}