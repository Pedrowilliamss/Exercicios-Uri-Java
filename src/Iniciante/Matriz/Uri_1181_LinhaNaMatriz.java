package Iniciante.Matriz;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1181_LinhaNaMatriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		double[][] matriz = new double[12][12];
		int linha = input.nextInt();
		String funcao = input.next();
		double soma = 0;
		double media = 0;

		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++) {
				matriz[i][j] = input.nextDouble();
			}
		}
		for (int j = 0; j < 12; j++) {
			soma += matriz[linha][j];
			media = soma / 12;
		}

		if (funcao.equals("S")) {
			System.out.printf("%.1f\n", soma);
		} else if (funcao.equals("M")) {
			System.out.printf("%.1f\n", media);
		}

		input.close();
	}
}
