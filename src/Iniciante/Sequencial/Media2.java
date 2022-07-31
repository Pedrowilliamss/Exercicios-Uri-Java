package Iniciante.Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Media2 {

public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double A = input.nextDouble();
		double B = input.nextDouble();
		double C = input.nextDouble();
		
		double media = ((A * 2) + (B * 3) + (C * 5)) / 10.0;
		
		System.out.printf("MEDIA = %.1f%n", media);
		input.close();
	}
}
