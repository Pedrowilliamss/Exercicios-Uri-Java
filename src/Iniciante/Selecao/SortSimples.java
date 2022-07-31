package Iniciante.Selecao;

import java.util.Scanner;

public class SortSimples {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		if( a > b && a > c) {
			if(b > c) {
				System.out.printf("%d%n%d%n%d%n",c,b,a);
				System.out.printf("%n%d%n%d%n%d%n",a,b,c);
			} else if(c > b) {
				System.out.printf("%d%n%d%n%d%n",b,c,a);
				System.out.printf("%n%d%n%d%n%d%n",a,b,c);
			}
		} else if(b > a && b > c) {
			if(a > c) {
				System.out.printf("%d%n%d%n%d%n",c,a,b);
				System.out.printf("%n%d%n%d%n%d%n",a,b,c);
			} else if(c > a) {
				System.out.printf("%d%n%d%n%d%n",a,c,b);
				System.out.printf("%n%d%n%d%n%d%n",a,b,c);
			}
		} else if(c > a && c > b) {
			if(a > b) {
				System.out.printf("%d%n%d%n%d%n",b,a,c);
				System.out.printf("%n%d%n%d%n%d%n",a,b,c);
			} else if(b > a) {
				System.out.printf("%d%n%d%n%d%n",a,b,c);
				System.out.printf("%n%d%n%d%n%d%n",a,b,c);
			}
		};
		
		input.close();
	}
	}
