package Iniciante.Repeticao;

import java.util.Scanner;

public class Uri_1133_RestoDaDivisao {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int x = input.nextInt();
		int y = input.nextInt();

		if (x > y) {
			for (int i = y + 1; i < x; i++) {
				if (i % 5 == 2 || i % 5 == 3 ) {
					System.out.println(i);
				}
			}
		} else if (x < y) {
			for (int i = x + 1; i < y; i++) {
				if (i % 5 == 2 || i % 5 == 3 ) {
					System.out.println(i);
				}
			}
		}

		input.close();
	}
}
