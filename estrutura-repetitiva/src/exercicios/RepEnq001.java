package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class RepEnq001 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int senha = 2002;
		int digitado = sc.nextInt();
		
		while(digitado != senha) {
			System.out.println("Senha Invalida");
			digitado = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();

	}

}
