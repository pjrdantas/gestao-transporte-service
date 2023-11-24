package br.com.rd.gestaoTransporte.repository;

import java.util.List;

import br.com.rd.gestaoTransporte.domain.dto.TipoVeiculoDTO;

public interface TipoVeiculoRepository {
	


	TipoVeiculoDTO getTipoVeiculoById(Long codigoTipoVeiculo) throws Exception, Throwable;

	List<TipoVeiculoDTO> getAllTipoVeiculo() throws Exception, Throwable;


}
