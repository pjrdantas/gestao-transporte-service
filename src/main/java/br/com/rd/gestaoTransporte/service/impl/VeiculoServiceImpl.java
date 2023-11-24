package br.com.rd.gestaoTransporte.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rd.gestaoTransporte.domain.dto.VeiculoDTO;
import br.com.rd.gestaoTransporte.repository.VeiculoRepository;
import br.com.rd.gestaoTransporte.service.VeiculoService;

@Service
public class VeiculoServiceImpl implements VeiculoService{

	@Autowired
	private VeiculoRepository veiculoRepository;

	public void addVeiculo(VeiculoDTO veiculoDTO) throws Exception, Throwable {
		veiculoRepository.addVeiculo(veiculoDTO);		
	}

	public void updateVeiculo(VeiculoDTO veiculoDTO) throws Exception, Throwable {
		veiculoRepository.updateVeiculo(veiculoDTO);		
	}

	public void deleteVeiculo(int codigoVeiculo) throws Exception, Throwable {
		veiculoRepository.deleteVeiculo(codigoVeiculo);		
	}

	public VeiculoDTO getVeiculoById(int codigoVeiculo) throws Exception, Throwable {
		return veiculoRepository.getVeiculoById(codigoVeiculo);
	}

	public List<VeiculoDTO> getAllVeiculo() throws Exception, Throwable {
		return veiculoRepository.getAllVeiculo();
	}

}
