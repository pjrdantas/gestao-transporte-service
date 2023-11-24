package br.com.rd.gestaoTransporte.service;

import java.util.List;

import br.com.rd.gestaoTransporte.domain.dto.TipoVeiculoDTO;

public interface TipoVeiculoService {
	

	TipoVeiculoDTO getTipoVeiculoById(Long codigoTipoVeiculo) throws Exception, Throwable;

	List<TipoVeiculoDTO> getAllTipoVeiculo() throws Exception, Throwable;


}
