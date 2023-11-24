package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name="TB_VEICULO")
public class TbVeiculo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id  
	@Column(name="CD_VEICULO")
	private Long codigoVeiculo;
		
	@Column(name="DS_PLACA")
	private String descricaoPlaca;
	
	@Column(name="NR_TARA")
	private Double numeroTara;
	
	@Column(name="MD_CAPACIDADE_KG")
	private Double mdCapacidadeKG;
	
	@Column(name="MD_CAPACIDADE_M3")
	private Double mdCapacidadeM3;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_ANO_FABRICACAO")
	private Date dataAnoFabricacao;
	
	@Column(name="NR_RENAVAM")
	private Long numeroRenavam;
	
	@Column(name="QT_VOLUMES_MEDIA")
	private Long qtVolumesMedia;
	
	@Column(name = "FL_ATIVO")
    private int flagAtivo;
	

	@ManyToOne
    @JoinColumn(name = "CD_TP_VEICULO")
    private TbTipoVeiculo tbTipoVeiculo;
	
	@ManyToOne
    @JoinColumn(name = "CD_TP_CARROCERIA")
    private TbTpCarroceria tbTipoCarroceria;
	
	@ManyToOne
    @JoinColumn(name = "CD_MONTADORA")
    private TbMontadora tbMontadora;
	
	@ManyToOne
    @JoinColumn(name = "CD_FORNECEDOR")
    private TbFornecedor tbFornecedor;
	
	@ManyToOne
    @JoinColumn(name = "ID_CIDADE")
    private TbCidade tbCidade;
	
	@ManyToOne
	@JoinColumn(name="SG_ESTADO")
	private TbEstado tbEstado;

	public TbVeiculo() {
		
	}

	
}