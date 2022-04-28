
public class TesteMatrizes {

	public static void main(String[] args) {
		 // 3 formas de declarar matrizes
		
		int[][] coordenadas1 = new int[4][3];
		int[][] coordenadas2 = new int[][] {{2,3},
											{4,5},
											{3,9}};
	
		
	
		int [][] coordenadas3 = {{8,9},
								{2,5},
								{1,2}};
		
		int tamanhoPrimeiroColchete = coordenadas2.length;
		for(int i = 0; i< tamanhoPrimeiroColchete;i++) {
			int tamanhoSegundoColchete = coordenadas2[i].length;
			for(int j = 0; j<tamanhoSegundoColchete; j++) {

			System.out.println("Coordenada: "+coordenadas2[i][j]);
		}
		
			System.out.println("\n-----------------\n");
			
			for(int[] linhaAtual : coordenadas3) {
				for(int numeroAtual : linhaAtual) {
					System.out.println(numeroAtual+", ");
					
				}
				System.out.println();
			}
		}
	}

}
