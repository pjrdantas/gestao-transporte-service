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

import br.com.rd.gestaoTransporte.domain.dto.MontadoraDTO;
import br.com.rd.gestaoTransporte.service.MontadoraService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@Validated
@Api(value = "service")
@RequestMapping("/service")
public class MontadoraController {

	private static final org.slf4j.Logger log =  LoggerFactory.getLogger(MontadoraController.class);
	
	@Autowired
	private MontadoraService montadoraService;
	
	
	@ApiOperation(value = "consultar montadora por id")
	@RequestMapping(value = "/montadora/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<MontadoraDTO> consultar(@PathVariable("id") Long id) throws Exception, Throwable {
					
		try {
			return new ResponseEntity<>(montadoraService.getMontadoraById(id),(HttpStatus.OK));			
		} catch (Exception e) {
			log.error("Erro ao consultar a montadora! - DESCRIÇÃO :", e.getMessage());
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	

	@ApiOperation(value = "listar todos os montadoras")
	@RequestMapping(value = "/montadora", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<MontadoraDTO>> listar() throws Exception, Throwable {
		
		try {			
			log.info("Consultando a Lista de Montadoras");
			return new ResponseEntity<>(montadoraService.getAllMontadora(),(HttpStatus.OK));			
		} catch (Exception e) {
			log.error("Erro ao listar os montadoras! - DESCRIÇÃO :",e.getMessage());
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	
	
	
	
		
}
