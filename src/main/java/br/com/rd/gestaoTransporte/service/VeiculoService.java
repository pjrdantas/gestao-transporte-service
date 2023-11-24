package br.com.rd.gestaoTransporte.service;

import java.util.List;

import br.com.rd.gestaoTransporte.domain.dto.VeiculoDTO;

public interface VeiculoService {
	
	void addVeiculo(VeiculoDTO veiculoDTO) throws Exception, Throwable;

	void updateVeiculo(VeiculoDTO veiculoDTO) throws Exception, Throwable;

	void deleteVeiculo(int codigoVeiculo) throws Exception, Throwable;

	VeiculoDTO getVeiculoById(int codigoVeiculo) throws Exception, Throwable;

	List<VeiculoDTO> getAllVeiculo() throws Exception, Throwable;

}
