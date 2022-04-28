import java.util.ArrayList;
import java.util.List;

public class TesteListaComObjetos {
	
	public static void main(String[] args) {
		List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		
		listaPessoas.add(new Pessoa("Luiz","16372638"));
		listaPessoas.add(new Pessoa("Ana","63748899"));
		
		Pessoa p1 = new Pessoa("Felipe","1111122334");
		listaPessoas.add(p1);

		
		// Se não tiver o método compareTo, o contains vai comparar os endereços na memória
		
		if(listaPessoas.contains(p1)) {
			System.out.println("Essa pessoa está cadastrada");
		}else {
			System.out.println("Pessoa não cadastrada");
		}
		
		System.out.println("Lista de Pessoas: ");
		for(Pessoa pessoaAtual : listaPessoas) {
			System.out.println(pessoaAtual);
		}
				
		
		System.out.println("\n\nLista de Pessoas ordenada: ");
		for(Pessoa pessoaAtual : listaPessoas) {
			System.out.println(pessoaAtual);
		}
	}

}
