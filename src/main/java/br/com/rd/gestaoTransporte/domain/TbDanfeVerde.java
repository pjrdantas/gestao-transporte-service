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
@Table(name = "TB_DANFE_VERDE")
public class TbDanfeVerde implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "CD_DANFE_VERDE")
	private Long codigoDanfeVerde;
	
	@Column(name = "CD_TP_STATUS_DANFE_VERDE")
	private Long codigoTipoStatusDanfeVerde; 
		
	@Column(name = "DS_EMAIL_DANFE_VERDE") 
	private String descricaoEmailDanfeVerde;
	
	@Column(name = "DS_EMAIL_FILIAL") 
	private String descricaoEmailFilial; 
	
    @Temporal(TemporalType.DATE)
    @Column(name = "DT_EMISSAO")
    private Date dataEmissao;
    
    @Column(name = "FL_CANCELADO")
    private Integer flagCancelado;
    
    @ManyToOne
	@JoinColumn(name="CD_TP_STATUS_DANFE_VERDE", nullable = false, insertable = false, updatable = false)
	private TbTpStatusDanfeVerde tbTpStatusDanfeVerde;
    
    public TbDanfeVerde() {
    	
    }
	
}
