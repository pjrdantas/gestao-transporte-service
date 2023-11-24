package br.com.rd.gestaoTransporte.repository;

import java.util.List;

import br.com.rd.gestaoTransporte.domain.dto.VeiculoDTO;

public interface VeiculoRepository {
	
	void addVeiculo(VeiculoDTO veiculoDTO) throws Exception, Throwable;

	void updateVeiculo(VeiculoDTO veiculoDTO) throws Exception, Throwable;

	void deleteVeiculo(int codigoVeiculo) throws Exception, Throwable;

	VeiculoDTO getVeiculoById(int codigoVeiculo) throws Exception, Throwable;

	List<VeiculoDTO> getAllVeiculo() throws Exception, Throwable;

}
