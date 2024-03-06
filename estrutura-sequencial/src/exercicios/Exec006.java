package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exec006 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, area;
		
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		
		area = (a * c) / 2;
		System.out.printf("TRIANGULO: %.3f%n", area);
		
		area = Math.pow(c, 2) * 3.14159;
		System.out.printf("CIRCULO: %.3f%n", area);
		
		area = ((a + b) * c) / 2;
		System.out.printf("TRAPEZIO: %.3f%n", area);
		
		area = Math.pow(b, 2);
		System.out.printf("QUADRADO: %.3f%n", area);
		
		area = a * b;
		System.out.printf("QUADRADO: %.3f%n", area);
		
		sc.close();
	}

}
