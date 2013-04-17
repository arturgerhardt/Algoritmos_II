package br.com.senacrs.alp.aulas;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		int Resultado;
		Resultado = 0-o1.compareTo(o2);
		return Resultado;
	}

}
