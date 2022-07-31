package Iniciante.Repeticao;

import java.util.Scanner;

public class Uri_1145_SequenciaLogica {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int i = 1;
		int x = input.nextInt();
		int y = input.nextInt();
		
		 while(i < y) {
			 int contador = 0;
			 while(contador < x ) {
				 System.out.printf("%d " ,i + contador);
				 contador++;
			 }
			 System.out.println();
			 i += x;
		 }
				
		
		input.close();
	}
}
