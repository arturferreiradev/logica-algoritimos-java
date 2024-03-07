package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Para {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de números a ser digitada: ");
		int N = sc.nextInt();
		
		int soma = 0;
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			soma += x;			
		}
		
		System.out.println("A soma dos numeros informados é: " + soma);

		sc.close();

	}

}
