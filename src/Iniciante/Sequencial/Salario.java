package Iniciante.Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int NumeroFuncionario = input.nextInt();
		int HorasTrabalhadas = input.nextInt();
		double ValorHora = input.nextDouble();
		
		double salario = HorasTrabalhadas * ValorHora;
		
		System.out.println("NUMBER = " + NumeroFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		input.close();
	}
}
