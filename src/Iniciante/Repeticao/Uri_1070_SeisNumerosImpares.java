package Iniciante.Repeticao;

import java.util.Scanner;

public class Uri_1070_SeisNumerosImpares {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int e = input.nextInt();
		int i = e + 11;

		while (e <= i) {
			if (e % 2 == 1) {
				System.out.println(e);
			}			
			e++;
		}

		input.close();
	}
}
