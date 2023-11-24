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

import br.com.rd.gestaoTransporte.domain.dto.FornecedorDTO;
import br.com.rd.gestaoTransporte.service.FornecedorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@Validated
@Api(value = "service")
@RequestMapping("/service")
public class FornecedorController {

	private static final org.slf4j.Logger log = LoggerFactory.getLogger(FornecedorController.class);

	@Autowired
	private FornecedorService fornecedorService;


	
	@ApiOperation(value = "consultar fornecedor por id")
	@RequestMapping(value = "/fornecedor/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<FornecedorDTO> consultar(@PathVariable("id") String idFornecedor) throws Exception, Throwable {

		Long cdFornecedor = Long.parseLong(idFornecedor);
		try {
			return new ResponseEntity<>(fornecedorService.getFornecedorById(cdFornecedor), (HttpStatus.OK));
		} catch (Exception e) {
			log.error("Erro ao listar os fornecedores! - DESCRIÇÃO :", e.getMessage());
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@ApiOperation(value = "listar todos os fornecedores")
	@RequestMapping(value = "/fornecedor", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<FornecedorDTO>> listar() throws Exception, Throwable {

		try {
			return new ResponseEntity<>(fornecedorService.getAllFornecedor(), (HttpStatus.OK));
		} catch (Exception e) {
			log.error("Erro ao listar os fornecedores! - DESCRIÇÃO :", e.getMessage());
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}




}