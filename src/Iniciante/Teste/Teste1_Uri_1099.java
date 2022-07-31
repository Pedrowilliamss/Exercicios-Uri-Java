package Iniciante.Teste;

import java.util.Scanner;

public class Teste1_Uri_1099 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		int e = input.nextInt();
		
		for(int i = 0 ; i < e + 1 ; i++) {
			int aux = 0;
			int x = input.nextInt();
			int y = input.nextInt();
			
			int dif = Math.abs(x - y);
			if ( dif <= 2 && x % 2 == 1) {
				
			} else if ( dif >= 5 && x % 2 == 1) {
				if( x > y) {	
					for( int i2 = y ; i2 < x ; i2++) {
						if(i2 % 2 == 1) {
							aux = aux + i2;
						}
						aux = aux - x;
					}
					
				} else if( x < y) {						
					for( int i3 = x ; i3 < y ; i3++) {
						if(i3 % 2 == 1) {
							aux = aux + i3;
						}
						aux = aux - y;
					}	
			}
			}else if( x > y) {	
				for( int i2 = y ; i2 < x ; i2++) {
					if(i2 % 2 == 1) {
						aux = aux + i2;
					}
				}
				
			} else if( x < y) {						
				for( int i3 = x ; i3 < y ; i3++) {
					if(i3 % 2 == 1) {
						aux = aux + i3;
					}
				}
			    
		    } else if(x == y) {
		    }
			System.out.println(aux);
		}
		
		
		
		input.close();
	}
}
