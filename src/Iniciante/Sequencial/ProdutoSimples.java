package Iniciante.Sequencial;

import java.util.Scanner;

public class ProdutoSimples {

	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);
		
		int A = input.nextInt();
		int B = input.nextInt();
		
		System.out.println("PROD = " + (A * B) );
		
		input.close();
	}
}
