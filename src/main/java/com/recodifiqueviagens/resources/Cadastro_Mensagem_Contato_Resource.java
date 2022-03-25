package com.recodifiqueviagens.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recodifiqueviagens.domain.Cadastro_Mensagem_Contato;
import com.recodifiqueviagens.services.Cadastro_Mensagem_Contato_Service;

@RestController
@RequestMapping("/Contato")
@CrossOrigin(origins = "*")
public class Cadastro_Mensagem_Contato_Resource {

	@Autowired
	private Cadastro_Mensagem_Contato_Service service;

	@PostMapping
	public Cadastro_Mensagem_Contato save(@RequestBody Cadastro_Mensagem_Contato msg) {
		return service.save(msg);
	}

	@GetMapping
	public List<Cadastro_Mensagem_Contato> findAll() {
		return service.findAll();
	}

	@DeleteMapping(value = "/{Id_Msg}")
	public void delete(@PathVariable Long Id_Msg) {
		service.delete(service.findById(Id_Msg));
		
	}

}
