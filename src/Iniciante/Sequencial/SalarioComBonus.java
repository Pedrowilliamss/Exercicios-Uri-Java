package Iniciante.Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class SalarioComBonus {

public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		@SuppressWarnings("unused")
		String NomeFuncionario = input.next();
		double SalarioFixo = input.nextDouble();
		double VendasEfetuadas = input.nextDouble();	
		double salario = SalarioFixo + (VendasEfetuadas * 0.15);
		
		System.out.printf("TOTAL = R$ %.2f%n", salario);
		
		
		input.close();
	
}
}