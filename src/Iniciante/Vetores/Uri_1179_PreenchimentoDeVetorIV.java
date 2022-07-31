package Iniciante.Vetores;

import java.util.Arrays;
import java.util.Scanner;

public class Uri_1179_PreenchimentoDeVetorIV {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int p = 1;
		int iP = 0;
		int iI = 0;
		int[] par = new int[5];
		int[] impar = new int[5];

		while (p <= 15) {
			int x = input.nextInt();

			if (iP > 4) {
				iP = 0;
				for (int i = 0; i < par.length; i++) {
					System.out.printf("par[%d] = %d\n", i, par[i]);
				}
				Arrays.fill(par, 0);
			}

			if (iI > 4) {
				iI = 0;
				for (int i = 0; i < impar.length; i++) {
					System.out.printf("impar[%d] = %d\n", i, impar[i]);
				}
				Arrays.fill(impar, 0);
			}

			if (x % 2 == 0) {
				par[iP] = x;

				iP++;
			}
			if (Math.abs(x % 2) == 1) {
				impar[iI] = x;

				iI++;
			}

			p++;
		}
		
		for(int i = 0; i < iI; i++) {
			System.out.printf("impar[%d] = %d\n", i, impar[i]);
		}
		for(int i = 0; i < iP; i++) {
			System.out.printf("par[%d] = %d\n", i, par[i]);
		}

		input.close();
	}
}
