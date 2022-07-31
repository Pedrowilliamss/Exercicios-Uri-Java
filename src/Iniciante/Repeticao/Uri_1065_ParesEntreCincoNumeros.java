package Iniciante.Repeticao;

import java.util.Scanner;

public class Uri_1065_ParesEntreCincoNumeros {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int i = 1;
		int pares = 0;
		
		while(i <= 5) {
			int e = input.nextInt();
			
			if(e % 2 == 0) {
				pares ++;
			}
			i++;
		}
		
		System.out.println(pares + " valores pares");
		
		input.close();
	}
}
