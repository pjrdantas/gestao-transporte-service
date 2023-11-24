package br.com.rd.gestaoTransporte.repository;

import java.util.List;

import br.com.rd.gestaoTransporte.domain.dto.TpCarroceriaDTO;

public interface TpCarroceriaRepository {
	


	TpCarroceriaDTO getTpCarroceriaById(Long cdTpCarroceria) throws Exception, Throwable;

	List<TpCarroceriaDTO> getAllTpCarroceria() throws Exception, Throwable;

}
