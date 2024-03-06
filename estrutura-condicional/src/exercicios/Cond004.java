package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Cond004 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal, horasJogadas;
		
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		if(horaInicial < horaFinal) {
			horasJogadas = horaFinal - horaInicial; 
		} else {
			horasJogadas = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + horasJogadas + " HORA(S)");
		
		sc.close();

	}

}
