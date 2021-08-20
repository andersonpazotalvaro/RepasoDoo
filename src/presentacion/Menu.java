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
		imprimirSalidaNormal("8-DividirEntero");
		imprimirSalidaNormal("9-numeroMayor");
		imprimirSalidaNormal("10-numeroMenor");
		imprimirSalidaNormal("11-esDiferente");
		imprimirSalidaNormal("12-esIgual");
		imprimirSalidaNormal("13-mayorIgual");
		imprimirSalidaNormal("14-menorIgual");
		imprimirSalidaNormal("15-potenciaDeNumero");
		imprimirSalidaNormal("16-raizDeNumero");
		imprimirSalidaNormal("17-sumaDeFracciones");
		imprimirSalidaNormal("18-restaDeFracciones");
		imprimirSalidaNormal("19-multiplicacionDeFracciones");
		imprimirSalidaNormal("20-divisionDeFracciones");
		imprimirSalidaNormal("21-Salir");
	}

}
