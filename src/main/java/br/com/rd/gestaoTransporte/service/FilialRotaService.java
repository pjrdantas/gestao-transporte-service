package br.com.rd.gestaoTransporte.service;

import java.util.List;

import br.com.rd.gestaoTransporte.domain.dto.FilialRotaDTO;

public interface FilialRotaService {
	


	FilialRotaDTO getFilialRotaById(Long idFilialRota) throws Exception, Throwable;

	List<FilialRotaDTO> getAllFilialRota() throws Exception, Throwable;

}
