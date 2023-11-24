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
@JsonPropertyOrder({ "idCidade", "nomeCidade", "codigoIBGE", "siglaEstado"})
public class CidadeDTO {
	
	@JsonProperty("idCidade")
	private Long idCidade;
	
	@JsonProperty("nomeCidade")
	private String nomeCidade;
	
	@JsonProperty("codigoIBGE")
	private Long codigoIBGE;
	
	@JsonProperty("siglaEstado")
	private String siglaEstado;
	
	
	public CidadeDTO() {
		
	}


}
