package ExemploExcecoes;

import java.util.Scanner;

public class TesteMain {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Insira o primeiro nº: ");
		int n1 = leitor.nextInt();
		
		System.out.println("Insira o segundo nº: ");
		int n2 = leitor.nextInt();
		
		double resultado = dividir(n1,n2);
		System.out.println("Resultado: "+resultado);
	}

	public static int dividir(int n1, int n2) {
		// Tudo que vai dentro do try será colocado para tratamento
		try {
			return n1 / n2;
		}
		// Catch - Pegar
		// Catch pode ser super genérica e pegar qualquer tipo de exceção. EX:ABAIXO
		catch (Exception excecao){
			System.out.println("Esse tipo de divisão não pode ser feita!");
			return 0;
		}
	}
}
