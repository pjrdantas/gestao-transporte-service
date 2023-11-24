package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Entity
@Table(name="TB_GRUPO")
public class TbGrupo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CD_GRUPO")
	private Long codigoGrupo;

	@Column(name="DS_GRUPO")
	private String descricaoGrupo;

    @Temporal( TemporalType.DATE)
	@Column(name="DT_ATUALIZACAO_PDV")
	private Date dataAtualizacaoPdv;

	@Column(name="FL_ALMOXARIFADO")
	private Integer flagAlmoxarifado;

	@Column(name="FL_BRINDE")
	private Integer flagBrinde;

	@Column(name="FL_DIF_CAIXA")
	private Integer flagDifCaixa;

	@Column(name="FL_MEDICAMENTO")
	private Integer flagMedicamento;

	@Column(name="FL_OTC")
	private Integer flagOtc;

	@Column(name="FL_PERFUMARIA")
	private Integer flagPerfumaria;

	@Column(name="FL_SERVICO")
	private Integer flagServico;

	@Column(name="FL_VENDA")
	private Integer flagVenda;

	@Column(name="QT_PONTOS")
	private Integer qtPontos;

    public TbGrupo() {
    	
    }


}