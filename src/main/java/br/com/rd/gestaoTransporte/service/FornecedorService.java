package br.com.rd.gestaoTransporte.service;

import java.util.List;

import br.com.rd.gestaoTransporte.domain.dto.FornecedorDTO;

public interface FornecedorService {



	FornecedorDTO getFornecedorById(Long idFornecedor) throws Exception, Throwable;

	List<FornecedorDTO> getAllFornecedor() throws Exception, Throwable;

}
