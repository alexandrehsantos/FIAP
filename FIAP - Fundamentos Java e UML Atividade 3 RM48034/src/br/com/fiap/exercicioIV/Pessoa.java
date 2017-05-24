package br.com.fiap.exercicioIV;

public class Pessoa {
	private String nome;
	private int idade;
	private char sexo;
	private String empresa;

	public Pessoa(String nome, int idade, char sexo, String empresa) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.empresa = empresa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", empresa=" + empresa + "]";
	}

}
