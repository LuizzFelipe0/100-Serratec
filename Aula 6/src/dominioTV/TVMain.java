package dominioTV;

import java.util.Scanner;

import entidadeTV.TV;

public class TVMain {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira a polegada da TV:");
		int polegadas = entrada.nextInt();
		entrada.nextLine();

		System.out.print("Insira o modelo da TV: ");
		String modelo = entrada.nextLine();
		
		System.out.print("Insira o código da marca da TV: ");
		int codMarca = entrada.nextInt();
		
		TV samsung42 = new TV(polegadas, modelo, codMarca);
		
		System.out.println(samsung42);
		
		entrada.close();
		
		
		
	}

}
