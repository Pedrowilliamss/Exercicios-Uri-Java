package Iniciante.Repeticao;

import java.util.Scanner;

public class Uri_1066_ParesImparesPositivosENegativos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int i = 1;
		int pares = 0 ;
		int impares = 0 ;
		int positivos = 0 ;
		int negativos= 0 ;
		
		while(i <= 5) {
			int e = input.nextInt();
			if (e % 2 == 0) {
				pares ++;
			} if (e % 2 != 0) {
				impares ++;
			} if (e > 0) {
				positivos ++;
			} if (e < 0) {
				negativos ++;
			}			
			i++;
		}
		
		System.out.println(pares + " valor(es) par(es)");
		System.out.println(impares + " valor(es) impar(es)");
		System.out.println(positivos + " valor(es) positivo(s)");
		System.out.println(negativos + " valor(es) negativo(s)");
		
		input.close();
	}
}
