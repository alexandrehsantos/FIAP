package br.com.fiap.exercicioIII;

public class MainMedidor {
	public static void main(String[] args) {
		MedidorDeEficiencia medidorDeEficiencia = new MedidorDeEficiencia(Colecoes.arrayList, Colecoes.linkedList,
				Colecoes.stack, Colecoes.hashSet, Colecoes.hashMap, Colecoes.weakHashMap, new Integer(1_000_000), 500_000);
		medidorDeEficiencia.medirEficiencia();
		System.out.println("Coletando Resultados...");
		medidorDeEficiencia.mostrarResultados();
	}
}
