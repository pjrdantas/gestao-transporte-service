package br.com.rd.gestaoTransporte.repository;

import java.util.List;

import br.com.rd.gestaoTransporte.domain.dto.EquipamentoFilialRotaDTO;

public interface EmailDanfeRepository {

	void addEquipamentoFilialRota(EquipamentoFilialRotaDTO equipamentoFilialRotaDTO) throws Exception, Throwable;

	void updateEquipamentoFilialRota(EquipamentoFilialRotaDTO equipamentoFilialRotaDTO) throws Exception, Throwable;

	void deleteEquipamentoFilialRota(int idEquipamentoFilialRota) throws Exception, Throwable;

	EquipamentoFilialRotaDTO getEquipamentoFilialRotaById(int idEquipamentoFilialRota) throws Exception, Throwable;

	List<EquipamentoFilialRotaDTO> getAllEquipamentoFilialRota() throws Exception, Throwable;

}
