package br.com.serratec.entidade;

public class Policial {
	public static final int NU_MAXIMO_ARMAS = 2;
	protected String nome;
	protected String registro;

	public Policial(String nome, String registro) {
		this.nome = nome;
		this.registro = registro;
	}

	public void registrarPrisao(String suspeito) {
		System.out.println("O policial " + this.nome + " efetuou a prisão de" + suspeito);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

}
