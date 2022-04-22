package entidade1;

import interfaces1.AutenticacaoFuncionarios;

public class Diretor extends Funcionario implements AutenticacaoFuncionarios {

	private String categoria;

	public Diretor(String nome, double salario, String categoria) {
		super(nome, salario);
		this.categoria = categoria;

	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Diretor [categoria=" + categoria + ", nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + "]";
	}

	@Override
	public void aumentarSalario() {
		this.salario += 5000;
	}

	public boolean autenticar(String senha) {
		return senha.equals("geladeira");
	}

	public boolean autenticarEmContaCliente(String senha, String numConta) {
		return senha.equals("geladeira") && numConta.equals("123");
	}

}
