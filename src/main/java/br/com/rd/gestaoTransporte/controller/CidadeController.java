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

import br.com.rd.gestaoTransporte.domain.dto.CidadeDTO;
import br.com.rd.gestaoTransporte.service.CidadeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@Validated
@Api(value = "service")
@RequestMapping("/service")
public class CidadeController {

	private static final org.slf4j.Logger log =  LoggerFactory.getLogger(CidadeController.class);
	
	@Autowired
	private CidadeService cidadeService;
	

	
	
	@ApiOperation(value = "consultar Cidade por id")
	@RequestMapping(value = "/cidade/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<CidadeDTO> consultar(@PathVariable("id") Long id) throws Exception, Throwable {
					
		try {
			return new ResponseEntity<>(cidadeService.getCidadeById(id),(HttpStatus.OK));			
		} catch (Exception e) {
			log.error("Erro ao consultar a Cidade! - DESCRIÇÃO :", e.getMessage());
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	

	@ApiOperation(value = "listar todos os cidades")
	@RequestMapping(value = "/cidade", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<CidadeDTO>> listar() throws Exception, Throwable {
		
		try {			
			log.info("Consultando a Lista de Cidades");
			return new ResponseEntity<>(cidadeService.getAllCidade(),(HttpStatus.OK));			
		} catch (Exception e) {
			log.error("Erro ao listar os cidades! - DESCRIÇÃO :",e.getMessage());
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	
	
	
	
	
}
