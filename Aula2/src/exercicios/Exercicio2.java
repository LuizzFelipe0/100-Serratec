package exercicios;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int n1=9, n2=8,n3=10,n4=9;
		String nome = "Luiz";
		
		System.out.println("A média de "+ nome+ " é = "+(n1+n2+n3+n4)/4);
		System.out.println("-----------------------------------------");

		// METODO DO PROFESSOR ==>
		
		int m1 = 2;
		int m2 = 4;
		int m3 = 5;
		int m4 = 8;
		
		double media = (m1 + m2 + m3 + m4)/4f;
		
		System.out.printf("Média: %.2f", media);
		System.out.println("\nMédia: " + String.format("%.2f", media));
		
	}

}
