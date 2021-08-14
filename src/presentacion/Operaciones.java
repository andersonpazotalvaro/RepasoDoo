package presentacion;

import static utilitarios.Impresor.imprimirSalidaError;
import static utilitarios.Impresor.imprimirSalidaNormal;
import static utilitarios.Lector.leerNumeroDecimal;
import static utilitarios.Lector.leerNumeroEntero;
import static utilitarios.Impresor.imprimirSalidaError;

import calculo.Calculadora;
import excepcion.CalculadoraExcepcion;
import excepcion.OperacionesExcepcion;

public class Operaciones {

	public static void operar(long opcion) {

		switch ((int) opcion) {
		case 1: {
			sumar();
			break;
		}
		case 2: {
			restar();
			break;
		}
		case 3: {
			dividir();
			break;
		}
		case 4: {
			multiplicar();
			break;
		}
		case 5: {
			hallarMaximoComunDivisor();
			break;
		}
		case 6: {
			hallarMinimoComunMultiplo();
			break;
		}
		case 7: {
			esNumeroPrimo();
			break;
		}
			case 8: {
				DividirEntero();
				break;
			}
		case 9: {
			salir();
			break;
		}
		default:
			throw new OperacionesExcepcion("Opci�n " + opcion + " no v�lida... ");
		}

	}

	private static void sumar() {
		imprimirSalidaNormal("==========INICIO OPERACI�N SUMAR=========");
		imprimirSalidaNormal("Por favor ingrese el n�mero uno: ");
		double numeroUno = leerNumeroDecimal();

		imprimirSalidaNormal("Por favor ingrese el n�mero dos: ");
		double numeroDos = leerNumeroDecimal();

		double resultado = Calculadora.sumar(numeroUno, numeroDos);

		imprimirSalidaNormal(numeroUno + "+" + numeroDos + "=" + resultado);
		imprimirSalidaNormal("==========FIN OPERACI�N SUMAR=========");
	}

	private static void restar() {
		imprimirSalidaNormal("==========INICIO OPERACI�N RESTAR=========");
		imprimirSalidaNormal("Por favor ingrese el n�mero uno: ");
		double numeroUno = leerNumeroDecimal();

		imprimirSalidaNormal("Por favor ingrese el n�mero dos: ");
		double numeroDos = leerNumeroDecimal();

		double resultado = Calculadora.restar(numeroUno, numeroDos);

		imprimirSalidaNormal(numeroUno + "-" + numeroDos + "=" + resultado);
		imprimirSalidaNormal("==========FIN OPERACI�N RESTAR=========");
	}

	private static void dividir() {
		imprimirSalidaNormal("==========INICIO OPERACI�N DIVIDIR=========");
		imprimirSalidaNormal("Por favor ingrese el n�mero uno: ");
		double numeroUno = leerNumeroDecimal();

		imprimirSalidaNormal("Por favor ingrese el n�mero dos: ");
		double numeroDos = leerNumeroDecimal();
			try {
				double resultado = Calculadora.dividir(numeroUno, numeroDos);
				imprimirSalidaNormal(numeroUno + "/" + numeroDos + "=" + resultado);
			} catch (CalculadoraExcepcion excepcion) {
				imprimirSalidaError(excepcion.getMessage());
			}
		imprimirSalidaNormal("==========FIN OPERACI�N DIVIDIR=========");

	}

	private static void DividirEntero() {
		imprimirSalidaNormal("==========INICIO OPERACI�N DIVIDIR=========");
		imprimirSalidaNormal("Por favor ingrese el n�mero uno: ");
		long numeroUno = leerNumeroEntero();

		imprimirSalidaNormal("Por favor ingrese el n�mero dos: ");
		long numeroDos = leerNumeroEntero();
		try {
			long resultado = (long) Calculadora.dividir(numeroUno, numeroDos);
			imprimirSalidaNormal(numeroUno + "/" + numeroDos + "=" + resultado);
		} catch (CalculadoraExcepcion excepcion) {
			imprimirSalidaError(excepcion.getMessage());
		}
		imprimirSalidaNormal("==========FIN OPERACI�N DIVIDIR=========");

	}

	private static void multiplicar() {
		imprimirSalidaNormal("==========INICIO OPERACI�N MULTIPLICAR=========");
		imprimirSalidaNormal("Por favor ingrese el n�mero uno: ");
		double numeroUno = leerNumeroDecimal();

		imprimirSalidaNormal("Por favor ingrese el n�mero dos: ");
		double numeroDos = leerNumeroDecimal();

		double resultado = Calculadora.multiplicar(numeroUno, numeroDos);

		imprimirSalidaNormal(numeroUno + "*" + numeroDos + "=" + resultado);
		imprimirSalidaNormal("==========FIN OPERACI�N MULTIPLICAR=========");
	}
	private static void hallarMaximoComunDivisor() {
		imprimirSalidaNormal("==========INICIO OPERACI�N MAXIMOCOMUNDIVISOR=========");
		imprimirSalidaNormal("Por favor ingrese el n�mero uno: ");
		long numeroUno = leerNumeroEntero();

		imprimirSalidaNormal("Por favor ingrese el n�mero dos: ");
		long numeroDos = leerNumeroEntero();

		double resultado = Calculadora.hallarMaximoComunDivisor(numeroUno, numeroDos);

		imprimirSalidaNormal("El maximo comun divisor es : " + resultado);
		imprimirSalidaNormal("==========FIN OPERACI�N MAXIMOCOMUNDIVISOR=========");
	}
	private static void hallarMinimoComunMultiplo() {
		imprimirSalidaNormal("==========INICIO OPERACI�N MINIMOCOMUNMULTIPLO=========");
		imprimirSalidaNormal("Por favor ingrese el n�mero uno: ");
		long numeroUno = leerNumeroEntero();

		imprimirSalidaNormal("Por favor ingrese el n�mero dos: ");
		long numeroDos = leerNumeroEntero();

		double resultado = Calculadora.hallarMinimoComunMultiplo(numeroUno, numeroDos);

		imprimirSalidaNormal("el minimo comun multiplo es : " + resultado);
		imprimirSalidaNormal("==========FIN OPERACI�N MINIMOCOMUNMULTIPLO=========");
	}
	private static void esNumeroPrimo() {
		imprimirSalidaNormal("==========INICIO OPERACI�N ES PRIMO=========");
		imprimirSalidaNormal("Por favor ingrese el n�mero ");
		long numeroUno = leerNumeroEntero();
		//boolean resultado = Calculadora.esNumeroPrimo(numeroUno);


		imprimirSalidaNormal(""+(Calculadora.esNumeroPrimo((int)numeroUno)?"si":"no"));
		imprimirSalidaNormal("==========FIN OPERACI�N ES PRIMO=========");
	}

	private static void salir() {
		imprimirSalidaNormal("gracias");
		System.exit(0);
	}
}
