package Iniciante.Matriz;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1184_AbaixoDaDiagonalPrincipal {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		double soma = 0;
		double media = 0;
		int contador = 0;

		double[][] matriz = new double[5][5];
		String funcao = input.next();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = input.nextDouble();
			}
		}
		
		System.out.println(matriz.toString());

		for (int i = 1; i < matriz.length; i++) {
			for (int j = 0; j < i; j++) {
				contador++;
				soma += matriz[i][j];
				media = soma / contador;
			}
		}
		
		if (funcao.toUpperCase().equals("S")) {
			System.out.printf("%.1f\n",soma);
		} else if (funcao.toUpperCase().equals("M")) {
			System.out.printf("%.1f\n",media);
		}
		input.close();
	}
}
