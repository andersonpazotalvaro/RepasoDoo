package utilitarios;

import excepcion.CalculadoraExcepcion;

import java.util.Scanner;

public class Lector {

	private static Scanner lectorTeclado = new Scanner(System.in);

	private Lector() {
	}

	public static String leerTexto() {
		return lectorTeclado.next();
	}

	public static long leerNumeroEntero() {

		long dato = 0;
		boolean continuarLectura = true;

		do {
			try {
				dato = lectorTeclado.nextLong();
				continuarLectura = false;
			} catch (Exception excepcion) {
				lectorTeclado.nextLine();
				Impresor.imprimirSalidaError("N�mero entero no v�lido. Por favor ingrese un n�mero entero v�lido...");
			}
		} while (continuarLectura);

		return dato;
	}

	public static double leerNumeroDecimal() {

		double dato = 0;
		boolean continuarLectura = true;

		do {
			try {
				dato = lectorTeclado.nextDouble();
				continuarLectura = false;
			} catch (Exception excepcion) {
				lectorTeclado.nextLine();
				Impresor.imprimirSalidaError("N�mero decimal no v�lido. Por favor ingrese un n�mero decimal v�lido...");
			}
		} while (continuarLectura);

		return dato;
	}

	public static double leerNumerador() {

		double numerador = 0;
		boolean continuarLectura = true;

		do {
			try {
				numerador = lectorTeclado.nextInt();
				continuarLectura = false;
			} catch (Exception excepcion) {
				lectorTeclado.nextLine();
				Impresor.imprimirSalidaError("Numerador no valido...");
			}
		} while (continuarLectura);

		return numerador;
	}
	public static double leerDenominador() {

		double denominador = 0;
		boolean continuarLectura = true;
		do {
			try {
				denominador = lectorTeclado.nextInt();
				continuarLectura = false;
			} catch (Exception excepcion) {
				lectorTeclado.nextLine();
				Impresor.imprimirSalidaError("Denominador no valido...");
			}
		} while (continuarLectura);

		return denominador;
	}

}
