package dominio;

import entidade.Caminhao;
import entidade.CarroPasseio;
import entidade.Veiculo;

public class VeiculoMain {

	public static void main(String[] args) {
		Caminhao mac = new Caminhao("AAA5566");
//		mac.setPlaca("AAA5566");

		CarroPasseio relampagoMacQueen = new CarroPasseio("BBB7788");
//		relampagoMacQueen.setPlaca("BBB7788");

		mac.acelerar();
		relampagoMacQueen.acelerar();

		Veiculo doc = new CarroPasseio("CCC8900");
		CarroPasseio doc2 = (CarroPasseio) doc;
	
		darManutencao(mac);
		darManutencao(relampagoMacQueen);

		doc.acelerar();
	}

	public static void darManutencao(Veiculo vh) {
		System.out.println("O veicculo " + vh.getPlaca() + " recebeu Manutenção!");
	}
}