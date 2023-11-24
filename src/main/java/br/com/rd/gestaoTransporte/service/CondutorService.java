package br.com.rd.gestaoTransporte.service;

import java.util.List;

import br.com.rd.gestaoTransporte.domain.dto.CondutorDTO;

public interface CondutorService {
	
	void addCondutor(CondutorDTO condutorDTO) throws Exception, Throwable;
	
	void updateCondutor(CondutorDTO condutorDTO) throws Exception, Throwable;
	
	void deleteCondutor(int idCondutor) throws Exception, Throwable;
	
	CondutorDTO getCondutorById(int idCondutor) throws Exception, Throwable;
	
	List<CondutorDTO> getAllCondutor() throws Exception, Throwable;
		

}
