package Iniciante.Sequencial;

import java.util.Scanner;

public class ConversaoDeTempo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		int hora, horaR, minuto, minutoR, segundo;
		
		if(N > 3600) {
			hora = N / 3600;
			horaR = N % 3600;
			minuto = horaR / 60;
			minutoR = horaR % 60;
			segundo = minutoR;
		} else if(N < 3600 && N > 60) {
			hora = 0;
			minuto = N / 60;
			minutoR = N % 60;
			segundo = minutoR;
		} else {
			hora = 0;
			minuto = 0;
			segundo = N;
		}
		
		
		System.out.println(hora + ":" + minuto + ":" + segundo);
		input.close();
	}
}
