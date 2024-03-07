package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class RepFor001 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();

		if (X <= 0 || X > 1000) {
			X = sc.nextInt();
		}

		for (int i = 1; i <= X; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}

		sc.close();

	}

}
