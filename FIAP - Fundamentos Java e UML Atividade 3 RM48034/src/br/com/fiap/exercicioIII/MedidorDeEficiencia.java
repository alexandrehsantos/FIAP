package br.com.fiap.exercicioIII;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;
import java.util.WeakHashMap;

public class MedidorDeEficiencia {

	private Colecoes arrayList;
	private Colecoes linkedList;
	private Colecoes stack;
	private Colecoes hashSet;
	private Colecoes hashMap;
	private Colecoes weakHashMap;
	private Integer qtElementos;
	private Integer elementoProcurado;

	Map<String, Long> resultadosInsercao;
	Map<String, Long> resultadosBusca;

	public MedidorDeEficiencia(Colecoes arrayList, Colecoes lisnkedList, Colecoes stack, Colecoes hashSet,
			Colecoes hashMap, Colecoes weakHashMap, Integer qtElementos, Integer elementoProcurado) {
		super();
		this.arrayList = arrayList;
		this.linkedList = lisnkedList;
		this.stack = stack;
		this.hashSet = hashSet;
		this.hashMap = hashMap;
		this.weakHashMap = weakHashMap;
		this.qtElementos = qtElementos;
		this.elementoProcurado = elementoProcurado;
	}

	public void mostrarResultados() {
		Set<Entry<String, Long>> resultadoInsercoes = resultadosInsercao.entrySet();

		for (Entry<String, Long> entry : resultadoInsercoes) {
			System.out.println("Colecao " + entry.getKey() + " demorou: \n" + entry.getValue() + "ms para inserir "
					+ qtElementos + " elementos \n" );
		}

		Set<Entry<String, Long>> resultadoBuscas = resultadosBusca.entrySet();
		for (Entry<String, Long> entry : resultadoBuscas) {
			System.out.println("Colecao " + entry.getKey() + " demorou: \n" + entry.getValue()
					+ "ms para buscar o elemento na posicao " + this.elementoProcurado +"\n");
		}
	}

	public void medirEficiencia() {
		resultadosInsercao = new HashMap<>();
		resultadosBusca = new HashMap<>();

		this.executarInsercaoList(this.arrayList, new ArrayList<>());
		this.executarInsercaoList(this.linkedList, new LinkedList<>());
		this.executarInsercaoList(this.stack, new Stack<>());
		this.executarInsercaoSet(this.hashSet, new HashSet<>());
		this.executarInsercaoMap(this.hashMap, new HashMap<>());
		this.executarInsercaoMap(this.weakHashMap, new WeakHashMap<>());
	}

	private void executarInsercaoList(Colecoes colecaoDesc, List<Integer> colecao) {
		if (colecaoDesc.getOn()) {
			LocalDateTime inicio = retornarDateTime();
			if (this.adicionarElementosList(colecao, this.qtElementos)) {
				LocalDateTime fim = retornarDateTime();
				Long duracao = this.retornarDiferenca(inicio, fim);
				resultadosInsercao.put(colecaoDesc.getColecao(), duracao);
				this.executarBuscaList(colecaoDesc, colecao);
			}

		}
	}

	private void executarInsercaoSet(Colecoes colecaoDesc, Set<Integer> colecao) {
		if (colecaoDesc.getOn()) {
			LocalDateTime inicio = retornarDateTime();
			if (this.adicionarElementosSet(colecao, this.qtElementos)) {
				LocalDateTime fim = retornarDateTime();
				Long duracao = this.retornarDiferenca(inicio, fim);
				resultadosInsercao.put(colecaoDesc.getColecao().toString(), duracao);
				this.executarBuscaSet(colecaoDesc, colecao);
			}
		}
	}

	private void executarInsercaoMap(Colecoes colecaoDesc, Map<Integer, Integer> colecao) {
		if (colecaoDesc.getOn()) {
			LocalDateTime inicio = retornarDateTime();
			if (this.adicionarElementosMap(colecao, this.qtElementos)) {
				LocalDateTime fim = retornarDateTime();
				Long duracao = this.retornarDiferenca(inicio, fim);
				resultadosInsercao.put(colecaoDesc.getColecao(), duracao);
				this.executarBuscaMap(colecaoDesc, colecao);
			}
		}
	}
	
	
	private void executarBuscaList(Colecoes colecaoDesc, List<Integer> colecao) {
		if (colecaoDesc.getOn()) {
			LocalDateTime inicio = retornarDateTime();
			if (this.buscarItemList(colecao)) {
				LocalDateTime fim = retornarDateTime();
				Long duracao = this.retornarDiferenca(inicio, fim);
				resultadosBusca.put(colecaoDesc.getColecao(), duracao);
			}

		}
	}

	private void executarBuscaSet(Colecoes colecaoDesc, Set<Integer> colecao) {
		if (colecaoDesc.getOn()) {
			LocalDateTime inicio = retornarDateTime();
			if (this.buscarItemSet(colecao)) {
				LocalDateTime fim = retornarDateTime();
				Long duracao = this.retornarDiferenca(inicio, fim);
				resultadosBusca.put(colecaoDesc.getColecao(), duracao);
			}

		}
	}

	private void executarBuscaMap(Colecoes colecaoDesc, Map<Integer, Integer> colecao) {
		if (colecaoDesc.getOn()) {
			LocalDateTime inicio = retornarDateTime();
			if (this.buscarItemMap(colecao)) {
				LocalDateTime fim = retornarDateTime();
				Long duracao = this.retornarDiferenca(inicio, fim);
				resultadosBusca.put(colecaoDesc.getColecao(), duracao);
			}

		}
	}

	

	private LocalDateTime retornarDateTime() {
		return LocalDateTime.now();
	}

	private Long retornarDiferenca(LocalDateTime horarioInicio, LocalDateTime horarioFim) {
		return ChronoUnit.MILLIS.between(horarioInicio, horarioFim);
	}

	private boolean buscarItemList(List<Integer> colecao) {
		colecao.get(this.elementoProcurado);
		return true;
	}

	private boolean buscarItemSet(Set<Integer> colecao) {
		for (Integer integer : colecao) {
			if (integer == this.elementoProcurado)
				return true;
		}
		return false;
	}

	private boolean buscarItemMap(Map<Integer, Integer> colecao) {
		colecao.get(this.elementoProcurado);
		return true;
	}

	private boolean adicionarElementosList(List<Integer> colecao, Integer qtElementos) {
		for (int i = 0; i < qtElementos; i++) {
			colecao.add(i);
		}
		return (colecao.size() > 0) ? true : false;
	}

	private boolean adicionarElementosSet(Set<Integer> colecao, Integer qtElementos) {
		for (int i = 0; i < qtElementos; i++) {
			colecao.add(i);
		}
		return true;
	}

	private boolean adicionarElementosMap(Map<Integer, Integer> colecao, Integer qtElementos) {
		for (int i = 0; i < qtElementos; i++) {
			colecao.put(i, i);
		}
		return true;
	}

}
