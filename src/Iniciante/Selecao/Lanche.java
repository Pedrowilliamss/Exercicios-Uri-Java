package Iniciante.Selecao;

import java.util.Scanner;

public class Lanche {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		double valor = 0.0;
		
		if(x == 1) {
			valor = y * 4.0;
			System.out.printf("Total: R$ %.2f%n",valor);
		} else if(x == 2){
			valor = y * 4.5;
			System.out.printf("Total: R$ %.2f%n",valor);
		} else if(x == 3){
			valor = y * 5.0;
			System.out.printf("Total: R$ %.2f%n",valor);
		}else if(x == 4){
			valor = y * 2.0;
			System.out.printf("Total: R$ %.2f%n",valor);
		}else if(x == 5){
			valor = y * 1.5;
			System.out.printf("Total: R$ %.2f%n",valor);
		};
		
		
		input.close();
	}
}
