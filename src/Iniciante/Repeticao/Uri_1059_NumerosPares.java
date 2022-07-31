package Iniciante.Repeticao;

public class Uri_1059_NumerosPares {

	public static void main(String[] args) {

//		int contador = 1;
//		
//		while (contador <= 100){
//			int numero = contador % 2;
//			
//			if(numero == 0) {
//				System.out.println(contador);
//			}
//			contador++;
//		}
	
		for(int i = 1; i <= 100; i++) {
			int numero = i % 2;
			
			if(numero == 0) {
				System.out.println(i);
			}
		}	
	}
}
