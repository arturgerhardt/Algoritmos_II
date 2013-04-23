package br.com.senacrs.alp.aulas;


public class FuncaoFuncionario implements Funcionario {
	private String nome;
	private Empresa empresa;
	private Departamento departamento;
	private double salario;
	
	public FuncaoFuncionario(String nome, Departamento departamento, double salario) {
		if (nome != null && departamento != null && salario > 0) {
			this.nome = nome;
			this.departamento = departamento;
			this.salario = salario;
			this.empresa = departamento.getEmpresa();
		} else {
			throw new IllegalArgumentException();
		}
	}
	@Override
	public Empresa getEmpresa() {
		Empresa resultado;
		resultado = this.empresa;
		return resultado;
	}

	@Override
	public Departamento getDepartamento() {
		Departamento resultado;
		resultado = this.departamento; 
		return resultado;
	}

	@Override
	public String getNome() {
		String resultado;
		resultado = this.nome;
		return resultado;
	}

	@Override
	public double getSalario() {
		double salario;
		salario = this.salario;
		return salario;
	}

}
