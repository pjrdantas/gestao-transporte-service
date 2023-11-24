package br.com.rd.gestaoTransporte.service;

import java.util.List;

import br.com.rd.gestaoTransporte.domain.dto.EstadoDTO;

public interface EstadoService {
	


	EstadoDTO getEstadoById(String siglaEstado) throws Exception, Throwable;

	List<EstadoDTO> getAllEstado() throws Exception, Throwable;
	

}
