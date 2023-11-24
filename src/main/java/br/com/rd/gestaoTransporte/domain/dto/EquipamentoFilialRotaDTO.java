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
@JsonPropertyOrder({ "codigoEquipamentoFilialRota", "codigoEquipamento", "descricaoEmailFilialRota", "flagAtivo",
		"flagAtivoString", "flagAtivoBoolean", "cdFilialRota", "descricaoFilialRota" })
public class EquipamentoFilialRotaDTO {

	@JsonProperty("codigoEquipamentoFilialRota")
	private Long codigoEquipamentoFilialRota;

	@JsonProperty("codigoEquipamento")
	private Long codigoEquipamento;

	@JsonProperty("descricaoEmailFilialRota")
	private String descricaoEmailFilialRota;

	@JsonProperty("flagAtivo")
	private Integer flagAtivo;

	@JsonProperty("flagAtivoString")
	private String flagAtivoString;

	@JsonProperty("flagAtivoBoolean")
	private boolean flagAtivoBoolean;

	@JsonProperty("cdFilialRota")
	private long cdFilialRota;

	@JsonProperty("descricaoFilialRota")
	private String descricaoFilialRota;

	public EquipamentoFilialRotaDTO() {

	}

}
