package Iniciante.Repeticao;

import java.util.Scanner;

public class Uri_1074_ParOuImpar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int i = 1;
		int e = input.nextInt();

		while (i <= e) {
			int x = input.nextInt();

			if (x == 0) {
				System.out.println("NULL");
			}
			  if (x % 2 == 0 && x > 0) {
				System.out.println("EVEN POSITIVE");
			} 
			  if (x % 2 == 0 && x < 0) {
				  System.out.println("EVEN NEGATIVE");
			}		
			  if (x % 2 != 0 && x > 0) {
				  System.out.println("ODD POSITIVE");
			}
              if (x % 2 != 0 && x < 0) {
            	  System.out.println("ODD NEGATIVE");
              }
			i++;
		}

		input.close();
	}
}
