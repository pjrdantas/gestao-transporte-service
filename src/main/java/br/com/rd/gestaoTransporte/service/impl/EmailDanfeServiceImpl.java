package br.com.rd.gestaoTransporte.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rd.gestaoTransporte.domain.dto.EquipamentoFilialRotaDTO;
import br.com.rd.gestaoTransporte.repository.EmailDanfeRepository;
import br.com.rd.gestaoTransporte.service.EmailDanfeService;

@Service
public class EmailDanfeServiceImpl implements EmailDanfeService {

	@Autowired
	private EmailDanfeRepository emailDanfeRepository;

	public void addEquipamentoFilialRota(EquipamentoFilialRotaDTO equipamentoFilialRotaDTO)	throws Exception, Throwable {
		emailDanfeRepository.addEquipamentoFilialRota(equipamentoFilialRotaDTO);
	}

	public void updateEquipamentoFilialRota(EquipamentoFilialRotaDTO equipamentoFilialRotaDTO) throws Exception, Throwable {
		emailDanfeRepository.updateEquipamentoFilialRota(equipamentoFilialRotaDTO);
	}

	public void deleteEquipamentoFilialRota(int idEquipamentoFilialRota) throws Exception, Throwable {
		emailDanfeRepository.deleteEquipamentoFilialRota(idEquipamentoFilialRota);
	}

	public EquipamentoFilialRotaDTO getEquipamentoFilialRotaById(int idEquipamentoFilialRota) throws Exception, Throwable {
		return emailDanfeRepository.getEquipamentoFilialRotaById(idEquipamentoFilialRota);
	}

	public List<EquipamentoFilialRotaDTO> getAllEquipamentoFilialRota() throws Exception, Throwable {
		return emailDanfeRepository.getAllEquipamentoFilialRota();
	}

}
