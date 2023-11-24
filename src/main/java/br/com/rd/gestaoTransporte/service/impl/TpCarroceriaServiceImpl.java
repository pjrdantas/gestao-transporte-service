package br.com.rd.gestaoTransporte.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rd.gestaoTransporte.domain.dto.TpCarroceriaDTO;
import br.com.rd.gestaoTransporte.repository.TpCarroceriaRepository;
import br.com.rd.gestaoTransporte.service.TpCarroceriaService;

@Service
public class TpCarroceriaServiceImpl implements TpCarroceriaService {

	@Autowired
	private TpCarroceriaRepository tpCarroceriaRepository;



	public TpCarroceriaDTO getTpCarroceriaById(Long cdTpCarroceria) throws Exception, Throwable {
		return tpCarroceriaRepository.getTpCarroceriaById(cdTpCarroceria);
	}

	public List<TpCarroceriaDTO> getAllTpCarroceria() throws Exception, Throwable {
		return tpCarroceriaRepository.getAllTpCarroceria();
	}

}
