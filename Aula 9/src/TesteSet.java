import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TesteSet {

	public static void main(String[] args) {
		// Não permite itens duplicados
		// Existem 2 tipos de set:
		// TreeSet - Mantém a ordem dos elementos. As operações de busca, adição e remoção
		//HashSet - Não mantem a ordem dos elementos.As operações de busca , adição e remoção de itens
	
		Set setDeCoisasAleatorias = new HashSet();
		
		// Aceita diversos tipos dentro de um mesmo set
		// NAO E RECOMENDADO FAZER ISSO
		setDeCoisasAleatorias.add("Texto daora");
		setDeCoisasAleatorias.add(123);
	
		Set<String> setDeCpfs = new HashSet<String>();
		
		setDeCpfs.add("12387234797");
		setDeCpfs.add("76437634797");
		setDeCpfs.add("46326473461");
		setDeCpfs.add("39582356000");
		setDeCpfs.add("36488374847");
		setDeCpfs.add("10389219434");
		
		setDeCpfs.remove("10389219434");
		
		for(String cpf:setDeCpfs) {
			System.out.println("CPF: "+cpf);
		}


	
	}
}
