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
@Table(name="TB_PRODUTO_ESTOQUE_ATUALIZAR")
public class TbProdutoEstoqueAtualizar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TB_PRODUTO_ESTOQUE_ATUALIZAR_IDNF_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_PRODUTO_ESTOQUE_ATUALIZAR_IDNF_GENERATOR")
	@Column(name="ID_NF")
	private Long idNf;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_ATUALIZACAO")
	private Date dtAtualizacao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_ATUALIZACAO_PDV")
	private Date dtAtualizacaoPdv;

	@Column(name="FL_ATUALIZADO")
	private BigDecimal flAtualizado;

	@Column(name="FL_TRANSMITIDO")
	private BigDecimal flTransmitido;

	public TbProdutoEstoqueAtualizar() {
	}

}