package LacosCondicionais;

import java.util.Scanner;
//2- Faça um programa que entre com três números e coloque em ordem crescente.
public class Exercicio2 {
	
	public static void main(String[] args) {
int n1,n2,n3;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o primeiro número: ");
		n1 = entrada.nextInt();
		
		System.out.println("Informe o segundo número: ");
		n2 = entrada.nextInt();
		
		System.out.println("Informe o terceiro número: ");
		n3 = entrada.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("A ordem crescente é: " + "\n" + n1 + "\n" + n2 + "\n" + n3);
			
		}
		else if(n2 > n1 && n2 > n3) {
			System.out.println("A ordem crescente é: " + "\n" + n2 + "\n" + n1 + "\n" + n3);
			
		}
		else {
			System.out.println("A ordem crescente é: " + "\n" + n3 + "\n" + n2 + "\n" + n1);
		}
	}

	}

