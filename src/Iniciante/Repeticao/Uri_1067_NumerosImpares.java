package Iniciante.Repeticao;

import java.util.Scanner;

public class Uri_1067_NumerosImpares {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int e = input.nextInt();
		int i = 0;

		while (i <= e) {
			if (i % 2 == 1) {

				System.out.println(i++);
			}
			i++;
		}
		input.close();
	}
}
