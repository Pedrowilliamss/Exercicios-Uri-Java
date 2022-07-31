package Iniciante.Selecao;

import java.util.Locale;
import java.util.Scanner;

public class FormulaDeBhaskara {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double delta = 0;
		double r1 = 0;
		double r2 = 0;
		
		double A = input.nextDouble();
		double B = input.nextDouble();
		double C = input.nextDouble();
		
		delta = Math.pow(B, 2) - 4 * A * C;
		
		if(delta >= 0 && A != 0) {
			r1 =  (- B  + Math.sqrt(delta)) / (2 * A);
			System.out.printf("R1 = %.5f%n",r1);
			
			r2 =  (- B  - Math.sqrt(delta)) / (2 * A);
			System.out.printf("R2 = %.5f%n",r2);
			
		} else {
			System.out.println("Impossivel calcular");
		}
		
		input.close();
	}
}
