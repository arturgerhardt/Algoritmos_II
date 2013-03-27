package br.com.senacrs.alp.aulas;

public interface Lista<T extends Object> {

	void adicionarFinal(T valor);

	void adicionarInicio(T valor);

	void adicionarPosicao(int posicao, T valor);

	Nodo<T> obterPrimeiro();
	
	Nodo<T> obterUltimo();
	
	Nodo<T> obterPosicao(int posicao);
	
	int obterTamanho();

	Nodo<T> removerPosicao(int posicao);
	
	void esvaziar();
}
