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
@Table(name="TB_NF_TRANSPORTE")
public class TbNfTransporte implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TB_NF_TRANSPORTE_IDNFTRANSPORTE_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_NF_TRANSPORTE_IDNFTRANSPORTE_GENERATOR")
	@Column(name="ID_NF_TRANSPORTE")
	private Long idNfTransporte;

	@Column(name="CD_VEICULO")
	private java.math.BigDecimal cdVeiculo;

	@Column(name="DS_MUNICIPIO")
	private String dsMunicipio;

	@Column(name="DS_PLACA_UF")
	private String dsPlacaUf;

	@Column(name="NR_PLACA")
	private String nrPlaca;

	@OneToMany(mappedBy="tbNfTransporte")
	private List<TbNfCompleUnica> tbNfCompleUnicas;

	@ManyToOne
	@JoinColumn(name="CD_CONDUTOR")
	private TbCondutor tbCondutor;

	@ManyToOne
	@JoinColumn(name="CD_FORNECEDOR")
	private TbFornecedor tbFornecedor;

	public TbNfTransporte() {
	}


}