package br.com.senacrs.alp.aulas;

import java.util.ArrayList;
import java.util.List;

public class FuncaoDepartamento implements Departamento {

	private String nome;
	private Empresa empresa;
	
	public FuncaoDepartamento(String nome, Empresa empresa) {
		if(nome != null && empresa != null) {
			this.nome = nome;
			this.empresa = empresa;
		} else {
			throw new IllegalArgumentException();
		}	
	}

	ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
	
	@Override
	public Empresa getEmpresa() {
		Empresa resultado;
		resultado = this.empresa;
		return resultado;
	}

	@Override
	public String getNome() {
		String resultado;
		resultado = this.nome;
		return resultado;
	}

	@Override
	public List<Funcionario> listarFuncionariosPorOrdemAlfabetica() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Funcionario> listarFuncionariosPorDecrescenteSalario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int quantidadeFuncionarios() {
		int resultado=0;
		resultado = lista.size();
		return resultado;
	}

	@Override
	public void adicionarFuncionario(Funcionario funcionario) {
		if(funcionario == null){
			throw new IllegalArgumentException();
			}
			lista.add(funcionario);
	}

}
