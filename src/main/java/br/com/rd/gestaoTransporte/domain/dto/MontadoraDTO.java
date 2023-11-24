package br.com.rd.gestaoTransporte.domain.dto;

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
@JsonPropertyOrder({ "codigoMontadora", "descricaoMarca", "descricaoModelo" })
public class MontadoraDTO {

	@JsonProperty("codigoMontadora")
	private Long codigoMontadora;

	@JsonProperty("descricaoMarca")
	private String descricaoMarca;

	@JsonProperty("descricaoModelo")
	private String descricaoModelo;

	public MontadoraDTO() {

	}
}
