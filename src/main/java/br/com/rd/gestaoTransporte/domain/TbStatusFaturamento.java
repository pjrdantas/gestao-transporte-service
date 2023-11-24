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
@Table(name="TB_STATUS_FATURAMENTO")
public class TbStatusFaturamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CD_STATUS_FATURAMENTO")
	private Long cdStatusFaturamento;


	@Column(name="DS_STATUS_FATURAMENTO")
	private String dsStatusFaturamento;


	@OneToMany(mappedBy="tbStatusFaturamento")
	private List<TbFaturamentoRastreamento> tbFaturamentoRastreamentos;

	public TbStatusFaturamento() {
	}


}