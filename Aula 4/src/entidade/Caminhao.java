package entidade;

// Extende Veículo. Essa linha traz os atributos e métodos de Veiculo

public class Caminhao extends Veiculo {

	private static String tipoVeiculo = "caminhão";
	private static int taxaAceleracao = 75;
	private int cargaMaxima;

	public Caminhao(String placa) {
		super(placa);
	}

	@Override
	public void acelerar() {
		System.out.println("O "+ tipoVeiculo  +" aumentou a velocidade em "+ taxaAceleracao+ " km/h");
	}

	public int getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(int cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}
}
