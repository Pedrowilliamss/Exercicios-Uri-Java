package Iniciante.Selecao;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Uri_1051_ImpostoDeRenda {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		double salario = input.nextDouble();
		double imposto;
		
		if( salario < 2000.00) {
			System.out.println("Isento");
		} else if ( salario > 2000.00 && salario <= 3000.00) {
			salario = salario - 2000;
			imposto = salario * 0.08;
			System.out.println("R$ " + df.format(imposto));
		} else if ( salario > 3000.00 && salario <= 4500.00) {
			salario = salario - 3000;
			imposto = salario * 0.18 + 80;
			System.out.println("R$ " + df.format(imposto));
		} else if (salario > 4500) {
			salario = salario - 4500;
			imposto = salario * 0.28 + 350;
			System.out.println("R$ " + df.format(imposto));
		}
		
		
		input.close();
	}
}
