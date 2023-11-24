package br.com.rd.gestaoTransporte.repository;

import java.util.List;

import br.com.rd.gestaoTransporte.domain.dto.MontadoraDTO;

public interface MontadoraRepository {
	


	MontadoraDTO getMontadoraById(Long codigoMontadora) throws Exception, Throwable;

	List<MontadoraDTO> getAllMontadora() throws Exception, Throwable;


}
