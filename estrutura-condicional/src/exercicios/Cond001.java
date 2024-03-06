package exercicios;

import java.util.Scanner;

public class Cond001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, absx;
		
		x = sc.nextInt();
		absx = (int) Math.abs(x);
		
		if (absx == x) {
			System.out.println("NÃO NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}
		
		

	}

}
