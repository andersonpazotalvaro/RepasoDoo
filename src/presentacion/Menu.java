package presentacion;

import static utilitarios.Impresor.imprimirSalidaNormal;

public class Menu {

	private Menu() {
	}

	public static void mostrarMenuInicial() {
		imprimirSalidaNormal("�Qu� desea hacer?");
		imprimirSalidaNormal("1-Sumar");
		imprimirSalidaNormal("2-Restar");
		imprimirSalidaNormal("3-Dividir");
		imprimirSalidaNormal("4-Multiplicar");
		imprimirSalidaNormal("5-MaximoComunDivisor");
		imprimirSalidaNormal("6-MinimoComunMultiplo");
		imprimirSalidaNormal("7-Es Primo");
		imprimirSalidaNormal("8-Salir");
	}

}
