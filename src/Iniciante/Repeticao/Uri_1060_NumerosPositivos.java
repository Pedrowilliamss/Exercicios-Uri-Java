package Iniciante.Repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1060_NumerosPositivos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int i = 1;
		int totalP = 0;
		Scanner input = new Scanner(System.in);

		while (i <= 6) {
			double e = input.nextDouble();

			if (e > 0) {
				totalP++;
			}
			i++;
		}

		input.close();
		System.out.println(totalP + " valores positivos");

	}
}
