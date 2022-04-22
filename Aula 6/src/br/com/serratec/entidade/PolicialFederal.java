package br.com.serratec.entidade;

import java.time.LocalDate;

// PolicialFederal não pode ser usado como super classe ou classe mãe!
public final class PolicialFederal extends Policial {

	private String unidade;

	public PolicialFederal(String nome, String registro, String unidade) {
		super(nome, registro);
		this.setUnidade(unidade);
	}

	public void registrarPrisao(String suspeito, LocalDate dataPrisao) {
		System.out.println("O policial " + this.nome + " efetuou a prisão de" + suspeito + " na data " + dataPrisao);

	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

}
