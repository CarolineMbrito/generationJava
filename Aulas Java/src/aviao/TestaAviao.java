package aviao;

public class TestaAviao {

	public static void main(String[] args) {
		Aviao novoAviao = new Aviao("Boing", "Cinza-Escuro", "Monica", "Curitiba para São Paulo", 100f, 255);
		System.out.println("O modelo so avião é: " + novoAviao.getModeloAviao());
		System.out.println("A cor do avião é: " + novoAviao.getCor());
		System.out.println("Nome do piloto: " + novoAviao.getNomePiloto());
		System.out.println("A rota de viagem é: " + novoAviao.getRota());
		System.out.println("A quantidade de gasolina é de: " + novoAviao.getGasolina());
		System.out.println("A quantidade de passageiros é de: " + novoAviao.getPassageiros());
	}
}
