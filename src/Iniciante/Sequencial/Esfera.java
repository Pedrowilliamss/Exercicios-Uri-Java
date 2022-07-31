package Iniciante.Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Esfera {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int raio = input.nextInt();
		
		double volume = (4.0 / 3.0) *  3.14159 * Math.pow(raio, 3);
		
		System.out.printf("VOLUME = %.3f%n", volume);
		
		input.close();
	}
}
