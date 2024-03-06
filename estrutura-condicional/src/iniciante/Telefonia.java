package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Telefonia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valorAPagar, valorMinimo;
		int minutos;
		valorMinimo = 50.00;
		
		System.out.println("Digite a quantidade de minutos: ");
		minutos = sc.nextInt();
		
		if(minutos > 100) {
			valorAPagar = ((minutos - 100) * 2.00) + valorMinimo;
		} else {
			valorAPagar = valorMinimo;
		}
		
		System.out.printf("Valor a pagar: R$ %.2f", valorAPagar);
		
		sc.close();

	}

}
