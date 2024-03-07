package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class RepFor007 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		if (n < 0) {
			n = sc.nextInt();
		}
		
		for (int i = 1; i <= n; i++) {
			int i2 = (int)Math.pow(i, 2);
			int i3 = (int)Math.pow(i, 3);
			System.out.println(i + " " + i2 + " " + i3);
		}

		sc.close();
	}
}
