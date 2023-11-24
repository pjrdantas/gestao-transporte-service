package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
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
@Table(name="TB_REGISTRO_PRODUTO")
public class TbRegistroProduto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TB_REGISTRO_PRODUTO_RGPRODUTO_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_REGISTRO_PRODUTO_RGPRODUTO_GENERATOR")
	@Column(name="RG_PRODUTO")
	private Long rgProduto;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_VALIDADE")
	private Date dtValidade;

	@Column(name="NR_LOTE")
	private String nrLote;

	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="ID_NF", referencedColumnName="ID_NF", nullable = false, insertable = false, updatable = false),
		@JoinColumn(name="NR_NF_ITEM", referencedColumnName="NR_NF_ITEM", nullable = false, insertable = false, updatable = false)
		})
	private TbNfItem tbNfItem;

	@ManyToOne
	@JoinColumn(name="CD_PRODUTO", referencedColumnName="CD_PRODUTO", nullable = false, insertable = false, updatable = false)
	private TbProduto tbProduto;

	public TbRegistroProduto() {
	}

}