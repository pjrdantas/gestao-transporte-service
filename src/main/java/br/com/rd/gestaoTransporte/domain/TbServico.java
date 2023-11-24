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
@Table(name="TB_SERVICO")
public class TbServico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CD_SERVICO")
	private Long cdServico;


	@Column(name="DS_SERVICO")
	private String dsServico;

	@OneToMany(mappedBy="tbServico")
	private List<TbMdfe> tbMdfes;

	@OneToMany(mappedBy="tbServico")
	private List<TbPmaxxiEnvio> tbPmaxxiEnvios;

	@OneToMany(mappedBy="tbServico")
	private List<TbPmaxxiRastreamento> tbPmaxxiRastreamentos;

	@ManyToOne
	@JoinColumn(name="CD_TP_OPERACAO")
	private TbTpOperacao tbTpOperacao;

	public TbServico() {
	}

	public String getDsServico() {
		return this.dsServico;
	}

	public void setDsServico(String dsServico) {
		this.dsServico = dsServico;
	}

	public List<TbMdfe> getTbMdfes() {
		return this.tbMdfes;
	}

	public void setTbMdfes(List<TbMdfe> tbMdfes) {
		this.tbMdfes = tbMdfes;
	}

	public TbMdfe addTbMdfe(TbMdfe tbMdfe) {
		getTbMdfes().add(tbMdfe);
		tbMdfe.setTbServico(this);

		return tbMdfe;
	}

	public TbMdfe removeTbMdfe(TbMdfe tbMdfe) {
		getTbMdfes().remove(tbMdfe);
		tbMdfe.setTbServico(null);

		return tbMdfe;
	}

	public List<TbPmaxxiEnvio> getTbPmaxxiEnvios() {
		return this.tbPmaxxiEnvios;
	}

	public void setTbPmaxxiEnvios(List<TbPmaxxiEnvio> tbPmaxxiEnvios) {
		this.tbPmaxxiEnvios = tbPmaxxiEnvios;
	}

	public TbPmaxxiEnvio addTbPmaxxiEnvio(TbPmaxxiEnvio tbPmaxxiEnvio) {
		getTbPmaxxiEnvios().add(tbPmaxxiEnvio);
		tbPmaxxiEnvio.setTbServico(this);

		return tbPmaxxiEnvio;
	}

	public TbPmaxxiEnvio removeTbPmaxxiEnvio(TbPmaxxiEnvio tbPmaxxiEnvio) {
		getTbPmaxxiEnvios().remove(tbPmaxxiEnvio);
		tbPmaxxiEnvio.setTbServico(null);

		return tbPmaxxiEnvio;
	}

	public List<TbPmaxxiRastreamento> getTbPmaxxiRastreamentos() {
		return this.tbPmaxxiRastreamentos;
	}

	public void setTbPmaxxiRastreamentos(List<TbPmaxxiRastreamento> tbPmaxxiRastreamentos) {
		this.tbPmaxxiRastreamentos = tbPmaxxiRastreamentos;
	}

	public TbPmaxxiRastreamento addTbPmaxxiRastreamento(TbPmaxxiRastreamento tbPmaxxiRastreamento) {
		getTbPmaxxiRastreamentos().add(tbPmaxxiRastreamento);
		tbPmaxxiRastreamento.setTbServico(this);

		return tbPmaxxiRastreamento;
	}

	public TbPmaxxiRastreamento removeTbPmaxxiRastreamento(TbPmaxxiRastreamento tbPmaxxiRastreamento) {
		getTbPmaxxiRastreamentos().remove(tbPmaxxiRastreamento);
		tbPmaxxiRastreamento.setTbServico(null);

		return tbPmaxxiRastreamento;
	}

	public TbTpOperacao getTbTpOperacao() {
		return this.tbTpOperacao;
	}

	public void setTbTpOperacao(TbTpOperacao tbTpOperacao) {
		this.tbTpOperacao = tbTpOperacao;
	}

}