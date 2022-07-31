package Iniciante.Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Double A = input.nextDouble();
		Double B = input.nextDouble();
		Double C = input.nextDouble();
		
		double ATrinagulo = (A*C) / 2;
		double ACirculo = (3.14159 * Math.pow(C, 2));
	    double ATrapezio = ((A + B) * C) / 2;
	    double AQuadrado = B * B;
	    double ARetangulo = A * B;
		
	    System.out.printf("TRIANGULO: %.3f%n", ATrinagulo);
	    System.out.printf("CIRCULO: %.3f%n", ACirculo);
	    System.out.printf("TRAPEZIO: %.3f%n", ATrapezio);
	    System.out.printf("QUADRADO: %.3f%n", AQuadrado);
	    System.out.printf("RETANGULO: %.3f%n", ARetangulo);
		
		input.close();
   }
}