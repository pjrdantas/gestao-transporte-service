package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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
@Table(name = "TB_FILIAL")
public class TbFilial implements Serializable {
    
	private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CD_FILIAL")
    private Long codigoFilial;

    @Column(name = "CD_COMPANHIA")
    private BigDecimal codigoCompanhia;

    @Column(name = "CD_FILIAL_HISTORICO")
    private BigDecimal codigoFilialHistorico;

    @Column(name = "CD_FILIAL_TIPO")
    private BigDecimal codigoFilialTipo;

    @Column(name = "CD_LOGOMARCA")
    private BigDecimal codigoLogomarca;

    @Temporal(TemporalType.DATE)
    @Column(name = "DT_ENCERRAMENTO")
    private Date dataEncerramento;

    @Column(name = "NM_FANTASIA")
    private String nomeFantasia;
    
    @Column(name = "CD_FILIAL_ROTA")
    private Long codigoFilialRota;
    
    @Column(name = "CD_REGIONAL")
    private Long codigoCentroDistribuicaoRegional;
    
    @Column(name = "DS_EMAIL")
    private String dsEmailFilial;
    
    @OneToOne(mappedBy="tbFilial")
    private TbEnderecoGeral tbEnderecoGeral;
    
    public TbFilial() {
    	
    }
    
}