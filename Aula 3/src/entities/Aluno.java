package entities;

public class Aluno {
	
	public int codigoAluno;
	public String nome;
	public String telefone;
	public String endereço;
	public double nota1;
	public double nota2;

	
	public double calcularNota() {
		return (this.nota1 + this.nota2)/2;
		
	}
	
	public void imprimir() {
		System.out.println("Código aluno: "+ this.codigoAluno+"\nNome: "+this.nome);
	}
}
