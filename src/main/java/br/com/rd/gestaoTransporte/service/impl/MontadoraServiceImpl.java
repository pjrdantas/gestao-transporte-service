package br.com.rd.gestaoTransporte.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rd.gestaoTransporte.domain.dto.MontadoraDTO;
import br.com.rd.gestaoTransporte.repository.MontadoraRepository;
import br.com.rd.gestaoTransporte.service.MontadoraService;

@Service
public class MontadoraServiceImpl implements MontadoraService {

	@Autowired
	private MontadoraRepository montadoraRepository;



	public MontadoraDTO getMontadoraById(Long codigoMontadora) throws Exception, Throwable {
		return montadoraRepository.getMontadoraById(codigoMontadora);
	}

	public List<MontadoraDTO> getAllMontadora() throws Exception, Throwable {
		return montadoraRepository.getAllMontadora();
	}

}
