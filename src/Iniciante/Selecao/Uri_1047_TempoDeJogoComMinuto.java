package Iniciante.Selecao;

import java.util.Scanner;

public class Uri_1047_TempoDeJogoComMinuto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int HI = entrada.nextInt();
		int MI = entrada.nextInt();
		int HF = entrada.nextInt();
		int MF = entrada.nextInt();
		int horaV = HF - HI;
		int minutoV = MF - MI;
		
		if( HI == HF && MI == MF ) {
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		} else if ( HI == HF && MI < MF ) {
			System.out.println("O JOGO DUROU 0 HORA(S) E " 
			    + minutoV + " MINUTO(S)" );
		} else if( HI < HF && MI == MF ) {
			System.out.println("O JOGO DUROU " +
					horaV + " HORA(S) E 0 MINUTO(S)");
		}else if( HI < HF && MI < MF) {
			System.out.println("O JOGO DUROU " + horaV + " HORA(S) E " + minutoV + " MINUTO(S)");
		}else if( HI > HF && MI < MF) {
			horaV = Math.abs(HI - 24) + HF;
			System.out.println("O JOGO DUROU " + horaV + " HORA(S) E " + minutoV + " MINUTO(S)");
		}else if( HI < HF && MI > MF) {
			horaV = horaV - 1;
			minutoV = Math.abs(MI - 60) + MF;
			System.out.println("O JOGO DUROU " + horaV + " HORA(S) E " + minutoV + " MINUTO(S)");
		}else if(HI > HF && MI > MF) {
			horaV = Math.abs(HI - 24) + HF;
			horaV = horaV - 1;
			minutoV = Math.abs(MI - 60) + MF;
			System.out.println("O JOGO DUROU " + horaV + " HORA(S) E " + minutoV + " MINUTO(S)");
		} else if (HI == HF && MI > MF) {
			minutoV = Math.abs(MI - 60) + MF;
			System.out.println("\"O JOGO DUROU 23 HORA(S) E " + minutoV + " MINUTO(S)");
		} else if(HI > HF && MI == MF) {
			horaV = Math.abs(HI - 24) + HF;
			System.out.println("O JOGO DUROU " +
					horaV + " HORA(S) E 0 MINUTO(S)");
		};

		
		
		entrada.close();
	
}
}
