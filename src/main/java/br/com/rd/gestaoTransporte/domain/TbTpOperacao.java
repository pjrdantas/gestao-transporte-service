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
@Table(name="TB_TP_OPERACAO")
public class TbTpOperacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CD_TP_OPERACAO")
	private String cdTpOperacao;

	@Column(name="DS_TP_OPERACAO")
	private String dsTpOperacao;

	@OneToMany(mappedBy="tbTpOperacao")
	private List<TbRejeicao> tbRejeicaos;

	@OneToMany(mappedBy="tbTpOperacao")
	private List<TbServico> tbServicos;

	@OneToMany(mappedBy="tbTpOperacao")
	private List<TbSituacao> tbSituacaos;

	public TbTpOperacao() {
	}



}