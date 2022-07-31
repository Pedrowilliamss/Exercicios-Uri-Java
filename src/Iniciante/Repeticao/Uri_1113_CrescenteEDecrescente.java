package Iniciante.Repeticao;

import java.util.Scanner;

public class Uri_1113_CrescenteEDecrescente {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x,y;
		
		while ((x = input.nextInt()) != (y = input.nextInt())) {	
			if(x > y) {
				System.out.println("Decrescente");
			} else {
				System.out.println("Crescente");
			}
		}
		
		
		input.close();
	}
}
