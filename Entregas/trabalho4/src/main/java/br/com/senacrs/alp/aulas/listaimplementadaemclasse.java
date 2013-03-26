package br.com.senacrs.alp.aulas;

import br.com.senacrs.alp.aulas.Lista;

public class listaimplementadaemclasse<T> implements Lista<T>{

	private Nodo<T> inicio = new Nodo<T>();
	
	@Override
	public void adicionarFinal(T valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adicionarInicio(T valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adicionarPosicao(int posicao, T valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T obterPrimeiro() {
		// TODO Auto-generated method stub
		T primeiro = obterPosicao(0);
		return primeiro;
	}

	@Override
	public T obterUltimo() {
		// TODO Auto-generated method stub
		T Ultimo = obterPosicao(obterTamanho()-1);
		return Ultimo;
	}

	@Override
	public T obterPosicao(int posicao) {
		// TODO Auto-generated method stub
		int cont=-1;
		T corredor = new Nodo<T>();
		corredor = inicio;
		while (corredor.proximo!= null&cont!=posicao){
			corredor=corredor.proximo;
			cont++;
		}
		return corredor;
	}

	@Override
	public int obterTamanho() {
		// TODO Auto-generated method stub		
		int tamanho=0;
		Nodo<T> corredor = new Nodo<T>();
		corredor = inicio;
		while (corredor.proximo != null) {
			corredor = corredor.proximo;
			tamanho++;
		}
		return tamanho;
	}

	@Override
	public T removerPosicao(int posicao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void esvaziar() {
		// TODO Auto-generated method stub
		
	}
	
}
