package Iniciante.Vetores;

import java.util.Scanner;

public class Uri_1175_TrocaEmVetor1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] N = new int[20];
		int obs = 0;
		
		for(int i = 0 ; i< N.length; i++) {
			N[i] = input.nextInt();
		}
		
		for(int i = 0 ; i <= 9; i++) {
			obs = N[i];
			N[i] = N[19 - i];
			N[19 - i] = obs;
		}
 
		for(int i = 0 ; i < N.length; i++) {
			System.out.println("N["+i+"] = " + N[i]);
		}

		
		input.close();
	}
}
