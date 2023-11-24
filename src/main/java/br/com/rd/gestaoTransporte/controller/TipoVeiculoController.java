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

import br.com.rd.gestaoTransporte.domain.dto.TipoVeiculoDTO;
import br.com.rd.gestaoTransporte.service.TipoVeiculoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@Validated
@Api(value = "service")
@RequestMapping("/service")
public class TipoVeiculoController {

	private static final org.slf4j.Logger log =  LoggerFactory.getLogger(TipoVeiculoController.class);
	
	@Autowired
	private TipoVeiculoService tipoVeiculoService;
	
	
	@ApiOperation(value = "consultar TipoVeiculo por id")
	@RequestMapping(value = "/tipoVeiculo/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<TipoVeiculoDTO> consultar(@PathVariable("id") Long id) throws Exception, Throwable {
					
		try {
			return new ResponseEntity<>(tipoVeiculoService.getTipoVeiculoById(id),(HttpStatus.OK));			
		} catch (Exception e) {
			log.error("Erro ao consultar o TipoVeiculo! - DESCRIÇÃO :", e.getMessage());
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	

	@ApiOperation(value = "listar todos os TipoVeiculos")
	@RequestMapping(value = "/tipoVeiculo", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<TipoVeiculoDTO>> listar() throws Exception, Throwable {
		
		try {			
			log.info("Consultando a Lista de TipoVeiculos");
			return new ResponseEntity<>(tipoVeiculoService.getAllTipoVeiculo(),(HttpStatus.OK));			
		} catch (Exception e) {
			log.error("Erro ao listar os tipoVeiculos! - DESCRIÇÃO :",e.getMessage());
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	
	
	
	
		
}
