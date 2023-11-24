package br.com.rd.gestaoTransporte.repository;

import java.util.List;

import br.com.rd.gestaoTransporte.domain.dto.EstadoDTO;

public interface EstadoRepository {
	


	EstadoDTO getEstadoById(String siglaEstado) throws Exception, Throwable;

	List<EstadoDTO> getAllEstado() throws Exception, Throwable;


}
