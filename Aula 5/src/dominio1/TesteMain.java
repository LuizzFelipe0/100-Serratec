package dominio1;

import entidade1.Assistente;
import entidade1.Diretor;
import interfaces1.Emprestimo;
import entidade1.Funcionario;
import entidade1.Gerente;
import interfaces1.AutenticacaoFuncionarios;

public class TesteMain {

	public static void main(String[] args) {

		// Classes abstratas não podem ser instanciadas.

		// Funcionario f1 = new Assistente("Luiz",3000.88);

		Funcionario f2 = new Assistente("Luiz", 3000.88, 340);
		Funcionario f3 = new Gerente("Renato Cariani", 8000.08);
		Funcionario f4 = new Diretor("Ronnie Coleman", 17000.03, "TI");

		Emprestimo.verSaldoDisponivelNoBanco();

		AutenticacaoFuncionarios f5 = new Diretor("Amanda", 16000, "TI");
	}

}
