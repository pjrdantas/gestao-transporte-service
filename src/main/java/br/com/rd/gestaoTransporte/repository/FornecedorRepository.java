package br.com.rd.gestaoTransporte.repository;

import java.util.List;

import br.com.rd.gestaoTransporte.domain.dto.FornecedorDTO;

public interface FornecedorRepository {



	FornecedorDTO getFornecedorById(Long cdFornecedor) throws Exception, Throwable;

	List<FornecedorDTO> getAllFornecedor() throws Exception, Throwable;

}
