package com.recodifiqueviagens.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.recodifiqueviagens.domain.Cadastro_Mensagem_Contato;

@Repository
public interface Cadastro_Mensagem_Contato_Repository extends JpaRepository<Cadastro_Mensagem_Contato, Long>{

}
