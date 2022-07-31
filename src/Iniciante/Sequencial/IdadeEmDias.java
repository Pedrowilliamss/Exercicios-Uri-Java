package Iniciante.Sequencial;

import java.util.Scanner;

public class IdadeEmDias {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int dias = input.nextInt();
		
		int qtdAnoos = dias / 365;
		dias = dias % 365;
		
		int qtdMeses = dias / 30;
		dias = dias % 30;
		
		int qtdDias = dias;
		
		System.out.println(qtdAnoos + " ano(s)");
		System.out.println(qtdMeses + " mes(es)");
		System.out.println(qtdDias + " dia(s)");
		
		input.close();
	}
}
