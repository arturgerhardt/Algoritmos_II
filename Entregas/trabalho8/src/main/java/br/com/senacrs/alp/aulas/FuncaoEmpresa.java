package br.com.senacrs.alp.aulas;

import java.util.ArrayList;
import java.util.List;

public class FuncaoEmpresa implements Empresa {

	private String nome;

	public FuncaoEmpresa(String nome) {
		if (nome != null ) {
			this.nome = nome;
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	ArrayList<Departamento> lista = new ArrayList<Departamento>();
	
	@Override
	public String getNome() {
		String resultado;
		resultado = this.nome;
		return resultado;
	}

	@Override
	public List<Departamento> listaDepartamentoOrdemCrescentePorQtdFuncionarios() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adicionarDepartamento(Departamento departamento) {
		if(departamento == null){
			throw new IllegalArgumentException();
		}
		lista.add(departamento);
	}

	@Override
	public int quantidadeFuncionarios() {
		int resultado=0;
		resultado = lista.size();
		return resultado;
	}
}
