package exercicios;

import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeroBase = 5;
		
		Scanner leitor = new Scanner(System.in);
		
		String parar = "N";
		int i = 0;
		while(!parar.equals("S") && !parar.equals("s")) {
			System.out.println(numeroBase + "x" + i + "=" + (numeroBase * i));
			System.out.println("Deseja parar?(S/s,N/n)");
			parar = leitor.nextLine();
			i++;

		}
		leitor.close();

	}

}
