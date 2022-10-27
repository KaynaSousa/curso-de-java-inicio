package br.com.fiap.si;

public class OperadoresAritimeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 9;
		int y = 2;
		
		int soma = x + y;
		int subtracao = x - y;
		int multiplicacao = x *y;
		int divisao = x/y;
		int resto = x%y;
				System.out.println("O resultado da soma é" + soma);
				System.out.println("O resultado da Subtração é" + subtracao);
				System.out.println("O resultado da multiplicacao é " + multiplicacao);
				System.out.println("O resultado da divisao é" + divisao);
				System.out.println("o resto da divisão é " + resto);
				
				
				x++;
				System.out.println("O incremento de x é" + x);
				
				y--;
				
				System.out.println("O decremento de x é" + x);
				
				x+=10;
				System.out.println("O resultado da Aditiva é " + x);
				
				y-=10;
				System.out.println(" O resultado da Subrativa é" + y);

	}

}
