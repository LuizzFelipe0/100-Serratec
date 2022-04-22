package autoestilo;

import java.util.Scanner;


public class AE2 {

public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		 AE ae = new AE();
		
		String nomecarro, cor, placa, ano;
		String nomegasto[] = new String[31];
		double  valor, totalgasto=0.0;
		double valorgasto[] = new double[31];
		int CONTADOR=0;
		

		System.out.println("Informe o nome do carro:");
		nomecarro = leitor.nextLine();
		
		System.out.println("Informe a cor do carro:");
		cor = leitor.nextLine();		
		
		System.out.println("Informe a placa do carro:");
		placa = leitor.nextLine();		
		
		System.out.println("Informe o ano do carro:");
		ano = leitor.nextLine();		
		
		System.out.println("Informe o valor pago no carro:");
		valor = leitor.nextInt();		
		
		System.out.println("A seguir o programa verificará seus gastos >>> "+"\nPara sair,digite o Nº '0' nas duas perguntas!");
		ae.calcular(nomegasto, valorgasto, totalgasto, CONTADOR, nomecarro, cor, placa, ano, valor);
		
		leitor.close();
    }
}