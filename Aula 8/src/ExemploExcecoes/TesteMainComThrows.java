package ExemploExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteMainComThrows {

	public static void main(String[] args) {
		try {

			Scanner leitor = new Scanner(System.in);

			System.out.println("Insira o primeiro nº: ");
			int n1 = leitor.nextInt();

			leitor.close();
			int n2 = 0;

			do {
				System.out.println("Insira o segundo nº: ");

				try {
					n2 = leitor.nextInt();
					break;
				} catch (InputMismatchException ie) {
					System.out.println("Insira um número. Outros caracteres não são aceitos!");

				} finally {
					leitor.nextLine();
				}
			} while (true);

			// Tratamento para divisão por 0.
			try {
				double resultado = dividir(n1, n2);
				System.out.println("Resultado: " + resultado);

			} catch (ArithmeticException excecaoMat) {
				System.out.println("Valor inválido. Texto da Exceção: " + excecaoMat.getMessage());
			}
		} catch (IllegalStateException iStateExc) {
			fecharPrograma("\nO scanner está fechado. Não consigo continuar :(");
		}
	}

	public static int dividir(int n1, int n2) throws ArithmeticException {
		return n1 / n2;

	}

	public static void fecharPrograma(String textFechamento) {
		System.out.println(textFechamento);
	}
}
