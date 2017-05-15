package br.com.fiap.RM48034.ExI;

public class InversorDeArrays {

	public Integer[] inverte(Integer[] array, int tamanhoDoArray) {
		Integer newArray[] = new Integer[tamanhoDoArray];
		int y = 0;
		for (int i = array.length -1; i >= 0; i--) {
			newArray[y] = array[i];
			y++;
		}
		return newArray;
	}

}
