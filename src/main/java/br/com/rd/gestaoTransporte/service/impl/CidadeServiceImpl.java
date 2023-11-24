package br.com.rd.gestaoTransporte.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rd.gestaoTransporte.domain.dto.CidadeDTO;
import br.com.rd.gestaoTransporte.repository.CidadeRepository;
import br.com.rd.gestaoTransporte.service.CidadeService;

@Service
public class CidadeServiceImpl implements CidadeService {

	@Autowired 
	private CidadeRepository cidadeRepository;
	

	 
	public CidadeDTO getCidadeById(Long idCidade) throws Exception, Throwable {		 
		return cidadeRepository.getCidadeById(idCidade);
	}
	 
	public List<CidadeDTO> getAllCidade() throws Exception, Throwable {		
		return cidadeRepository.getAllCidade();
	}

}
