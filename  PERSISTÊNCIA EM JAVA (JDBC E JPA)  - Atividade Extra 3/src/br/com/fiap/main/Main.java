package br.com.fiap.main;

import java.util.Calendar;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.Dao;
import br.com.fiap.dao.GenericDao;
import br.com.fiap.dao.PedidoDAO;
import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Pedido;

public class Main {
	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		cliente.setEmail("xxxx@gmail.com");
		cliente.setNome("Arnaldo");
	
		Pedido pedido = new Pedido();
		pedido.setCliente(cliente);
		Calendar data = Calendar.getInstance();
		data.set(2015, 6, 18, 10, 10);
		pedido.setData(data);

		new PedidoDAO(classe)
	}
}
