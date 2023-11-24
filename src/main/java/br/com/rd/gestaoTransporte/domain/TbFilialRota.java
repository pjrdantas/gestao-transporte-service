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
@Table(name = "TB_FILIAL_ROTA")
public class TbFilialRota implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CD_FILIAL_ROTA")
	private long cdFilialRota;

	@Column(name="CDS_DOCA")
	private String cdsDoca;

	@Column(name="CDS_USUARIO_IMPRESSAO")
	private String cdsUsuarioImpressao;

	@Column(name="DS_FILIAL_ROTA")
	private String dsFilialRota;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_ATUALIZACAO")
	private Date dtAtualizacao;

	@Column(name="FL_ATIVO")
	private int flAtivo;

	@Column(name="FL_DIA1")
	private int flDia1;

	@Column(name="FL_DIA2")
	private int flDia2;

	@Column(name="FL_DIA3")
	private int flDia3;

	@Column(name="FL_DIA4")
	private int flDia4;

	@Column(name="FL_DIA5")
	private int flDia5;

	@Column(name="FL_DIA6")
	private int flDia6;

	@Column(name="FL_DIA7")
	private int flDia7;

	@Column(name="FL_ECOMMERCE")
	private int flEcommerce;

	@Column(name="NR_ORDEM")
	private int nrOrdem;
	
	@ManyToOne
	@JoinColumn(name="CD_OPERADOR")
	private TbOperador tbOperador;
	
	@ManyToOne
    @JoinColumn(name = "CD_FILIAL" )
    private TbFilial tbFilial;

	public TbFilialRota() {
	}

	
	
}