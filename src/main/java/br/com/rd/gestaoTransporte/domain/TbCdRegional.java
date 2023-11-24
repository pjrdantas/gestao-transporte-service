package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Entity
@Table(name="TB_CD_REGIONAL")
public class TbCdRegional implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "CD_REGIONAL", unique = true, nullable = false, precision = 4)
	private Long codigoRegional;

	@Column(name="CD_ESTEIRA")
	private BigDecimal cdEsteira;

	@Column(name="DS_DB_LINK")
	private String dsDbLink;

	@Column(name="DS_INFORMACAO_ADICIONAL_DV")
	private String dsInformacaoAdicionalDv;

	@Column(name="FL_ARRED_SUGESTAO")
	private BigDecimal flArredSugestao;

	@Column(name="FL_DANFE_VERDE")
	private BigDecimal flDanfeVerde;

	@Column(name="FL_ECOMMERCE")
	private BigDecimal flEcommerce;

	@Column(name="FL_IMPR_CONTROLADO")
	private BigDecimal flImprControlado;

	@Column(name="NM_CD_REGIONAL")
	private String nmCdRegional;

	@Column(name="QT_CAPACIDADE_FAT_ITENS_DIA")
	private BigDecimal qtCapacidadeFatItensDia;

	@Column(name="QT_CAPACIDADE_RECEBIMENTO")
	private BigDecimal qtCapacidadeRecebimento;

	@Column(name="TP_DANFE_VERDE")
	private BigDecimal tpDanfeVerde;

	public TbCdRegional() {
	}


}