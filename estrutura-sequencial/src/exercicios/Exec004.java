package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exec004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		int numeroFuncionario, horasTrabalhadas;
		double salario, valorHoraTrabalhada;
		
		numeroFuncionario = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		valorHoraTrabalhada = sc.nextDouble();
		
		salario = horasTrabalhadas * valorHoraTrabalhada;
		
		System.out.println("NUMBER = "+ numeroFuncionario);
		System.out.printf("SALARY = %.2f", salario);
		
		sc.close();

	}

}
