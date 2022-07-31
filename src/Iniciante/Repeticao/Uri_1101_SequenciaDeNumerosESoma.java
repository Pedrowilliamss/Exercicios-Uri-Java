package Iniciante.Repeticao;

import java.util.Scanner;

public class Uri_1101_SequenciaDeNumerosESoma {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		int M,N;
		
		while((M = entrada.nextInt()) > 0 && (N = entrada.nextInt()) > 0) {
			int soma = 0;
			if(M > N) {
				for(int i = N ; i <= M;i++) {
					soma += i;
					System.out.printf("%d ", i);
				}
				System.out.println("Sum=" + soma);
			} else if(N > M) {
				for(int i = M ; i <= N;i++) {
					soma += i;
					System.out.printf("%d ", i);
				}
				System.out.println("Sum=" + soma);
			}
		}
		
		entrada.close();
	}
}
