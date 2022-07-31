package Iniciante.Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class NotasEMoedas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
	
		double valorInicial = input.nextDouble();
		int valor;
		
		System.out.println("NOTAS:");
		
		valor = (int) valorInicial / 100;
		System.out.printf("%d nota(s) de R$ 100.00%n", valor);
		valorInicial = valorInicial % 100;

		valor = (int) valorInicial / 50;
		System.out.printf("%d nota(s) de R$ 50.00%n", valor);
		valorInicial = valorInicial % 50;

		valor = (int) valorInicial / 20;
		System.out.printf("%d nota(s) de R$ 20.00%n", valor);
		valorInicial = valorInicial % 20;
		
		valor = (int) valorInicial / 10;
		System.out.printf("%d nota(s) de R$ 10.00%n", valor);
		valorInicial = valorInicial % 10;
		
		valor = (int) valorInicial / 5;
		System.out.printf("%d nota(s) de R$ 5.00%n", valor);
		valorInicial = valorInicial % 5;
		
		valor = (int) valorInicial / 2;
		System.out.printf("%d nota(s) de R$ 2.00%n", valor);
		valorInicial = valorInicial % 2;
		
		System.out.println("MOEDAS:");
		valorInicial = valorInicial * 100;
		
		valor = (int) valorInicial / 100;
		System.out.printf("%d moeda(s) de R$ 1.00%n",valor );
		valorInicial = valorInicial % 100;
		
		valor = (int) valorInicial / 50;
		System.out.printf("%d moeda(s) de R$ 0.50%n",valor );
		valorInicial = valorInicial % 50;
		
		valor = (int) valorInicial / 25;
		System.out.printf("%d moeda(s) de R$ 0.25%n",valor );
		valorInicial = valorInicial % 25;
		
		valor = (int) valorInicial / 10;
		System.out.printf("%d moeda(s) de R$ 0.10%n",valor );
		valorInicial = valorInicial % 10;
		
		valor = (int) valorInicial / 5;
		System.out.printf("%d moeda(s) de R$ 0.05%n",valor );
		valorInicial = valorInicial % 5;
		
		valor = (int) valorInicial / 1;
		System.out.printf("%d moeda(s) de R$ 0.01%n",valor );
		valorInicial = valorInicial % 1;
			
		input.close();
	}
}
