package Iniciante.Repeticao;

import java.util.Scanner;

public class Uri_1075_Resto2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		
		for(int i = 1 ; i <= 10000; i++) {
			if(i % x == 2) {
				System.out.println(i);
			}
		}
		
		
		input.close();
	}
}
