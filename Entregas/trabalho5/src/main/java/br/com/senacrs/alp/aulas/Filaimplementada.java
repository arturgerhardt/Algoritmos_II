package br.com.senacrs.alp.aulas;

public class Filaimplementada<T> implements Fila<T> {

	@Override
	public void insercao(T valor) {
		
		if (valor == null){
			throw new IllegalArgumentException();
		}else{
			
		}
	}

	@Override
	public T obter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T remocao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean vazia() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int tamanho() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void esvaziar() {
		// TODO Auto-generated method stub

	}

}
