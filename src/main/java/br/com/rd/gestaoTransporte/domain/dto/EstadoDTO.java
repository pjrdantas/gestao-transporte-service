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
@JsonPropertyOrder({ "siglaEstado", "descricaoCapital", "descricaoEstado" })
public class EstadoDTO {
	
	@JsonProperty("siglaEstado")
	private String siglaEstado;
	
	@JsonProperty("descricaoCapital")
	private String descricaoCapital;
	
	@JsonProperty("descricaoEstado")
	private String descricaoEstado;
	
	public EstadoDTO() {
		
	}
}
