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
@JsonPropertyOrder({ "cdTpCarroceria", "dsTpCarroceria" })
public class TpCarroceriaDTO {

	@JsonProperty("cdTpCarroceria")
	private Long cdTpCarroceria;

	@JsonProperty("dsTpCarroceria")
	private String dsTpCarroceria;

	public TpCarroceriaDTO() {
	}

}
