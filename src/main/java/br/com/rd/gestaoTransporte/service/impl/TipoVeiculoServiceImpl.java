package br.com.rd.gestaoTransporte.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rd.gestaoTransporte.domain.dto.TipoVeiculoDTO;
import br.com.rd.gestaoTransporte.repository.TipoVeiculoRepository;
import br.com.rd.gestaoTransporte.service.TipoVeiculoService;

@Service
public class TipoVeiculoServiceImpl implements TipoVeiculoService{

	@Autowired
	private TipoVeiculoRepository tipoVeiculoRepository;


	public TipoVeiculoDTO getTipoVeiculoById(Long codigoTipoVeiculo) throws Exception, Throwable {
		return tipoVeiculoRepository.getTipoVeiculoById(codigoTipoVeiculo);
	}

	public List<TipoVeiculoDTO> getAllTipoVeiculo() throws Exception, Throwable {
		return tipoVeiculoRepository.getAllTipoVeiculo();
	}

}
