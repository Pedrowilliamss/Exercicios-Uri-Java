package Iniciante.Sequencial;

import java.util.Scanner;

public class SomaSimples {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int A = input.nextInt();
		int B = input.nextInt();
		
		System.out.println("SOMA = " + (A + B));
		
		input.close();
	}
}
