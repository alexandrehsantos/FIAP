package br.com.fiap.ExercicioIII;

public enum Cores {
		
	Branco("Branco",21), 
	Preto("Preto",22), 
	Vermelho("Vermelho",23), 
	Amarelo("Amarelo",24), 
	Azul("Azul",25);
	
	
	Cores(String nomeDaCor, int codigoDaCor){
		this.nomeDaCor = nomeDaCor;
		this.codigoDaCor = codigoDaCor;
	}
	
	private String nomeDaCor;
	private int codigoDaCor;
	
	public int recuperarCodigoDaCor() {
		return codigoDaCor;
	}
	public String recuperarNomeDaCor(){
		return nomeDaCor;
	}
	
}
