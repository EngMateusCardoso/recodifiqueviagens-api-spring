package com.recodifiqueviagens.domain;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Agendamento_Destinos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_Agendamento;
	private String nome;
	private String destino;
	private String telefone;
	private String formaPagamento;
	
	public Agendamento_Destinos() {
	}
	
	public Agendamento_Destinos(Long id_Agendamento, String nome, String destino, String telefone,
			String formaPagamento) {
		Id_Agendamento = id_Agendamento;
		this.nome = nome;
		this.destino = destino;
		this.telefone = telefone;
		this.formaPagamento = formaPagamento;
	}

	public Long getId_Agendamento() {
		return Id_Agendamento;
	}

	public void setId_Agendamento(Long id_Agendamento) {
		Id_Agendamento = id_Agendamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id_Agendamento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agendamento_Destinos other = (Agendamento_Destinos) obj;
		return Objects.equals(Id_Agendamento, other.Id_Agendamento);
	}
	
}
 