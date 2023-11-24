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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.rd.gestaoTransporte.domain.dto.FilialRotaDTO;
import br.com.rd.gestaoTransporte.service.FilialRotaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@Validated
@Api(value = "service")
@RequestMapping("/service")
public class FilialRotaController {
	
	private static final org.slf4j.Logger log =  LoggerFactory.getLogger(FilialRotaController.class);
	
	@Autowired
	private FilialRotaService filialRotaService;
	

		
	
	@ApiOperation(value = "consultar filial-rota por id")
	@RequestMapping(value = "/filialRota/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<FilialRotaDTO> consultar(@PathVariable("id") Long id) throws Exception, Throwable {
					
		try {
			return new ResponseEntity<>(filialRotaService.getFilialRotaById(id),(HttpStatus.OK));			
		} catch (Exception e) {
			log.error("Erro ao consultar o filial-rota! - DESCRIÇÃO :", e.getMessage());
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	

	@ApiOperation(value = "listar todos as filialRota")
	@RequestMapping(value = "/filialRota", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<FilialRotaDTO>> listar() throws Exception, Throwable {
		
		try {			
			log.info("Consultando a Lista de filial-rota");
			return new ResponseEntity<>(filialRotaService.getAllFilialRota(),(HttpStatus.OK));			
		} catch (Exception e) {
			log.error("Erro ao listar as filial-rota! - DESCRIÇÃO :",e.getMessage());
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	
		
	
	


}
