package br.com.rd.gestaoTransporte.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rd.gestaoTransporte.domain.dto.FornecedorDTO;
import br.com.rd.gestaoTransporte.repository.FornecedorRepository;
import br.com.rd.gestaoTransporte.service.FornecedorService;

@Service
public class FornecedorServiceImpl implements FornecedorService {
	
	@Autowired
	private FornecedorRepository fornecedorRepository;


	@Override
	public FornecedorDTO getFornecedorById(Long cdFornecedor) throws Exception, Throwable {
		return fornecedorRepository.getFornecedorById(cdFornecedor);
	}

	@Override
	public List<FornecedorDTO> getAllFornecedor() throws Exception, Throwable {
		return fornecedorRepository.getAllFornecedor();
	}



	

}
