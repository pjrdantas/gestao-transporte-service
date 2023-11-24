package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Embeddable
public class TbTpOperacaoFiscalPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "CD_OPERACAO_FISCAL")
	private Long codigoOperacaoFiscal;

	@Column(name="CD_TP_TRIB_CLIENTE")
	private Long codigoTpTribCliente;

    public TbTpOperacaoFiscalPK() {
    
    }


    	
}