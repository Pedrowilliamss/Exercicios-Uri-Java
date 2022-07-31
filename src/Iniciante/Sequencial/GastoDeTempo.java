package Iniciante.Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class GastoDeTempo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
	
		
		int tempo = input.nextInt();
		int velocidade = input.nextInt();
		
		double distancia = tempo * velocidade;
		double litros = distancia / 12;
		
		System.out.printf("%.3f%n", litros);
		
		input.close();
	}
}
