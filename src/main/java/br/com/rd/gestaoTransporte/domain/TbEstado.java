package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Entity
@Table(name="TB_ESTADO")
public class TbEstado implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="SG_ESTADO")
	private String siglaEstado;

	@Column(name="CD_IBGE")
	private Double codigoIbge;

	@Column(name="DS_CAPITAL")
	private String descricaoCapital;

	@Column(name="DS_ESTADO")
	private String descricaoEstado;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_ATUALIZACAO_PDV")
	private Date dataAtualizacaoPdv;

    public TbEstado() {
    }

}