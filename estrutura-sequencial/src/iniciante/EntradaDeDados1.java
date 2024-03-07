package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados1 {

	public static void main(String[] args) {
		// Leitura tipos de dados
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char a;
		String x;
		int y;
		Double z;
		
		a = sc.next().charAt(0); // Mostra o caracter no indice 0 do texto digitado
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("Dados digitados: ");
		System.out.println(a);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
	}

}
