package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Entity
@Table(name="TB_PMAXXI_ENVIO")
public class TbPmaxxiEnvio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_PMAXXI_ENVIO")
	private Long idPmaxxiEnvio;

	@Column(name="CD_VEICULO")
	private BigDecimal cdVeiculo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_OPERACAO")
	private Date dtOperacao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_SAIDA")
	private Date dtSaida;

	@Column(name="FL_CANCELADO")
	private BigDecimal flCancelado;

	@Column(name="NR_ENVIO")
	private BigDecimal nrEnvio;

	@ManyToOne
	@JoinColumn(name="CD_FILIAL_ROTA")
	private TbFilialRota tbFilialRota;

	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(
		name="TB_PMAXXI_NFE"
		, joinColumns={
			@JoinColumn(name="ID_PMAXXI_ENVIO", referencedColumnName="ID_PMAXXI_ENVIO", nullable = false, insertable = false, updatable = false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="ID_NF", referencedColumnName="ID_NF", nullable = false, insertable = false, updatable = false)
			}
		)
	private List<TbNf> tbNfs;

	@ManyToOne
	@JoinColumn(name="CD_PMAXXI_STATUS")
	private TbPmaxxiStatus tbPmaxxiStatus;

	@ManyToOne
	@JoinColumn(name="CD_SERVICO")
	private TbServico tbServico;

	@OneToMany(mappedBy="tbPmaxxiEnvio")
	private List<TbPmaxxiRastreamento> tbPmaxxiRastreamentos;

	public TbPmaxxiEnvio() {
	}

}