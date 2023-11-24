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
@Table(name="TB_REJEICAO")
public class TbRejeicao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CD_REJEICAO")
	private Long cdRejeicao;

	@Column(name="DS_REJEICAO")
	private String dsRejeicao;

	@OneToMany(mappedBy="tbRejeicao")
	private List<TbMdfe> tbMdfes;

	@ManyToOne
	@JoinColumn(name="CD_TP_OPERACAO")
	private TbTpOperacao tbTpOperacao;

	public TbRejeicao() {
	}

}