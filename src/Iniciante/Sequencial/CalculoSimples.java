package Iniciante.Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class CalculoSimples {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		@SuppressWarnings("unused")
		int codigo1 = input.nextInt();
		int numero1 = input.nextInt();
		double valorUnitario1 = input.nextDouble();
		
		@SuppressWarnings("unused")
		int codigo2= input.nextInt();
		int numero2 = input.nextInt();
		double valorUnitario2 = input.nextDouble();
		
		double valorTotal = (numero1 * valorUnitario1) + (numero2 * valorUnitario2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);
		input.close();
	}
}
