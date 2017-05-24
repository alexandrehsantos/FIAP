package br.com.fiap.exercicioIII;

public enum Colecoes {

	arrayList("arrayList", true, false), linkedList("linkedList", true, false), stack("stack", true, false), hashSet(
			"hashSet", true, false), hashMap("hashMap", true, false), weakHashMap("weakHashMap", true, false);

	private String colecao;
	private Boolean on;
	private Boolean off;

	Colecoes(String colecao, Boolean on, Boolean off) {
		this.setColecao(colecao);
		this.setOn(on);
	}

	public String getColecao() {
		return colecao;
	}

	public void setColecao(String colecao) {
		this.colecao = colecao;
	}



	public Boolean getOff() {
		return off;
	}

	public void setOff(Boolean off) {
		this.off = off;
	}

	public Boolean getOn() {
		return on;
	}

	public void setOn(Boolean on) {
		this.on = on;
	}
}
