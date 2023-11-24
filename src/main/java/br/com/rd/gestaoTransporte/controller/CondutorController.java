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

import br.com.rd.gestaoTransporte.domain.dto.CondutorDTO;
import br.com.rd.gestaoTransporte.service.CondutorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@Validated
@Api(value = "service")
@RequestMapping("/service")
public class CondutorController {
	
	private static final org.slf4j.Logger log =  LoggerFactory.getLogger(CondutorController.class);
	
	@Autowired
	private CondutorService condutorService;
	
	@ApiOperation(value = "incluir condutor")
	@RequestMapping(value = "/condutor", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Void> salvar(@RequestBody CondutorDTO condutorDTO) throws Exception, Throwable {
		
		try {
			this.condutorService.addCondutor(condutorDTO);
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			log.error("Erro na inclus�o do condutor! - DESCRIÇÃO :", e.getMessage());
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@ApiOperation(value = "atualizar condutor")
	@RequestMapping(value = "/condutor", method = RequestMethod.PUT, produces = "application/json")
	public ResponseEntity<Void> atualizar(@RequestBody CondutorDTO condutorDTO) throws Exception, Throwable {
		
		try {
			this.condutorService.updateCondutor(condutorDTO);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			log.error("Erro na atualiza��o do condutor! - DESCRIÇÃO :", e.getMessage());
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	
	@ApiOperation(value = "excluir condutor por id")
	@RequestMapping(value = "/condutor/{idCondutor}", method = RequestMethod.DELETE, produces = "application/json")
	public ResponseEntity<CondutorDTO> excluir(@PathVariable("idCondutor") String idCondutor) throws Exception, Throwable {
		
			int id = Integer.parseInt(idCondutor);
		try {
			condutorService.deleteCondutor(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			log.error("Erro ao listar os condutores! - DESCRIÇÃO :", e.getMessage());
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	
	@ApiOperation(value = "consultar condutor por id")
	@RequestMapping(value = "/condutor/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<CondutorDTO> consultar(@PathVariable("id") int id) throws Exception, Throwable {
					
		try {
			return new ResponseEntity<>(condutorService.getCondutorById(id),(HttpStatus.OK));			
		} catch (Exception e) {
			log.error("Erro ao consultar o condutoro!");
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	

	@ApiOperation(value = "listar todos os condutores")
	@RequestMapping(value = "/condutor", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<CondutorDTO>> listar() throws Exception, Throwable {
		
		try {			
			log.info("Consultando a Lista de Condutores");
			return new ResponseEntity<>(condutorService.getAllCondutor(),(HttpStatus.OK));			
		} catch (Exception e) {
			log.error("Erro ao listar os condutores!");
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
		

}
