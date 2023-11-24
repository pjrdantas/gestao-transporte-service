package br.com.rd.gestaoTransporte.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.rd.gestaoTransporte.domain.dto.EquipamentoFilialRotaDTO;
import br.com.rd.gestaoTransporte.service.EmailDanfeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@Validated
@Api(value = "service")
@RequestMapping("/service")
public class EmailDanfeController {
	
	
	
	private static final org.slf4j.Logger log =  LoggerFactory.getLogger(EmailDanfeController.class);
	
	@Autowired
	private EmailDanfeService emailDanfeService;
	
	@ApiOperation(value = "incluir equipamento-filial-rota")
	@RequestMapping(value = "/equipamentoFilialRota", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Void> salvar(@RequestBody EquipamentoFilialRotaDTO equipamentoFilialRotaDTO) throws Exception, Throwable {
		
		try {
			this.emailDanfeService.addEquipamentoFilialRota(equipamentoFilialRotaDTO);
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			log.error("Erro na inclus�o do equipamento-filial-rota! - DESCRIÇÃO :", e.getMessage());
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@ApiOperation(value = "atualizar equipamento-filial-rota")
	@RequestMapping(value = "/equipamentoFilialRota", method = RequestMethod.PUT, produces = "application/json")
	public ResponseEntity<Void> atualizar(@RequestBody EquipamentoFilialRotaDTO equipamentoFilialRotaDTO) throws Exception, Throwable {
		
		try {
			this.emailDanfeService.updateEquipamentoFilialRota(equipamentoFilialRotaDTO);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			log.error("Erro na atualiza��o do equipamento-filial-rota! - DESCRIÇÃO :", e.getMessage());
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	
	@ApiOperation(value = "excluir equipamento-filial-rota por id")
	@RequestMapping(value = "/equipamentoFilialRota/{idEquipamentoFilialRota}", method = RequestMethod.DELETE, produces = "application/json")
	public ResponseEntity<EquipamentoFilialRotaDTO> excluir(@PathVariable("idEquipamentoFilialRota") String idEquipamentoFilialRota) throws Exception, Throwable {
		
			int id = Integer.parseInt(idEquipamentoFilialRota);
		try {
			emailDanfeService.deleteEquipamentoFilialRota(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			log.error("Erro ao listar os equipamento-filial-rotaes! - DESCRIÇÃO :", e.getMessage());
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
		
	
	@ApiOperation(value = "consultar equipamento-filial-rota por id")
	@RequestMapping(value = "/equipamentoFilialRota/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<EquipamentoFilialRotaDTO> consultar(@PathVariable("id") int id) throws Exception, Throwable {
					
		try {
			return new ResponseEntity<>(emailDanfeService.getEquipamentoFilialRotaById(id),(HttpStatus.OK));			
		} catch (Exception e) {
			log.error("Erro ao consultar o equipamento-filial-rota! - DESCRIÇÃO :", e.getMessage());
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	

	@ApiOperation(value = "listar todos os equipamento-filial-rota")
	@RequestMapping(value = "/equipamentoFilialRota", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<EquipamentoFilialRotaDTO>> listar() throws Exception, Throwable {
		
		try {			
			log.info("Consultando a Lista de Equipamento-filial-rota");
			return new ResponseEntity<>(emailDanfeService.getAllEquipamentoFilialRota(),(HttpStatus.OK));			
		} catch (Exception e) {
			log.error("Erro ao listar os equipamento-filial-rota! - DESCRIÇÃO :",e.getMessage());
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	
		
	
	

}
