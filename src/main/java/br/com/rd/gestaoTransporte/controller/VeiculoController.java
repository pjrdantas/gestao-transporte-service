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

import br.com.rd.gestaoTransporte.domain.dto.VeiculoDTO;
import br.com.rd.gestaoTransporte.service.VeiculoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@Validated
@Api(value = "service")
@RequestMapping("/service")
public class VeiculoController {
	
	private static final org.slf4j.Logger log =  LoggerFactory.getLogger(VeiculoController.class);
	
	@Autowired
	private VeiculoService veiculoService;
	
	@ApiOperation(value = "incluir veiculo")
	@RequestMapping(value = "/veiculo", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Void> salvar(@RequestBody VeiculoDTO veiculoDTO) throws Exception, Throwable {
		
		try {
			this.veiculoService.addVeiculo(veiculoDTO);
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			log.error("Erro na inclus�o do veiculo! - DESCRIÇÃO :", e.getMessage());
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@ApiOperation(value = "atualizar veiculo")
	@RequestMapping(value = "/veiculo", method = RequestMethod.PUT, produces = "application/json")
	public ResponseEntity<Void> atualizar(@RequestBody VeiculoDTO veiculoDTO) throws Exception, Throwable {
		
		try {
			this.veiculoService.updateVeiculo(veiculoDTO);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			log.error("Erro na atualiza��o do veiculo! - DESCRIÇÃO :", e.getMessage());
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	
	@ApiOperation(value = "excluir veiculo por id")
	@RequestMapping(value = "/veiculo/{idVeiculo}", method = RequestMethod.DELETE, produces = "application/json")
	public ResponseEntity<VeiculoDTO> excluir(@PathVariable("codigoVeiculo") int codigoVeiculo) throws Exception, Throwable {
		
			 
		try {
			veiculoService.deleteVeiculo(codigoVeiculo);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			log.error("Erro ao listar os veiculos! - DESCRIÇÃO :", e.getMessage());
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	
	@ApiOperation(value = "consultar veiculo por id")
	@RequestMapping(value = "/veiculo/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<VeiculoDTO> consultar(@PathVariable("id") int id) throws Exception, Throwable {
						 
		try {
			return new ResponseEntity<>(veiculoService.getVeiculoById(id),(HttpStatus.OK));			
		} catch (Exception e) {
			log.error("Erro ao consultar o veiculo!",e.getLocalizedMessage());
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	

	@ApiOperation(value = "listar todos os veiculos")
	@RequestMapping(value = "/veiculo", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<VeiculoDTO>> listar() throws Exception, Throwable {
		
		try {			
			log.info("Consultando a Lista de Veiculos");
			return new ResponseEntity<>(veiculoService.getAllVeiculo(),(HttpStatus.OK));			
		} catch (Exception e) {
			log.error("Erro ao listar os veiculos!");
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	

}
