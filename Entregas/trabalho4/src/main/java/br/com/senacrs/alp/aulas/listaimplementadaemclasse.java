package br.com.senacrs.alp.aulas;

import br.com.senacrs.alp.aulas.Lista;

public class listaimplementadaemclasse<T> implements Lista<T>{

	private Nodo<T> inicio = new Nodo<T>();
	
	@Override
	public void adicionarFinal(T valor) {
		// TODO Auto-generated method stub
		adicionarPosicao(obterTamanho()-1, valor);
	}

	@Override
	public void adicionarInicio(T valor) {
		// TODO Auto-generated method stub
		adicionarPosicao(0, valor);
	}

	@Override
	public void adicionarPosicao(int posicao, T valor) {
		// TODO Auto-generated method stub
		Nodo<T> novo = new Nodo<T>();
		Nodo<T> corredor;
		int cont = -1;
		corredor = obterPosicao(posicao-1);
		novo.proximo=corredor.proximo;
		novo.conteudo=valor;
		corredor.proximo=novo;
	}

	@Override
	public Nodo<T> obterPrimeiro() {
		// TODO Auto-generated method stub
		Nodo<T> primeiro = obterPosicao(0);
		return primeiro;
	}

	@Override
	public Nodo<T> obterUltimo() {
		// TODO Auto-generated method stub
		Nodo<T> Ultimo = obterPosicao(obterTamanho()-1);
		return Ultimo;
	}

	@Override
	public Nodo<T> obterPosicao(int posicao) {
		// TODO Auto-generated method stub
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
		Nodo<T> corredor=obterPosicao(posicao-1);
		Nodo<T> lixo=corredor.proximo;
		corredor.proximo=lixo.proximo;
		lixo.proximo=null;
		return null;
	}

	@Override
	public void esvaziar() {
		// TODO Auto-generated method stub
		int x,y;
		y=obterTamanho();
		for (x=-1;x<y;x++){
			removerPosicao(x);
		}
	}
	
}
