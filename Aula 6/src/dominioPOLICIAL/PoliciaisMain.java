package dominioPOLICIAL;


import br.com.serratec.entidade.Policial;
import br.com.serratec.entidade.PolicialFederal;

public class PoliciaisMain {

	public static void main(String[] args) {

		
	 Policial p1 = new Policial("Felipe","251217676176");
	 PolicialFederal p2 = new PolicialFederal("Luiz","09746647","COPE");
	 
	 
	 // Atributos final são comstantes, depois de setado um valor,
	 // o mesmo não pode ser alterado!
	 
	 final String NOME_SUSPEITO = "Lulu";
	
	 final int IDADE_SUSPEITO;
	 
	 IDADE_SUSPEITO = 22;
	 System.out.println("Nº de armas máximas do(a) Policial:"+	 
	 Policial.NU_MAXIMO_ARMAS);
	 

	}

}