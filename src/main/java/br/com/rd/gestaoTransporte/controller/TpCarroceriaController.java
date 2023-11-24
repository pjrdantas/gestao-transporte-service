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

import br.com.rd.gestaoTransporte.domain.dto.TpCarroceriaDTO;
import br.com.rd.gestaoTransporte.service.TpCarroceriaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@Validated
@Api(value = "service")
@RequestMapping("/service")
public class TpCarroceriaController {

	private static final org.slf4j.Logger log =  LoggerFactory.getLogger(TpCarroceriaController.class);
	
	@Autowired
	private TpCarroceriaService tpCarroceriaService;
	

	
	
	@ApiOperation(value = "consultar TpCarroceria por id")
	@RequestMapping(value = "/tpCarroceria/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<TpCarroceriaDTO> consultar(@PathVariable("id") Long id) throws Exception, Throwable {
					
		try {
			return new ResponseEntity<>(tpCarroceriaService.getTpCarroceriaById(id),(HttpStatus.OK));			
		} catch (Exception e) {
			log.error("Erro ao consultar o TpCarroceria! - DESCRIÇÃO :", e.getMessage());
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	

	@ApiOperation(value = "listar todos os TpCarrocerias")
	@RequestMapping(value = "/tpCarroceria", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<TpCarroceriaDTO>> listar() throws Exception, Throwable {
		
		try {			
			log.info("Consultando a Lista de TpCarrocerias");
			return new ResponseEntity<>(tpCarroceriaService.getAllTpCarroceria(),(HttpStatus.OK));			
		} catch (Exception e) {
			log.error("Erro ao listar os TpCarrocerias! - DESCRIÇÃO :",e.getMessage());
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	
	
	
	
	
}
