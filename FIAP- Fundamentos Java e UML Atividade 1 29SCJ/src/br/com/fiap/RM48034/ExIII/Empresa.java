package br.com.fiap.RM48034.ExIII;

import javax.swing.JOptionPane;

public class Empresa {

	private Funcionario[] funcionarios;
	private int quantidadeFuncionarios;

	private void quantidadeFuncionarios(int quantidade) {
		this.quantidadeFuncionarios = quantidade;
	}

	private void adicionaFuncionario(Funcionario funcionario, int posicao) {
		this.funcionarios[posicao] = funcionario;
	}

	private Double calculaMediaSalarial() {
		Double salarios = null;
		for (Funcionario funcionario : this.funcionarios) {
			salarios = +funcionario.getSalario();
		}
		return salarios / funcionarios.length;
	}

	public void executarRotinaPadrao() {
		String showInputDialog1 = JOptionPane.showInputDialog("Entre com a quantidade de funcionarios");
		Integer qtFuncionarios = new Integer(showInputDialog1);
		funcionarios = new Funcionario[qtFuncionarios];
		this.quantidadeFuncionarios(qtFuncionarios);

		for (int i = 0; i < this.quantidadeFuncionarios; i++) {
			String showInputDialog2 = JOptionPane.showInputDialog("Entre com o valor do salário");
			Double valorSalario = new Double(showInputDialog2);
			Funcionario novoFuncionario = new Funcionario();
			novoFuncionario.setSalario(valorSalario);
			adicionaFuncionario(novoFuncionario, i);
		}
		System.out.println("Media salarial:" + calculaMediaSalarial());
	}

	public Funcionario[] getFuncionario() {
		return funcionarios;
	}

	public void setFuncionario(Funcionario[] funcionario) {
		this.funcionarios = funcionario;
	}

}
