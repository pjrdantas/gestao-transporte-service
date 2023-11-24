package br.com.rd.gestaoTransporte.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rd.gestaoTransporte.domain.dto.CondutorDTO;
import br.com.rd.gestaoTransporte.repository.CondutorRepository;
import br.com.rd.gestaoTransporte.service.CondutorService;

@Service
public class CondutorServiceImpl implements CondutorService {

	@Autowired
	private CondutorRepository condutorRepository;
	
	public void addCondutor(CondutorDTO condutorDTO) throws Exception, Throwable {		
		condutorRepository.addCondutor(condutorDTO);
	}

	public void updateCondutor(CondutorDTO condutorDTO) throws Exception, Throwable {
		condutorRepository.updateCondutor(condutorDTO);
	}

	public void deleteCondutor(int idCondutor) throws Exception, Throwable {
		condutorRepository.deleteCondutor(idCondutor);
	}

	public CondutorDTO getCondutorById(int idCondutor) throws Exception, Throwable {
		return condutorRepository.getCondutorById(idCondutor);
	}

	public List<CondutorDTO> getAllCondutor() throws Exception, Throwable {		
		return condutorRepository.getAllCondutor();
	}
	

}
