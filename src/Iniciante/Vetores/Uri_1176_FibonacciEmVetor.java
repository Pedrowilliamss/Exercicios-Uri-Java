package Iniciante.Vetores;

import java.util.Scanner;

public class Uri_1176_FibonacciEmVetor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, T = input.nextInt();

		int[] fib = new int[60];

		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i < fib.length; i++) {		
				fib[i] = fib[i - 1] + fib[i - 2];
		}

		for (int i = 0; i < T; i++) {
			x = input.nextInt();
			System.out.printf("Fib(%d) = %d\n", x, fib[x]);
		}

		input.close();
	}
}
