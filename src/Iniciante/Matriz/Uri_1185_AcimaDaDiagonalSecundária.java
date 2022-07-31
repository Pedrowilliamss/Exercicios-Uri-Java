package Iniciante.Matriz;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1185_AcimaDaDiagonalSecundária {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		double[][] matriz = new double[12][12];
		String funcao = input.next();
		double soma = 0; 
		double media = 0;
		int contador = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = input.nextDouble();
			}
		}
		
		for (int i = 0 ; i < (matriz.length - 1); i++) {
			for(int j = 0 ; j < ((matriz.length -1) - i); j++) {
				contador++;
				soma += matriz[i][j];
				
			}
		}
		media = soma / contador;
		
		if(funcao.equals("S")) {
			System.out.printf("%.1f\n",soma);
		} else if(funcao.equals("M")) {
			System.out.printf("%.1f\n",media);
		}
	}
}
