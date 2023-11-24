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
@Table(name="TB_FATURAMENTO_RASTREAMENTO")
public class TbFaturamentoRastreamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TB_FATURAMENTO_RASTREAMENTO_IDFATURAMENTORASTREAMENTO_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_FATURAMENTO_RASTREAMENTO_IDFATURAMENTORASTREAMENTO_GENERATOR")
	@Column(name="ID_FATURAMENTO_RASTREAMENTO")
	private Long idFaturamentoRastreamento;


	@Column(name="CD_FILIAL_DESTINO")
	private BigDecimal cdFilialDestino;

	@Column(name="CD_OPERADOR_REENVIO")
	private BigDecimal cdOperadorReenvio;

	@Column(name="CD_OPERADOR_SOLICITACAO")
	private BigDecimal cdOperadorSolicitacao;

	@Column(name="CD_REGIONAL")
	private BigDecimal cdRegional;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DH_FINALIZACAO")
	private Date dhFinalizacao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DH_FINALIZACAO_REENVIO")
	private Date dhFinalizacaoReenvio;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DH_SOLICITACAO")
	private Date dhSolicitacao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DH_SOLICITACAO_REENVIO")
	private Date dhSolicitacaoReenvio;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_FATURAMENTO")
	private Date dtFaturamento;

	@Column(name="ID_PEDIDO_MULTICANAL")
	private BigDecimal idPedidoMulticanal;

	@Column(name="IP_REENVIO")
	private String ipReenvio;

	@Column(name="IP_SOLICITACAO")
	private String ipSolicitacao;

	@Column(name="QT_ITENS_FINAL")
	private BigDecimal qtItensFinal;

	@Column(name="QT_TENTATIVA")
	private BigDecimal qtTentativa;


	@ManyToOne
	@JoinColumn(name="CD_STATUS_FATURAMENTO", referencedColumnName="CD_STATUS_FATURAMENTO", nullable = false, insertable = false, updatable = false)
	private TbStatusFaturamento tbStatusFaturamento;

	public TbFaturamentoRastreamento() {
	}

}