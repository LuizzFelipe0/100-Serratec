package br.com.serratec.dominio;

import br.com.serratec.entidade.Imovel;
import br.com.serratec.entidade.Pessoa;

public class TesteMain {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("16685676533","Luiz Felipe","2422462600");

		Imovel m1 = new Imovel("Rua das Dracemas", "Casa", 560000, p1);
		Imovel m2 = new Imovel("Estrada Samambaia", "Apartamaento", 290000, p1);

		
		System.out.println("Dono do Imovel: " + m2.getDono());
		System.out.println(m1);
		


		
	}

}
