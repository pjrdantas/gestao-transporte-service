package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Entity
@Table(name="TB_ITEM_DANFE_VERDE")
public class TbItemDanfeVerde implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TB_ITEM_DANFE_VERDE_CDITEMDANFEVERDE_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_ITEM_DANFE_VERDE_CDITEMDANFEVERDE_GENERATOR")
	@Column(name="CD_ITEM_DANFE_VERDE")
	private Long cdItemDanfeVerde;

	
	@Column(name="CD_CHAVE_ACESSO_NFE")
	private String cdChaveAcessoNfe;

	@ManyToOne
	@JoinColumn(name="CD_DANFE_VERDE", referencedColumnName="CD_DANFE_VERDE", nullable = false, insertable = false, updatable = false)
	private TbDanfeVerde tbDanfeVerde;

	@ManyToOne
	@JoinColumn(name="ID_NF")
	private TbNf tbNf;

	public TbItemDanfeVerde() {
	}

}