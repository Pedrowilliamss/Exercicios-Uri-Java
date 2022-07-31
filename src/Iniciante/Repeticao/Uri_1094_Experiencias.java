package Iniciante.Repeticao;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Uri_1094_Experiencias {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		int e = input.nextInt();
		double coelhos = 0;
		double ratos = 0;
		double sapos = 0;
		double Pcoelhos = 0;
		double Pratos = 0;
		double Psapos = 0;
		
		String C = "C";
		String R = "R";
		String S = "S";
		double total = 0;
		
		for(int i = 1; i <= e; i++) {
		 	double x = input.nextDouble();
		 	String y = input.next();
		 	
		 	if(y.equals(C)) {
		 		coelhos = x + coelhos;
		 	} if(y.equals(R)) {
		 		ratos = x + ratos;
		 	} if(y.equals(S)) {
		 		sapos = x + sapos;
		 	}
		 	
		 	total = coelhos + sapos + ratos;
		}
		int Icoelhos = (int) coelhos;
		int Iratos = (int) ratos;
		int Isapos = (int) sapos;
		int Itotal = (int) total;
		
		
		Pcoelhos = (100 * coelhos) / total;
		Pratos = (100 * ratos) / total;
		Psapos = (100 * sapos) / total;
		
		System.out.println("Total: " + Itotal + " cobaias");
		System.out.println("Total de coelhos: " + Icoelhos);
		System.out.println("Total de ratos: " + Iratos);
		System.out.println("Total de sapos: " + Isapos);
		System.out.println("Percentual de coelhos: " + df.format(Pcoelhos) + " %");
		System.out.println("Percentual de ratos: " + df.format(Pratos) + " %");
		System.out.println("Percentual de sapos: " + df.format(Psapos) + " %");
		
		input.close();		
	}
}
