package Iniciante.Teste;

import java.util.Scanner;

public class Teste1_Uri_1101 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		
		int M;	
		int N;
		M = entrada.nextInt();
		N = entrada.nextInt();
		
		if (N > 0 && M > 0) {
		do {
			int soma = 0;
		if( M > N) {		
			for(int i = N; i <= M ; i++) {
				soma += i;
				System.out.printf("%d ", i);
			}
			System.out.println("Sum=" + soma);
		} else if( N > M) {		
			for(int i = M; i <= N ; i++) {
				soma += i;
				System.out.printf("%d ", i);
			}
			System.out.println("Sum=" + soma);
		}
		M = entrada.nextInt();
		N = entrada.nextInt();
		} while ( N > 0 && M > 0);
		}
		
		entrada.close();
	}
}
