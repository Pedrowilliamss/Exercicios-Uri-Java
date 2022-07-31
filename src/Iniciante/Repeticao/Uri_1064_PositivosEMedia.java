package Iniciante.Repeticao;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Uri_1064_PositivosEMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		DecimalFormat df = new DecimalFormat("0.0");

		int i = 1;
		int totalP = 0;
		double soma = 0;
		double media = 0;

		Scanner input = new Scanner(System.in);

		while (i <= 6) {
			double e = input.nextDouble();

			if (e > 0) {
				soma = e + soma;
				totalP++;
			}
			i++;
		}
		
		media = soma / totalP;

		input.close();
		System.out.println(totalP + " valores positivos");
		System.out.println(df.format(media));
	}
}
