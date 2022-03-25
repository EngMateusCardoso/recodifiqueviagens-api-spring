package com.recodifiqueviagens.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recodifiqueviagens.domain.Agendamento_Destinos;
import com.recodifiqueviagens.services.Agendamento_Destinos_Service;

@RestController
@RequestMapping("/Agendamento")
@CrossOrigin(origins = "*")
public class Agendamento_Destinos_Resource {

	@Autowired
	private Agendamento_Destinos_Service service;

	@PostMapping
	public Agendamento_Destinos save(@RequestBody Agendamento_Destinos agendamento) {
		return service.save(agendamento);
	}

	@GetMapping
	public List<Agendamento_Destinos> findAll() {
		return service.findAll();
	}

	@PutMapping(value = "/{Id_Agendamento}")
	public Agendamento_Destinos update(@PathVariable("Id_Agendamento") Long Id_Agendamento, @RequestBody Agendamento_Destinos agendamento) {
		return service.update(Id_Agendamento, agendamento);
	}
	
	@DeleteMapping(value = "/{Id_Agendamento}")
	public void delete(@PathVariable Long Id_Agendamento) {
		service.delete(service.findById(Id_Agendamento));
	}
}
