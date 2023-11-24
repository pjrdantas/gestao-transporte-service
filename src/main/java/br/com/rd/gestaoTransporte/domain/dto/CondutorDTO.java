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
@JsonPropertyOrder({ "cdCondutor", "cdFornecedor", "flagAtivo", "nmCondutor", "nmFornecedor", "numeroCnh",
		"numeroCpf" })
public class CondutorDTO {

	@JsonProperty("cdCondutor")
	private Long cdCondutor;

	@JsonProperty("cdFornecedor")
	private Long cdFornecedor;

	@JsonProperty("flagAtivo")
	private int flagAtivo;

	@JsonProperty("flagAtivoString")
	private String flagAtivoString;

	@JsonProperty("flagAtivoBoolean")
	private boolean flagAtivoBoolean;

	@JsonProperty("nmCondutor")
	private String nmCondutor;

	@JsonProperty("nmFornecedor")
	private String nmFornecedor;

	@JsonProperty("numeroCnh")
	private String numeroCnh;

	@JsonProperty("numeroCpf")
	private String numeroCpf;

	public CondutorDTO() {

	}
}
