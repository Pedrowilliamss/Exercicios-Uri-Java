package Iniciante.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Uri_1174_SelecaoEmVetor1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		double[] A = new double[100];
		
		for(int i = 0 ; i < A.length ; i++ ) {
			A[i] = input.nextDouble();
		}
		
		for(int i = 0 ; i < A.length ; i++ ) {
			if(A[i] <= 10) {
				System.out.println("A["+i+"] = " + A[i]);
			}
		}
		
		
		
		input.close();
	}
}
