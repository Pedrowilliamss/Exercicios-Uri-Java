package Iniciante.Selecao;

import java.util.Scanner;

public class Uri_1046_TempoDeJogo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		int variavel = 0;
		
		if(a > b) {
		variavel = Math.abs(a - 24) + b;
		System.out.println("O JOGO DUROU " + variavel +  " HORA(S)");
		} else if(a < b){
			variavel = b - a;
			System.out.println("O JOGO DUROU " + variavel +  " HORA(S)");
		} else if( a == b) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}
		;
		
		entrada.close();
	}
}
