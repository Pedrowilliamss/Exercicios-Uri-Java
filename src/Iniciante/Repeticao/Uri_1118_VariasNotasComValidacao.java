package Iniciante.Repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1118_VariasNotasComValidacao  {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
	    
		double nota1, nota2, id = 1;

		while (id == 1) {
		nota1 = input.nextDouble();
		while (nota1 > 10 || nota1 < 0) {
			System.out.println("nota invalida");
			nota1 = input.nextDouble();
		}
		
		nota2 = input.nextDouble();
		while (nota2 > 10 || nota2 < 0) {
			System.out.println("nota invalida");
			nota2 = input.nextDouble();
		}
		
		double media = (nota1 + nota2) / 2;
		System.out.printf("media = %.2f%n",media);
		
		System.out.println("novo calculo (1-sim 2-nao)");
		id = input.nextInt();
		
		while(id != 1 && id != 2) {
			System.out.println("novo calculo (1-sim 2-nao)");
			id = input.nextInt();
		}
		}
		input.close();
	}
}

