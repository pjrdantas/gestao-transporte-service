package br.com.rd.gestaoTransporte.repository;

import java.util.List;

import br.com.rd.gestaoTransporte.domain.dto.CondutorDTO;

public interface CondutorRepository {

	void addCondutor(CondutorDTO condutorDTO) throws Exception, Throwable;

	void updateCondutor(CondutorDTO condutorDTO) throws Exception, Throwable;

	void deleteCondutor(int idCondutor) throws Exception, Throwable;

	CondutorDTO getCondutorById(int idCondutor) throws Exception, Throwable;

	List<CondutorDTO> getAllCondutor() throws Exception, Throwable;

}
