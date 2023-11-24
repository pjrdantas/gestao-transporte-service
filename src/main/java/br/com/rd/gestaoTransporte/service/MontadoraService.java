package br.com.rd.gestaoTransporte.service;

import java.util.List;

import br.com.rd.gestaoTransporte.domain.dto.MontadoraDTO;

public interface MontadoraService {
	


	MontadoraDTO getMontadoraById(Long codigoMontadora) throws Exception, Throwable;

	List<MontadoraDTO> getAllMontadora() throws Exception, Throwable;

}
