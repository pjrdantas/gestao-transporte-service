package br.com.rd.gestaoTransporte.domain.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.USE_DEFAULTS)
@JsonPropertyOrder({ "codigoVeiculo", "descricaoPlaca", "numeroTara", "mdCapacidadeKG", "mdCapacidadeM3",
		"dataAnoFabricacao", "numeroRenavam", "qtVolumesMedia", "flagAtivo", "flagAtivoString", "flagAtivoBoolean",
		"cdTpVeiculo", "dsTpVeiculo", "codigoTipoCarroceria", "descricaoTipoCarroceria", "codigoMontadora",
		"descricaoMarca", "descricaoModelo", "cdFornecedor", "nmFantasia", "idCidade", "nomeCidade", "sgEstado",
		"dsEstado" })
public class VeiculoDTO {

	@JsonProperty("codigoVeiculo")
	private Long codigoVeiculo;

	@JsonProperty("descricaoPlaca")
	private String descricaoPlaca;

	@JsonProperty("numeroTara")
	private Double numeroTara;

	@JsonProperty("mdCapacidadeKG")
	private Double mdCapacidadeKG;

	@JsonProperty("mdCapacidadeM3")
	private Double mdCapacidadeM3;

	@JsonProperty("dataAnoFabricacao")
	private Date dataAnoFabricacao;

	@JsonProperty("numeroRenavam")
	private Long numeroRenavam;

	@JsonProperty("qtVolumesMedia")
	private Long qtVolumesMedia;

	@JsonProperty("flagAtivo")
	private int flagAtivo;

	@JsonProperty("flagAtivoString")
	private String flagAtivoString;

	@JsonProperty("flagAtivoBoolean")
	private boolean flagAtivoBoolean;

	@JsonProperty("cdTpVeiculo")
	private Long cdTpVeiculo;

	@JsonProperty("dsTpVeiculo")
	private String dsTpVeiculo;

	@JsonProperty("codigoTipoCarroceria")
	private Long codigoTipoCarroceria;

	@JsonProperty("descricaoTipoCarroceria")
	private String descricaoTipoCarroceria;

	@JsonProperty("codigoMontadora")
	private Long codigoMontadora;

	@JsonProperty("descricaoMarca")
	private String descricaoMarca;

	@JsonProperty("descricaoModelo")
	private String descricaoModelo;

	@JsonProperty("cdFornecedor")
	private Long cdFornecedor;

	@JsonProperty("nmFantasia")
	private String nmFantasia;

	@JsonProperty("idCidade")
	private Long idCidade;

	@JsonProperty("nomeCidade")
	private String nomeCidade;

	@JsonProperty("sgEstado")
	private String sgEstado;

	@JsonProperty("dsEstado")
	private String dsEstado;

	public VeiculoDTO() {

	}

}
