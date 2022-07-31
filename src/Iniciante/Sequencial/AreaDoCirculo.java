package Iniciante.Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class AreaDoCirculo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double raio = input.nextDouble();
		double circ = 3.14159 * Math.pow(raio,2);
		
		System.out.printf("A=%.4f%n",  circ);
		
		input.close();
	}
}
