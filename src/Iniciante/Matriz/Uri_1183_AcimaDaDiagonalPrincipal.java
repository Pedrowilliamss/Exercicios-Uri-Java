package Iniciante.Matriz;

import java.io.IOException;
import java.util.Scanner;

public class Uri_1183_AcimaDaDiagonalPrincipal {

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		double soma = 0;
		String funcao = input.next();
		double[][] M = new double[12][12];
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				M[i][j] = input.nextDouble();
			}
		}

		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				if (j > i)
					soma += M[i][j];
			}
		}

		if (funcao.equals("m"))
			soma /= ((M.length * M.length) - 12) / 2; // 66
		System.out.println(String.format("%.1f", soma));

	
	}
}
