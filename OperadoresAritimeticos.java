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
				System.out.println("O resultado da soma �" + soma);
				System.out.println("O resultado da Subtra��o �" + subtracao);
				System.out.println("O resultado da multiplicacao � " + multiplicacao);
				System.out.println("O resultado da divisao �" + divisao);
				System.out.println("o resto da divis�o � " + resto);
				
				
				x++;
				System.out.println("O incremento de x �" + x);
				
				y--;
				
				System.out.println("O decremento de x �" + x);
				
				x+=10;
				System.out.println("O resultado da Aditiva � " + x);
				
				y-=10;
				System.out.println(" O resultado da Subrativa �" + y);

	}

}
