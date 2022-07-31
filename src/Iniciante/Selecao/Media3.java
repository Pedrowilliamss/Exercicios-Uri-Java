package Iniciante.Selecao;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Media3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		
		double A = input.nextDouble(); 
		double B = input.nextDouble(); 
		double C = input.nextDouble(); 
		double D = input.nextDouble(); 
		
		
		double media = ((A * 2) + (B * 3) + (C * 4) + (D*1)) /10 ;
		System.out.println("Media: " + df.format(media));
		
		if(media >= 7){
			System.out.println("Aluno aprovado.");			
		} else if(media < 5){
			System.out.println("Aluno reprovado.");	
		} else if( media >= 5 && media < 7) {
			System.out.println("Aluno em exame.");	
			
			double exame = input.nextDouble();
			System.out.printf("Nota do exame: %.1f%n",exame);
			media = (media + exame) / 2;
			
			  if(media >= 5) {
				  System.out.println("Aluno aprovado.");
				  System.out.printf("Media final: %.1f%n",media);
			  }else if(media < 5) {
				  System.out.println("Aluno reprovado.");
				  System.out.println("Media: " + df.format(media));
			}
		};
		input.close();
	}
}
