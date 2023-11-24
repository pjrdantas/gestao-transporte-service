package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;


@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Entity
@Table(name="TB_NF_ITEM_LOTE")
public class TbNfItemLote implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TB_NF_ITEM_LOTE_IDNFITEMLOTE_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_NF_ITEM_LOTE_IDNFITEMLOTE_GENERATOR")
	@Column(name="ID_NF_ITEM_LOTE")
	private Long idNfItemLote;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_EMISSAO")
	private Date dtEmissao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_FABRICACAO")
	private Date dtFabricacao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_VENCIMENTO")
	private Date dtVencimento;

	@Column(name="FL_ENTRADA")
	private BigDecimal flEntrada;

	@Column(name="NR_LOTE")
	private String nrLote;

	@Column(name="QT_LOTE")
	private BigDecimal qtLote;

	@Column(name="VL_PMC")
	private BigDecimal vlPmc;

	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="ID_NF", referencedColumnName="ID_NF", nullable = false, insertable = false, updatable = false),
		@JoinColumn(name="NR_NF_ITEM", referencedColumnName="NR_NF_ITEM", nullable = false, insertable = false, updatable = false)
		})
	private TbNfItem tbNfItem;

	public TbNfItemLote() {
	}


}