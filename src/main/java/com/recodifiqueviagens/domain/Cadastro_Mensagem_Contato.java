package com.recodifiqueviagens.domain;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cadastro_Mensagem_Contato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_Msg;
	private String nomeDeContato;
	private String email;
	private String msg;
	private Boolean aceitaReceberNot;
	
	public Cadastro_Mensagem_Contato() {
		
	}
	
	public Cadastro_Mensagem_Contato(Long id_Msg, String nomeDeContato, String email, String msg,
			Boolean aceitaReceberNot) {
		Id_Msg = id_Msg;
		this.nomeDeContato = nomeDeContato;
		this.email = email;
		this.msg = msg;
		this.aceitaReceberNot = aceitaReceberNot;
	}

	public Long getId_Msg() {
		return Id_Msg;
	}

	public void setId_Msg(Long id_Msg) {
		Id_Msg = id_Msg;
	}

	public String getNomeDeContato() {
		return nomeDeContato;
	}

	public void setNomeDeContato(String nomeDeContato) {
		this.nomeDeContato = nomeDeContato;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Boolean getAceitaReceberNot() {
		return aceitaReceberNot;
	}

	public void setAceitaReceberNot(Boolean aceitaReceberNot) {
		this.aceitaReceberNot = aceitaReceberNot;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id_Msg);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cadastro_Mensagem_Contato other = (Cadastro_Mensagem_Contato) obj;
		return Objects.equals(Id_Msg, other.Id_Msg);
	}
	
}
