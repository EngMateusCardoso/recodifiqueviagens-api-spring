package com.recodifiqueviagens.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.recodifiqueviagens.domain.Agendamento_Destinos;

@Repository
public interface Agendamento_Destinos_Repository extends JpaRepository<Agendamento_Destinos, Long>{

}
