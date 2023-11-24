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
@Table(name="TB_MDFE")
public class TbMdfe implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TB_MDFE_IDMDFE_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_MDFE_IDMDFE_GENERATOR")
	@Column(name="ID_MDFE")
	private Long idMdfe;


	@Column(name="CD_MDFE_STATUS")
	private BigDecimal cdMdfeStatus;

	@Column(name="CD_MOTIVO_CANCEL")
	private BigDecimal cdMotivoCancel;

	@Lob
	@Column(name="CL_ENVIO")
	private String clEnvio;

	@Lob
	@Column(name="CL_RETORNO")
	private String clRetorno;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_OPERACAO")
	private Date dtOperacao;

	@Column(name="NR_CHAVE_MDFE")
	private String nrChaveMdfe;

	@Column(name="NR_MDFE")
	private BigDecimal nrMdfe;

	@Column(name="NR_PROTOCOLO")
	private String nrProtocolo;

	@Column(name="NR_SERIE")
	private BigDecimal nrSerie;
	
	@ManyToOne
	@JoinColumn(name="CD_REJEICAO")
	private TbRejeicao tbRejeicao;
	
	@ManyToOne
	@JoinColumn(name="CD_SERVICO")
	private TbServico tbServico;

	@ManyToOne
	@JoinColumn(name="CD_SITUACAO")
	private TbSituacao tbSituacao;
	
	public TbMdfe() {
	}


}