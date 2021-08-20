package view;

import controller.SomaController;

public class Principal {
	public static void main(String args[]) {
		SomaController sc = new SomaController();
		int numero = 10;
		int resultado = sc.soma(numero);
		System.out.println("A soma dos numeros é: " + resultado);
	}
}
