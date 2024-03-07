package iniciante;

public class CondicaoTernaria {

	public static void main(String[] args) {
		// Exemplo usando condição ternária, If else de forma simplificada em uma linha
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);
	}

}
