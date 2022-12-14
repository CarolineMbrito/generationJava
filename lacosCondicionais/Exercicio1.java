package LacosCondicionais;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int n1,n2,n3;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o primeiro valor: ");
		n1 = entrada.nextInt();
		
		System.out.println("Informe o segundo valor: ");
		n2 = entrada.nextInt();
		
		System.out.println("Informe o terceiro valor: ");
		n3 = entrada.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("O primeiro número é maior " + n1);
			
		}
		else if(n3 < n2) {
			System.out.println("O segundo número é maior " + n2);
			
		}
		else {
			System.out.println("O terceiro número é o maior " + n3);
		}
	}
}
