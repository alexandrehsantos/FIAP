package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PEDIDOS")
public class Pedido {

	@Id
	@Column(name="ID")
	private Integer id;

	@OneToMany(mappedBy="Clientes")
	@Column(name="IDCLIENTE")
	private Integer idCliente;
	
	
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
