package domain;

import entities.Aluno;

public class AlunoMain {

	public static void main(String[] args) {

		Aluno Luiz = new Aluno();
		Luiz.codigoAluno = 1;
		Luiz.nome = "Luiz Felipe Canário Costa";
		Luiz.telefone = "24988496033";
		Luiz.endereço = "Ses Marias";
		Luiz.nota1 = 7;
		Luiz.nota2 = 8;

		
		System.out.println("Nota do "+Luiz.nome + " = " + Luiz.calcularNota());
		Luiz.imprimir();
		
		System.out.println(Luiz);
	}

}
