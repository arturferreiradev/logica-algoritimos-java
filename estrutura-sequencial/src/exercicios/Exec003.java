package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exec003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int a, b, c, d, diferenca;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		diferenca =(a * b) - (c * d);
		
		System.out.println("DIFERNÇA = " + diferenca);
		
		sc.close();

	}

}
