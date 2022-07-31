package Iniciante.Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Distancia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int entrada= input.nextInt();
		
		int tempo = (entrada * 60) / 30;
		
		System.out.println(tempo + " minutos");
		
		input.close();
	}
}
