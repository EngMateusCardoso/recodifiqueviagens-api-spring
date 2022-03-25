package com.recodifiqueviagens.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.recodifiqueviagens.domain.Agendamento_Destinos;
import com.recodifiqueviagens.repositories.Agendamento_Destinos_Repository;

@Service
public class Agendamento_Destinos_Service {

	@Autowired
	private Agendamento_Destinos_Repository repository;
	
	public Agendamento_Destinos save(Agendamento_Destinos agendamento) {
		return repository.save(agendamento);
	}
	
	@Transactional(readOnly = true)
	public List<Agendamento_Destinos> findAll(){
		return repository.findAll();
	}
	
	public Agendamento_Destinos findById(Long id) {
		return repository.getById(id);
	}
	
	public Agendamento_Destinos update(Agendamento_Destinos agendamento) {
		return repository.save(agendamento);
	}
	
	public void delete(Agendamento_Destinos agendamento) {
		repository.delete(agendamento);
	}
}
