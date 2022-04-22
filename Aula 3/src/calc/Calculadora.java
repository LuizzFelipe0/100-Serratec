package calc;

public class Calculadora {

	public double somar (double n1, double n2) {
		return n1 + n2;
		
	}public double subtrair (double n1, double n2) {
		return n1 - n2;
	
	}public double multiplicar (double n1, double n2) {
		return n1 * n2;
		
	}public double dividir (double n1, double n2) {
		return n1 / n2;
		
	}public double calcularResto (double n1, double n2) {
		return n1 % n2;
	
	}
	
public void calcular (double n1, double n2, int operacao) {
	switch (operacao) {
	case 1:
		System.out.println("Soma:"+somar(n1,n2));
		break;
	case 2:
		System.out.println("Multiplicação:"+multiplicar(n1,n2));
		break;

	case 3:
		System.out.println("Divisão:"+dividir(n1,n2));
		break;

	case 4:
		System.out.println("Subtração:"+subtrair(n1,n2));
		break;

	case 5:
		System.out.println("Resto:"+calcularResto(n1,n2));
		break;
	default:
        System.out.println("Opção inválida");
        break;

	}
	
	
	}

}
