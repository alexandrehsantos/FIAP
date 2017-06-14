package br.com.fiap.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity(name = "agenda")
public class Agenda {
	@Id
	@Column(name = "ID")
	private Integer id;
	@Column(name = "DATA")
	private LocalDate data;
	@Column(name = "HORA")
	private LocalDateTime hora;
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy="cpf")
	@NotFound(action=NotFoundAction.IGNORE)
	private Paciente pacientes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalDateTime getHora() {
		return hora;
	}

	public void setHora(LocalDateTime hora) {
		this.hora = hora;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
