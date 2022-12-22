package contabancaria;

public class TesteContaBancaria {

	public static void main(String[] args) {
		
		ContaBancaria novaConta = new ContaBancaria(12, 65, 2, "Carol", 1200f);
		
		System.out.println("Numero da conta " + novaConta.getNumero());
		System.out.println("Numero da conta " + novaConta.getAgencia());
		System.out.println("Numero da conta " + novaConta.getTipo());
		System.out.println("Numero da conta " + novaConta.getTitular());
		System.out.println("Numero da conta " + novaConta.getSaldo());
		
		novaConta.sacar(200);
	}

}
