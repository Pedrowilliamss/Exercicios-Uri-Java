package Iniciante.Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class DistanciaEntreDoisPontos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double X1 = input.nextDouble();
		double Y1 = input.nextDouble();
		double X2 = input.nextDouble();
		double Y2 = input.nextDouble();
		
		double distanciaAB = Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2));
		
		System.out.printf("%.4f%n",distanciaAB);
		
		input.close();
	}
}
