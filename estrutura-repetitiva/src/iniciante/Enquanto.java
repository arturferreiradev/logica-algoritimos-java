package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Enquanto {

	public static void main(String[] args) {
		// Fazer um programa que lê números inteiros até que um zero seja lido. Ao final mostra a soma dos números lidos.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, soma;
		soma = 0;
		
		x = sc.nextInt();
		while(x != 0) {
			soma += x;
			x = sc.nextInt();
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}
