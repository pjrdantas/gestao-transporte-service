package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;


@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Entity
@Table(name="TB_PARAMETRO_SISTEMA")
public class TbParametroSistema implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TB_PARAMETRO_SISTEMA_IDPARAMETROSISTEMA_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_PARAMETRO_SISTEMA_IDPARAMETROSISTEMA_GENERATOR")
	@Column(name="ID_PARAMETRO_SISTEMA")
	private Long idParametroSistema;

	@Column(name="DS_PARAMETRO")
	private String dsParametro;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_ATUALIZACAO")
	private Date dtAtualizacao;

	@Column(name="FL_ATIVO")
	private BigDecimal flAtivo;

	@Column(name="TX_PARAMETRO")
	private String txParametro;

	@ManyToOne
	@JoinColumn(name="CD_OPERADOR")
	private TbOperador tbOperador;

	@ManyToOne
	@JoinColumn(name="CD_SISTEMA", referencedColumnName="CD_SISTEMA", nullable = false, insertable = false, updatable = false)
	private TbSistema tbSistema;

	public TbParametroSistema() {
	}

}