package br.com.rd.gestaoTransporte.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rd.gestaoTransporte.domain.dto.FilialRotaDTO;
import br.com.rd.gestaoTransporte.repository.FilialRotaRepository;
import br.com.rd.gestaoTransporte.service.FilialRotaService;

@Service
public class FilialRotaServiceImpl implements FilialRotaService {

	@Autowired
	private FilialRotaRepository filialRotaRepository;



	public FilialRotaDTO getFilialRotaById(Long idFilialRota) throws Exception, Throwable {		
		return filialRotaRepository.getFilialRotaById(idFilialRota);
	}

	public List<FilialRotaDTO> getAllFilialRota() throws Exception, Throwable {		
		return filialRotaRepository.getAllFilialRota();
	}
	
	

}
