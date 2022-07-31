package Iniciante.Repeticao;

import java.util.Scanner;

public class Uri_1132_MultiplosDe13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int x = input.nextInt();
		int y = input.nextInt();
		int soma = 0;

		if (x > y) {
			for (int i = y; i <= x; i++) {
				if (i % 13 != 0) {
					soma += i;
				}
			}
		} else if (x < y) {
			for (int i = x; i <= y; i++) {
				if (i % 13 != 0) {
					soma += i;
				}
			}
		}

		System.out.println(soma);
		input.close();
	}
}
