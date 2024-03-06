package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Cond005 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, quantidade;
		double  precoCodigo, valorAPagar;
		
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		precoCodigo = 0;
		
		if (codigo == 1) {
			precoCodigo = 4.00;
		} else if (codigo == 2) {
			precoCodigo = 4.50;
		} else if (codigo == 3) {
			precoCodigo = 5.00;
		}  else if (codigo == 4) {
			precoCodigo = 2.00;
		}  else if (codigo == 5) {
			precoCodigo = 1.50;
		} else {
			System.out.println("Inválido");
		}
		
		valorAPagar = precoCodigo * quantidade;
		
		System.out.printf("Total: R$ %.2f%n", valorAPagar);
		
		sc.close();

	}

}
