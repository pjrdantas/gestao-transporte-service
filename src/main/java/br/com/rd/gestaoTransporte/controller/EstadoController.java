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

import br.com.rd.gestaoTransporte.domain.dto.EstadoDTO;
import br.com.rd.gestaoTransporte.service.EstadoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@Validated
@Api(value = "service")
@RequestMapping("/service")
public class EstadoController {

	private static final org.slf4j.Logger log =  LoggerFactory.getLogger(EstadoController.class);
	
	@Autowired
	private EstadoService estadoService;
	

	
	@ApiOperation(value = "consultar Estado por sigla")
	@RequestMapping(value = "/estado/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<EstadoDTO> consultar(@PathVariable("id") String id) throws Exception, Throwable {
					
		try {
			return new ResponseEntity<>(estadoService.getEstadoById(id),(HttpStatus.OK));			
		} catch (Exception e) {
			log.error("Erro ao consultar o Estado! - DESCRIÇÃO :", e.getMessage());
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	

	@ApiOperation(value = "listar todos os Estados")
	@RequestMapping(value = "/estado", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<EstadoDTO>> listar() throws Exception, Throwable {
		
		try {			
			log.info("Consultando a Lista de Estados");
			return new ResponseEntity<>(estadoService.getAllEstado(),(HttpStatus.OK));			
		} catch (Exception e) {
			log.error("Erro ao listar os Estados! - DESCRIÇÃO :",e.getMessage());
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	
	
	
	
		
}
