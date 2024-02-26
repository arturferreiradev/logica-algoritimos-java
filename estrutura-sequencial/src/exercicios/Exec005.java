package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exec005 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		int codigoPeca1, numeroPecas1, codigoPeca2, numeroPecas2;
		double valorUnitarioPeca1, valorUnitarioPeca2, total;
		
		codigoPeca1 = sc.nextInt();
		numeroPecas1 = sc.nextInt();
		valorUnitarioPeca1 = sc.nextDouble();
		
		sc.nextLine();
		
		codigoPeca2 = sc.nextInt();
		numeroPecas2 = sc.nextInt();
		valorUnitarioPeca2 = sc.nextDouble();
		
		total = (numeroPecas1 * valorUnitarioPeca1) + (numeroPecas2 * valorUnitarioPeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

	}

}
