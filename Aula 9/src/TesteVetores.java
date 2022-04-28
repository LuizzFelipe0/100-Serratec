
public class TesteVetores {

	public static void main(String[] args) {
		 // 3 formas de declarar vetores
		
		final int QTD_NOTAS = 4;
		int[] notas1 = new int[QTD_NOTAS];
		int[] notas2 = new int[] {10,5,9,6};
		int[] notas3 = {8,6,9,3};
		
		// Percorrendo um vetor
		// Forma 1
		int tamanhoVetor = notas2.length;
		for(int i =0; i<tamanhoVetor;i++) {
			System.out.println("Nota do "+(i+1)+"º bimestre: "+notas2[i]);
		}
		System.out.println("\n--------------------------------------\n");
		
		// Forma 2
		for(int notaAtual: notas3) {
			System.out.println("Nota do bimestre: "+notaAtual);
		}
	}

}
