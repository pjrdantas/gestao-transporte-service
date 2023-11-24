package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;


@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Entity
@Table(name="TB_PMAXXI_ENTREGA")
public class TbPmaxxiEntrega implements Serializable {
	private static final long serialVersionUID = 1L;


	@Id
	@Column(name="ID_PMAXXI_ENTREGA")
	private Long idPmaxxiEntrega;

	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_OPERACAO")
	private Date dtOperacao;

	@OneToMany(mappedBy="tbPmaxxiEntrega")
	private List<TbPmaxxiRastreamento> tbPmaxxiRastreamentos;

	public TbPmaxxiEntrega() {
	}

}