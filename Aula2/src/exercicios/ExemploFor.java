package exercicios;

public class ExemploFor {

	public static void main(String[] args) {
		
		int numeroBase =8;
		
		// for )(inicialização; condição; incremento)
		
		for (int i =0;i <=10; i++) {
			
			System.out.println(numeroBase + "x" + i + "=" + numeroBase * i);
		}
			System.out.println("----------------------------------------");
		
			
			for (int i =10;i >=0; i--) {
			
			System.out.println(numeroBase + "x" + i + "=" + numeroBase * i);
		}
	}

}
