package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="PEDIDOS")
public class Pedido {

	@Id
	@Column(name="ID")
	private Integer id;

	@OneToMany(mappedBy="Clientes")
	@JoinColumn(name="CLIENTE_ID")
	private Cliente cliente;
	
	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name="DATA")
	private Calendar data;
	
	
	@Column(name="NOME", length=45)
	private String nome; 
	
	@Column(name="EMAIL", length=45)
	private String email;
	
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
