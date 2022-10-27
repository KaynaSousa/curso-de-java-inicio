package br.com.fiap.si;
import java.util.Scanner;

public class LeituraDeDados {
	public static void main(String[] args) {
	Scanner sc =  new Scanner(System.in);
	
	System.out.println("Digite o primeiro numero:");
	int numero1 = sc.nextInt();
	System.out.println("Digite o segundo numero:");
	int numero2 = sc.nextInt();
	
	int soma = numero1 + numero2;
			
	System.out.println("o resultado da some é " + soma);
	sc.close();
	}
}
