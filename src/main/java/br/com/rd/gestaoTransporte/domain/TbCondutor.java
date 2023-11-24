package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Entity
@Table(name="TB_CONDUTOR")
public class TbCondutor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CD_CONDUTOR")
	private Long cdCondutor;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_CADASTRO")
	private Date dtCadastro;

	@Column(name="FL_ATIVO")
	private int flAtivo;

	@Column(name="NM_CONDUTOR")
	private String nmCondutor;

	@Column(name="NR_CNH")
	private int nrCnh;

	@Column(name="NR_CPF")
	private int nrCpf;

	@ManyToOne
	@JoinColumn(name="CD_FORNECEDOR")
	private TbFornecedor tbFornecedor;

	public TbCondutor() {
	}



}