package Iniciante.Sequencial;

import java.util.Scanner;

public class Extremamente_basico {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();
		int X = A + B;
		
		
		input.close();
		System.out.println("X = " + X);
	}
}
