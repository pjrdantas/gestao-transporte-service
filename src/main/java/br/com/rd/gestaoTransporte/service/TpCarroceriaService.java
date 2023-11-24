package br.com.rd.gestaoTransporte.service;

import java.util.List;

import br.com.rd.gestaoTransporte.domain.dto.TpCarroceriaDTO;

public interface TpCarroceriaService {
	

	TpCarroceriaDTO getTpCarroceriaById(Long cdTpCarroceria) throws Exception, Throwable;

	List<TpCarroceriaDTO> getAllTpCarroceria() throws Exception, Throwable;

}
