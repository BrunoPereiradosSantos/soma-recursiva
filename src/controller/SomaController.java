package controller;

public class SomaController {
	public SomaController() {
		super();
	}
	
	public int soma(int numero) {
		// se o numero for 1, retorna 1.
		if(numero == 1) return 1;
		//sen�o retorna o numero + soma do numero - 1; � quase parecido com a idea do fatorial, onde � necess�rio subtrair 1 para continuar a soma
		// at� a condi��o de parada.
		else return numero + soma(numero - 1);
	}
}
