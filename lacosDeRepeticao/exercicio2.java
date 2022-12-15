package lacosDeRepeticao;

import java.util.Scanner;

public class exercicio2 {

	//2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero, contador;

		for(numero = 0; numero <=10; numero++) {
			System.out.println("Coloque um número: ");
			numero = entrada.nextInt();
			if(numero % 2 == 0)
			System.out.println(numero + " é par");
			else {
			System.out.println(numero + " é ímpar");
			}
			
		}
	}
}
