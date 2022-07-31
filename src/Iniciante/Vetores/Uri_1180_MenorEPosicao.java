package Iniciante.Vetores;

import java.util.Scanner;

public class Uri_1180_MenorEPosicao {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int[] x = new int[n];
		int valor = 0;
		int lugar = 0;

		for (int i = 0; i < n; i++) {
			x[i] = input.nextInt();
			if (i == 0) {
				valor = x[i];
				lugar = i;
			} else if (x[i] < valor) {
				valor = x[i];
				lugar = i;
			}
		}
		System.out.println("Menor valor: " + valor);
		System.out.println("Posicao: " + lugar);

		input.close();
	}
}
