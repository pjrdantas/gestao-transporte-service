package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;


@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Entity
@Table(name="TB_TP_STATUS_DANFE_VERDE")
public class TbTpStatusDanfeVerde implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CD_TP_STATUS_DANFE_VERDE")
	private Long cdTpStatusDanfeVerde;

	@Column(name="DS_TP_STATUS_DANFE_VERDE")
	private String dsTpStatusDanfeVerde;

	@Column(name="FL_ATIVO")
	private BigDecimal flAtivo;


	@OneToMany(mappedBy="tbTpStatusDanfeVerde")
	private List<TbDanfeVerde> tbDanfeVerdes;

	public TbTpStatusDanfeVerde() {
	}


}