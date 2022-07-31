package Iniciante.Repeticao;

import java.util.Scanner;

public class Uri_1080_MaiorEPosição {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int y = 0;
		int i2 = 0;

		for (int i = 1; i <= 100; i++) {
			int x = input.nextInt();
			
			if( x > y) {
				y = x;
				i2 = i;
			}

		}
		System.out.println(y);
		System.out.println(i2);

		input.close();
	}
}
