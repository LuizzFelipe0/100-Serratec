package exercicios;

public class ExercicioVariaveis {

	public static void main(String[] args) {
String nome = "Luiz";
int idade = 17;
double peso = 84.5678689;
double alt = 1.825679989;



System.out.println("O funcionário "+ nome+" tem =>" );
System.out.println("Peso:"+peso+"\nAltura:"+alt+"\nIdade: "+idade);


System.out.printf("Peso com aproximação: %.1f",peso);
System.out.println("\nAltura com aproximação:"+ String.format("%.2f", alt ));


	
	
	
	
	}
}