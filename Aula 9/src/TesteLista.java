import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TesteLista {

	public static void main(String[] args) {
		// Tem tamanho variável
		// Permite elementos duplicados
		// Mantém a ordem dos elementos
		// Permite tipos(String,int,Aluno,Vetores,etc) diferentes dentro da mesma lista

		List minhaListaAleatoria = new ArrayList();

		// Add - Adiciona um item no fim da lista
		// NÃO FAÇA ISSO! APENAS É PERMITIDO
		minhaListaAleatoria.add("Amanhã tem ala de arquivos");
		minhaListaAleatoria.add(42);
		minhaListaAleatoria.add(25.074644802339);
		minhaListaAleatoria.add(new Scanner(System.in));

		List<String> cpfsCadastrados = new ArrayList<String>();

		cpfsCadastrados.add("468.518.780-62");
		cpfsCadastrados.add("946.505.860-20");
		cpfsCadastrados.add("865.363.720-69");
		cpfsCadastrados.add("442.174.590-17");
		cpfsCadastrados.add("865.363.720-69");
		cpfsCadastrados.add("152.123.970-30");
		cpfsCadastrados.add(2, "339.514.550-63");

		// Set - Substitui um elemento
		cpfsCadastrados.set(0, "538.523.720-54");

		// cpfsCadastrados.remove(4); // Remove o 5º elemento
		// cpfsCadastrados.remove("946.505.860-20"); // Remove o cpf mostrado

		int tamanhoLista = cpfsCadastrados.size();
		System.out.println("CPF na posição 2: " + cpfsCadastrados.get(2));
		System.out.println("CPF na ultima posição: " + cpfsCadastrados.get(tamanhoLista - 1));

		System.out.println("\n-------\n");

		for (String cpf : cpfsCadastrados) {
			System.out.println("CPF:" + cpf);

		}
		System.out.println("\n-------\n");

		// isEmpty - Retorna se a lista está vazia

		if (cpfsCadastrados.isEmpty()) {
			System.out.println("Cadastrar CPF ai");
		} else {
			System.out.println("Já possui CPFs cadastrados");
		}
		
		
		if(cpfsCadastrados.contains("442.174.590-17")) {
			int numeroContaLuiz = cpfsCadastrados.indexOf("442.174.590-17");
			//idenxOf - Retorna o indice do elemento da lista
			System.out.println("E não é que o Luiz já tem cadastro? O indice de sua conta é: "+numeroContaLuiz);
		}else {
			int numeroContaLuiz = cpfsCadastrados.indexOf("442.174.590-17");
			
			//Irá retornar -1 para mostrar que não encontrou
			System.out.println("Luiz, se cadastra aee!Indice da conta:"+numeroContaLuiz);
		}
		
		System.out.println("\n------\n");
		// Ordena a Lista
		System.out.println("Lista de CPFs ordenados:");
		for (String cpf : cpfsCadastrados) {
			System.out.println("CPF: " + cpf);

		}
		
		//Outra forma de declarar asd listas
		
		List<String> telefones = Arrays.asList("22432215","22462600","22214508");
		
		System.out.println("\n------\n");
		
		System.out.println("Lista de Telefones cadastrados:");
		for (String telefone : telefones) {
			System.out.println("Telefone: " + telefones);
	}
	}
}
