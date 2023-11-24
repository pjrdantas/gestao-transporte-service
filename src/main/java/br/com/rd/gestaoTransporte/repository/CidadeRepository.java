package br.com.rd.gestaoTransporte.repository;

import java.util.List;

import br.com.rd.gestaoTransporte.domain.dto.CidadeDTO;

public interface CidadeRepository {
	

	CidadeDTO getCidadeById(Long idCidade) throws Exception, Throwable;

	List<CidadeDTO> getAllCidade() throws Exception, Throwable;

}
