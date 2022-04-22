package entidade1;

import interfaces1.Autenticacao;

public class Gerente extends Funcionario implements Autenticacao {
	private String nivel;

	public Gerente(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public String toString() {
		return "Gerente [nivel=" + nivel + ", nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + "]";
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	@Override
	public boolean autenticar(String senha) {
		return senha.equals("admin");
	}

	public void aumentarSalario() {
		this.salario += 2000;
	}

}
