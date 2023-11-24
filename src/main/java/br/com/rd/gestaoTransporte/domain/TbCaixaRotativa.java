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
@Table(name="TB_CAIXA_ROTATIVA")
public class TbCaixaRotativa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name="TB_CAIXA_ROTATIVA_IDCAIXAROTATIVA_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_CAIXA_ROTATIVA_IDCAIXAROTATIVA_GENERATOR")
	@Column(name="ID_CAIXA_ROTATIVA")
	private Long idCaixaRotativa;

	@Column(name="CD_CAIXA_STATUS")
	private BigDecimal cdCaixaStatus;

	@Column(name="CD_CAIXA_TIPO")
	private BigDecimal cdCaixaTipo;

	@Column(name="CD_OPERADOR")
	private BigDecimal cdOperador;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_ALTERACAO")
	private Date dtAlteracao;

	@Column(name="FL_ATIVO")
	private BigDecimal flAtivo;

	public TbCaixaRotativa() {
	}


}