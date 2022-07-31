package Iniciante.Vetores;

import java.util.Scanner;

public class Uri_1177_PreenchimentoDeVetorII {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int[] J = new int[1000];
		
		for(int i = 0 ; i < J.length ; i += x) {
			
			for(int i2 = 0; i2 < x ; i2++) {
				int i3 = i + i2;
				if (i3 <= J.length) {
				System.out.printf("N[%d] = %d\n",i3,i2);
				}
			}
		}
		
		input.close();
	}
}
