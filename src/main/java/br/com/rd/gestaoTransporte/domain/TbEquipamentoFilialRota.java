package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Entity
@Table(name="TB_EQUIPAMENTO_FILIAL_ROTA")
public class TbEquipamentoFilialRota implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TB_EQUIPAMENTO_FILIAL_ROTA_CDEQUIPAMENTOFILIALROTA_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_EQUIPAMENTO_FILIAL_ROTA_CDEQUIPAMENTOFILIALROTA_GENERATOR")
	@Column(name="CD_EQUIPAMENTO_FILIAL_ROTA")
	private Long cdEquipamentoFilialRota;

	@Column(name="CD_EQUIPAMENTO")
	private BigDecimal cdEquipamento;

	@Column(name="DS_EMAIL_FILIAL_ROTA")
	private String dsEmailFilialRota;

	@Column(name="FL_ATIVO")
	private BigDecimal flAtivo;

	//bi-directional many-to-one association to TbFilialRota
	@ManyToOne
	@JoinColumn(name="CD_FILIAL_ROTA", referencedColumnName="CD_FILIAL_ROTA", nullable = false, insertable = false, updatable = false)
	private TbFilialRota tbFilialRota;

	public TbEquipamentoFilialRota() {
	}

}