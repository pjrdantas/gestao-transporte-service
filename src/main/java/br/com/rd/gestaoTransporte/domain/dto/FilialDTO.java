package br.com.rd.gestaoTransporte.domain.dto;

import java.math.BigDecimal;
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
@JsonPropertyOrder({ "codigoFilial", "codigoCompanhia", "codigoFilialHistorico", "codigoFilialTipo", "codigoLogomarca",
		"dataEncerramento", "nomeFantasia", "codigoFilialRota", "codigoCentroDistribuicaoRegional", "dsEmailFilial" })

public class FilialDTO {

	@JsonProperty("codigoFilial")
	private Long codigoFilial;

	@JsonProperty("codigoCompanhia")
	private BigDecimal codigoCompanhia;

	@JsonProperty("codigoFilialHistorico")
	private BigDecimal codigoFilialHistorico;

	@JsonProperty("codigoFilialTipo")
	private BigDecimal codigoFilialTipo;

	@JsonProperty("codigoLogomarca")
	private BigDecimal codigoLogomarca;

	@JsonProperty("dataEncerramento")
	private Date dataEncerramento;

	@JsonProperty("nomeFantasia")
	private String nomeFantasia;

	@JsonProperty("codigoFilialRota")
	private Long codigoFilialRota;

	@JsonProperty("codigoCentroDistribuicaoRegional")
	private Long codigoCentroDistribuicaoRegional;

	@JsonProperty("dsEmailFilial")
	private String dsEmailFilial;

	public FilialDTO() {

	}
}
