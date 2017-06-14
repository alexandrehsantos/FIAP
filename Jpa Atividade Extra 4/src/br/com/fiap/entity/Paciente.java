package br.com.fiap.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name="paciente")
public class Paciente {
	@Column(name="CPF", unique=true)
	private String cpf;
	@Column(name="NOME")
	private String nome;
	@Column(name="DATANASC")
	private LocalDate dataNascimento;
	@Column(name="TELEFONE")
	private String telefone;
	
	@OneToOne(mappedBy="id")
	private Agenda agenda;

	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
