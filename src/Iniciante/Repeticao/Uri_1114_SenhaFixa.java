package Iniciante.Repeticao;

import java.util.Scanner;

public class Uri_1114_SenhaFixa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		@SuppressWarnings("unused")
		String pass;
		String senha = "2002";

		while (!(pass = input.next()).equals(senha)) {
			System.out.println("Senha Invalida");
		}
		System.out.println("Acesso Permitido");

		input.close();
	}
}