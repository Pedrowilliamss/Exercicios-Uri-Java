package Iniciante.Selecao;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		if(Math.abs(b - c) < a && a  < b + c) {
			System.out.println("Perimetro = " + df.format(a + b + c));
		    
		} else {
			System.out.println("Area = " + df.format(((a + b) * c) / 2));
		};
		
		input.close();
	}
	
}
