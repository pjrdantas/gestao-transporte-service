package br.com.rd.gestaoTransporte.repository;

import java.util.List;

import br.com.rd.gestaoTransporte.domain.dto.FilialRotaDTO;

public interface FilialRotaRepository {
	


	FilialRotaDTO getFilialRotaById(Long idFilialRota) throws Exception, Throwable;

	List<FilialRotaDTO> getAllFilialRota() throws Exception, Throwable;


}
