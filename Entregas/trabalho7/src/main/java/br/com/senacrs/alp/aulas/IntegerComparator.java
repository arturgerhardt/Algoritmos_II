package br.com.senacrs.alp.aulas;

import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer> {

	int Resultado;
	@Override
	public int compare(Integer o1, Integer o2) {		
		if (par(o1)==par(o2)) {
			Resultado = compareParidadeIguais (o1, o2);
		} else {
			Resultado = compareParidadeDistintas (o1, o2);
		}
		return Resultado;
	}
	private int compareParidadeDistintas(Integer o1, Integer o2) {
			if (par(o1)) {
				Resultado = -1;
			} else {
				Resultado = 1;
			}
			
		return 0;
	}
	private int compareParidadeIguais(Integer o1, Integer o2) {
			Resultado = o1-o2;
		return Resultado;
	}
	private boolean par(Integer o1) {
		boolean res = false;
			res= o1.intValue() % 2 == 0;
		return res;
	}

}
