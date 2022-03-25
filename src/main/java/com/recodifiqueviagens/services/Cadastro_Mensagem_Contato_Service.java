package com.recodifiqueviagens.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.recodifiqueviagens.domain.Cadastro_Mensagem_Contato;
import com.recodifiqueviagens.repositories.Cadastro_Mensagem_Contato_Repository;

@Service
public class Cadastro_Mensagem_Contato_Service {

	@Autowired
	private Cadastro_Mensagem_Contato_Repository repository;
	
	public Cadastro_Mensagem_Contato save(Cadastro_Mensagem_Contato msg) {
		return repository.save(msg);
	}
	
	@Transactional(readOnly = true)
	public List<Cadastro_Mensagem_Contato> findAll(){
		return repository.findAll();
	}
	
	public Cadastro_Mensagem_Contato findById(Long id) {
		return repository.getById(id);
	}
	
	public Cadastro_Mensagem_Contato update(long id, Cadastro_Mensagem_Contato msg) {
		return repository.findById(id).map(Cadastro_Mensagem_Contato -> {
			Cadastro_Mensagem_Contato.setAceitaReceberNot(msg.getAceitaReceberNot());
			Cadastro_Mensagem_Contato.setEmail(msg.getEmail());
			Cadastro_Mensagem_Contato.setMsg(msg.getMsg());
			Cadastro_Mensagem_Contato.setNomeDeContato(msg.getNomeDeContato());
			return repository.save(msg);
		}).orElseGet(()->{
			msg.setId_Msg(id);
			return repository.save(msg);
		});
	}
	
	public void delete(Cadastro_Mensagem_Contato msg) {
		repository.delete(msg);
	}
}
