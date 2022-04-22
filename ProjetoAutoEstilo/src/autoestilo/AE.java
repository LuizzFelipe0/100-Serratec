package autoestilo;

import java.util.Scanner;

public class AE {

	Scanner leitor = new Scanner(System.in);
	
	
	public  void calcular (String nomegasto[], double valorgasto[], double total, int CONTADOR, String nomecarro, String cor, String placa, String ano, double valor) {
		for(int i=0; i < 31; i++){
			
			System.out.println("\nO que gastou?");
			nomegasto[i]  = leitor.nextLine();
			
			System.out.println("Qual o valor desse gasto?");
			valorgasto[i] = Integer.parseInt(leitor.nextLine());
			CONTADOR++;
			total=total+valorgasto[i];
			
			System.out.println("\n\n\n\n\n\n\n\n");

		
			if(nomegasto[i]=="0" || valorgasto[i]==0){
				{
				System.out.println(nomecarro+ "\n"+ cor+ "\nPlaca:"+ placa+ "\nAno:"+ ano);
				System.out.println("\nValor Inicial:"+valor+"\nValor com gastos:"+(valor + total));
				System.out.println("\nGastos totais:"+ total);
				
				for(int l=0; l < CONTADOR; l++){
					System.out.printf("\n"+nomegasto[l]+ " = R$ "+ valorgasto[l]);
					
				
					leitor.close();
				
				
				}break;
			
				}
				
			
		}
		
		
	}
	}
	}
