package controller;

public class SomaController {
	public SomaController() {
		super();
	}
	
	public int soma(int numero) {
		// se o numero for 1, retorna 1.
		if(numero < 1) return 0;
		//senão retorna o numero + soma do numero - 1; é quase parecido com a idea do fatorial, onde é necessário subtrair 1 para continuar a soma
		// até a condição de parada.
		else return numero + soma(numero - 1);
	}
}
