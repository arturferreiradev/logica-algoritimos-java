package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class RepFor004 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(b == 0) {
				System.out.println("divisao impossivel");
			} else {
				float divisao = (float) a / b;
				System.out.println(divisao);
			}
		}

		sc.close();

	}

}
