package br.com.rd.gestaoTransporte.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rd.gestaoTransporte.domain.dto.EstadoDTO;
import br.com.rd.gestaoTransporte.repository.EstadoRepository;
import br.com.rd.gestaoTransporte.service.EstadoService;

@Service
public class EstadoServiceImpl implements EstadoService {

	@Autowired
	private EstadoRepository estadoRepository;
	


	public EstadoDTO getEstadoById(String siglaEstado) throws Exception, Throwable {
		return estadoRepository.getEstadoById(siglaEstado);
	}

	public List<EstadoDTO> getAllEstado() throws Exception, Throwable {
		return estadoRepository.getAllEstado();
	}

}
