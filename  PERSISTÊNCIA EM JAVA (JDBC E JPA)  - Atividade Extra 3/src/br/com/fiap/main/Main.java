package br.com.fiap.main;

import java.util.Calendar;
import java.util.List;

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

		PedidoDAO pedidoDAO = new PedidoDAO(Pedido.class);
		pedidoDAO.adicionar(pedido);
		
		pedido.setDescricao("xxxxxxx - yyyyyyyyyyyyy- zzzzzzzzz");
		
		pedidoDAO.atualizar(pedido);
		
		Cliente cliente2 = new Cliente();
		cliente2.setEmail("aaaa@gmail.com");
		cliente2.setNome("Amelia");
		
		Pedido pedido2 = new Pedido();
		pedido2.setCliente(cliente2);
		pedido2.setData(data);
		pedido2.setValor(2.34d);
		
		pedidoDAO.adicionar(pedido2);
		
		
		List<Pedido> listar = pedidoDAO.listar();
		listar.forEach( p -> {System.out.print(p.getCliente() + " "); System.out.println("PEDIDO " + p); });
		
		
		
		
		
	}
}
