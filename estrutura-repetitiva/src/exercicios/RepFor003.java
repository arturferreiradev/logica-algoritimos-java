package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class RepFor003 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i ++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			double mediaPonderada = (a * 2 + b * 3 + c * 5) / (2 + 3 + 5);
			
			System.out.printf("%.1f%n", mediaPonderada);
		}
		
		sc.close();

	}

}
