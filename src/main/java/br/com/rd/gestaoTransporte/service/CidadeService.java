package br.com.rd.gestaoTransporte.service;

import java.util.List;

import br.com.rd.gestaoTransporte.domain.dto.CidadeDTO;

public interface CidadeService {
	


	CidadeDTO getCidadeById(Long idCidade) throws Exception, Throwable;

	List<CidadeDTO> getAllCidade() throws Exception, Throwable;


}
