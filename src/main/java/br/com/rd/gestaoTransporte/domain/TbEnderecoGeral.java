package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
@Table(name = "TB_ENDERECO_GERAL")
public class TbEnderecoGeral implements Serializable {
	
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "NR_ENDERECO_GERAL")
    private Long numeroEnderecoGeral;

    @Column(name = "SG_ESTADO")
    private String siglaEstado;
    
    @Column(name = "DS_ENDERECO")
    private String descricaoEndereco;
    
    @Column(name = "NR_ENDERECO")
    private String numeroEndereco;
    
    @Column(name = "NR_CEP")
    private String numeroCEP;
    
    @Column(name = "DS_CIDADE")
    private String descricaoCidade;
    
    @Column(name = "NR_DDD_DDI")
    private String numeroDDD;
    
    @Column(name = "NR_TELEFONE")
    private String numeroTelefone;
    
    @Column(name = "NR_FAX")
    private String numeroFax;
    
    @Column(name = "NR_CNPJ_CGC")
    private String numeroCNPJ;
    
    @Column(name = "NR_INSCR_ESTADUAL")
    private String numeroInscricaoEstadual;
    
    @OneToOne
    @JoinColumn(name = "CD_FORNECEDOR")
    private TbFornecedor tbFornecedor;
    
    @OneToOne
    @JoinColumn(name = "CD_FILIAL")
    private TbFilial tbFilial;

	public TbEnderecoGeral() {

	}


	
}