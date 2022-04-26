package ExemploExcecoes;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TratamentoExceçõesChecked {
	
	public static void main(String[] args) {
		
		try {
		lerArquivo();
		} catch (FileNotFoundException e) {
			System.out.println("Ocorreu um erro ao ler o arquivo!");
		}
	}
	// Nas exceções do tipo checked é obrigatório o throws
	public static void lerArquivo() throws FileNotFoundException{
		FileReader leitorArquivo = new FileReader("Teste.txt");

}
}