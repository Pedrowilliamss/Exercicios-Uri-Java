package Iniciante.Vetores;

import java.util.Scanner;

public class Uri_1172_substituicaoEmVetor1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] valores = new int[10];
		
		for(int i = 0; i < valores.length ; i++) {
			valores[i] = input.nextInt();
		}
		
		for(int i = 0; i < valores.length ; i++) {
			if(valores[i] <= 0) {
				valores[i] = 1;
			}
		}
		
		for(int i = 0; i < valores.length ; i++) {
			System.out.println("X["+ i +"] = " + valores[i] );
		}
	
	    input.close();
	}
}
