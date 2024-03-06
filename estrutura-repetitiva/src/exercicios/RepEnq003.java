package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class RepEnq003 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int alcool, gasolina, diesel;
		alcool = gasolina = diesel = 0;

		while (x != 4) {
			switch (x) {
			case 1:
				alcool += 1;
				break;
			case 2:
				gasolina += 1;
				break;
			case 3:
				diesel += 1;
				break;
			case 4:
				break;
			default:
				x = sc.nextInt();
				break;
			}
			x = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();

	}

}
