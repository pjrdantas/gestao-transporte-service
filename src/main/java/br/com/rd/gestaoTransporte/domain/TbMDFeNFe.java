package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Entity
@Table(name="TB_MDFE_NFE")
public class TbMDFeNFe implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TbMDFeNFePK id;
	
	public TbMDFeNFe() {
		
	}
	
}