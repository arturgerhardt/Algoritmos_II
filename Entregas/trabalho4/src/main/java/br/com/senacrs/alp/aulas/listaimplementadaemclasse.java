package br.com.senacrs.alp.aulas;

import br.com.senacrs.alp.aulas.Lista;
import br.com.senacrs.alp.aulas.Nodo;

public class listaimplementadaemclasse<T> implements Lista<T>{

	private Nodo<T> inicio = new Nodo<T>();
	
	@Override
	public void adicionarFinal(T valor) {
		adicionarPosicao(obterTamanho(), valor);
	}

	@Override
	public void adicionarInicio(T valor) {
		adicionarPosicao(0, valor);
	}

	@Override
	public void adicionarPosicao(int posicao, T valor) {
		Nodo<T> novo = new Nodo<T>();
		Nodo<T> corredor;
		if (valor == null){
			throw new IllegalArgumentException();
		}
		if (posicao < 0){
			throw new IllegalArgumentException();
		}
		if (posicao > obterTamanho()){
			throw new IllegalArgumentException();
		}
		novo.conteudo=valor;
		corredor = obterNodoPosicao(posicao-1);
		novo.proximo=corredor.proximo;
		corredor.proximo=novo;
	}

	@Override
	public T obterPrimeiro() {
		T resultado = obterPosicao(0);
		return resultado;
	}

	@Override
	public T obterUltimo() {
		T resultado = obterPosicao(obterTamanho()-1);;
		return resultado;
	}

	@Override
	public Nodo<T> obterNodoPosicao(int posicao) {
		int cont=-1;
		Nodo<T> corredor = new Nodo<T>();
		corredor = inicio;
		while (corredor.proximo!=null & cont!=posicao){
			corredor=corredor.proximo;
			cont++;
		}
		return corredor;
	}

	@Override
	public int obterTamanho() {
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
		Nodo<T> corredor=obterNodoPosicao(posicao-1);
		if (posicao < 0){
			throw new IllegalArgumentException();
		}
		if (posicao >= obterTamanho()){
			throw new IllegalArgumentException();
		}
		Nodo<T> lixo=corredor.proximo;
		corredor.proximo=lixo.proximo;
		lixo.proximo=null;
		T resultado=lixo.conteudo;
		return resultado;
	}

	@Override
	public void esvaziar() {
		int x = obterTamanho()-1;
		while (x!=-1){
			removerPosicao(x);
			x--;
		}
	}

	@Override
	public T obterPosicao(int posicao) {
		if (obterTamanho()==0){
			throw new IllegalArgumentException();
		}
		Nodo<T> corredor = obterNodoPosicao(posicao);
		T resultado = corredor.conteudo;
		return resultado;
	}
	
}
