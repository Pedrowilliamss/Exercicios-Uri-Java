package Iniciante.Repeticao;

import java.io.IOException;
import java.util.Scanner;

public class Uri_1131_Grenais {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int inter = 0, gremio = 0, empate = 0, id = 1, total = 0;

		while (id == 1) {
			total++;
			int x = input.nextInt();
			int y = input.nextInt();

			if (x > y)  inter++;
			else if (x < y)   gremio++;
			else  empate++;

			System.out.println("Novo grenal (1-sim 2-nao)");
			id = input.nextInt();
			while (id != 1 && id != 2) {
				System.out.println("Novo grenal (1-sim 2-nao)");
				id = input.nextInt();
			}
		}
		System.out.println(total + " grenais");
		System.out.println("Inter:" + inter);
		System.out.println("Gremio:" + gremio);
		System.out.println("Empates:" + empate);
		if (inter > gremio) {
			System.out.println("Inter Venceu mais");
		} else if (inter < gremio) {
			System.out.println("Gremio Venceu mais");
		} else if (inter == gremio) {
			System.out.println("Nao houve vencedor");
		} else
			input.close();
	}
}
