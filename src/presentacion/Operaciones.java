package presentacion;

import static utilitarios.Impresor.imprimirSalidaError;
import static utilitarios.Impresor.imprimirSalidaNormal;
import static utilitarios.Impresor.imprimirSalidaError;
import static utilitarios.Lector.*;

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
			numeroMayor();
			break;
		}
		case 10: {
			numeroMenor();
			break;
		}
		case 11: {
			esDiferente();
			break;
		}
		case 12: {
			esIgual();
			break;
		}
		case 13: {
			mayorIgual();
			break;
		}
		case 14: {
			menorIgual();
			break;
		}
		case 15: {
			potenciaDeNumero();
			break;
		}
		case 16: {
			raizDeNumero();
			break;
		}
		case 17: {
			sumaDeFracciones();
			break;
		}
		case 18: {
			restaDeFracciones();
			break;
		}
		case 19: {
			multiplicacionDeFracciones();
			break;
		}
		case 20: {
			divisionDeFracciones();
			break;
		} case 21: {
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

	private static void numeroMayor() {
		imprimirSalidaNormal("==========INICIO OPERACI�N numeroMayor=========");
		imprimirSalidaNormal("Por favor ingrese el n�mero uno: ");
		double numeroUno = leerNumeroDecimal();

		imprimirSalidaNormal("Por favor ingrese el n�mero dos: ");
		double numeroDos = leerNumeroDecimal();
		try {
			boolean resultado = Calculadora.numeroMayor(numeroUno, numeroDos);
			if(resultado) {
				imprimirSalidaNormal(numeroUno + " es mayor a " + numeroDos);
			}
		} catch (CalculadoraExcepcion excepcion) {
			imprimirSalidaError(excepcion.getMessage());
		}
		imprimirSalidaNormal("==========FIN OPERACI�N numeroMayor=========");

	}
	private static void numeroMenor() {
		imprimirSalidaNormal("==========INICIO OPERACI�N numeroMenor=========");
		imprimirSalidaNormal("Por favor ingrese el n�mero uno: ");
		double numeroUno = leerNumeroDecimal();

		imprimirSalidaNormal("Por favor ingrese el n�mero dos: ");
		double numeroDos = leerNumeroDecimal();
		try {
			boolean resultado = Calculadora.numeroMenor(numeroUno, numeroDos);
			if(resultado) {
				imprimirSalidaNormal(numeroUno + " es menor a " + numeroDos);
			}
		} catch (CalculadoraExcepcion excepcion) {
			imprimirSalidaError(excepcion.getMessage());
		}
		imprimirSalidaNormal("==========FIN OPERACI�N numeroMenor=========");
	}

	private static void esDiferente() {
		imprimirSalidaNormal("==========INICIO OPERACI�N esDiferente=========");
		imprimirSalidaNormal("Por favor ingrese el n�mero uno: ");
		double numeroUno = leerNumeroDecimal();

		imprimirSalidaNormal("Por favor ingrese el n�mero dos: ");
		double numeroDos = leerNumeroDecimal();
		try {
			boolean resultado = Calculadora.esDiferente(numeroUno, numeroDos);
			if(resultado) {
				imprimirSalidaNormal(numeroUno + " es diferente a " + numeroDos);
			}
		} catch (CalculadoraExcepcion excepcion) {
			imprimirSalidaError(excepcion.getMessage());
		}
		imprimirSalidaNormal("==========FIN OPERACI�N esDiferente=========");
	}

	private static void esIgual() {
		imprimirSalidaNormal("==========INICIO OPERACI�N esIgual=========");
		imprimirSalidaNormal("Por favor ingrese el n�mero uno: ");
		double numeroUno = leerNumeroDecimal();

		imprimirSalidaNormal("Por favor ingrese el n�mero dos: ");
		double numeroDos = leerNumeroDecimal();
		try {
			boolean resultado = Calculadora.esIgual(numeroUno, numeroDos);
			if(resultado) {
				imprimirSalidaNormal(numeroUno + " es igual a " + numeroDos);
			}
		} catch (CalculadoraExcepcion excepcion) {
			imprimirSalidaError(excepcion.getMessage());
		}
		imprimirSalidaNormal("==========FIN OPERACI�N esIgual=========");
	}

	private static void mayorIgual() {
		imprimirSalidaNormal("==========INICIO OPERACI�N mayorIgual=========");
		imprimirSalidaNormal("Por favor ingrese el n�mero uno: ");
		double numeroUno = leerNumeroDecimal();

		imprimirSalidaNormal("Por favor ingrese el n�mero dos: ");
		double numeroDos = leerNumeroDecimal();
		try {
			boolean resultado = Calculadora.mayorIgual(numeroUno, numeroDos);
			if(resultado) {
				imprimirSalidaNormal(numeroUno + " es Mayor ó igual a " + numeroDos);
			}
		} catch (CalculadoraExcepcion excepcion) {
			imprimirSalidaError(excepcion.getMessage());
		}
		imprimirSalidaNormal("==========FIN OPERACI�N MayorIgual=========");
	}

	private static void menorIgual() {
		imprimirSalidaNormal("==========INICIO OPERACI�N menorIgual=========");
		imprimirSalidaNormal("Por favor ingrese el n�mero uno: ");
		double numeroUno = leerNumeroDecimal();

		imprimirSalidaNormal("Por favor ingrese el n�mero dos: ");
		double numeroDos = leerNumeroDecimal();
		try {
			boolean resultado = Calculadora.menorIgual(numeroUno, numeroDos);
			if(resultado) {
				imprimirSalidaNormal(numeroUno + " es menor ó igual a " + numeroDos);
			}
		} catch (CalculadoraExcepcion excepcion) {
			imprimirSalidaError(excepcion.getMessage());
		}
		imprimirSalidaNormal("==========FIN OPERACI�N menorIgual=========");
	}

	private static void potenciaDeNumero() {
		imprimirSalidaNormal("==========INICIO OPERACI�N potenciaDeNumero=========");
		imprimirSalidaNormal("Por favor ingrese el n�mero : ");
		double numeroUno = leerNumeroDecimal();

		imprimirSalidaNormal("Por favor ingrese el exponente entero: ");
		double numeroDos = leerNumeroDecimal();
		try {
			double r = Math.pow(numeroUno,numeroDos);
			//double resultado = Calculadora.potenciaDeNumero(numeroUno, numeroDos);
				imprimirSalidaNormal(numeroUno + " elevado a la " + numeroDos+" es igual a : "+r);
		} catch (CalculadoraExcepcion excepcion) {
			imprimirSalidaError(excepcion.getMessage());
		}
		imprimirSalidaNormal("==========FIN OPERACI�N potenciaDeNumero=========");
	}
	private static void raizDeNumero() {
		imprimirSalidaNormal("==========INICIO OPERACI�N raizDeNumero=========");
		imprimirSalidaNormal("Por favor ingrese el n�mero : ");
		double numeroUno = leerNumeroDecimal();
		double raiz =0;
		imprimirSalidaNormal("Por favor ingrese el exponente entero: ");
		double numeroDos = leerNumeroEntero();
		raiz=1/numeroDos;
		try {
			double r = Math.pow(numeroUno,raiz);
			imprimirSalidaNormal(" la raiz " + numeroDos+" de el numero "+numeroUno+" es igual a : "+r);
		} catch (CalculadoraExcepcion excepcion) {
			imprimirSalidaError(excepcion.getMessage());
		}
		imprimirSalidaNormal("==========FIN OPERACI�N raizDeNumero=========");
	}

	private static void sumaDeFracciones() {
		imprimirSalidaNormal("==========INICIO OPERACI�N sumaDeFracciones=========");
		imprimirSalidaNormal("Por favor ingrese el numerador uno : ");
		long numeradorUno = (long) leerNumerador();
		imprimirSalidaNormal("Por favor ingrese el denominador uno: ");
		long denominadorUno = (long) leerDenominador();
		imprimirSalidaNormal("Por favor ingrese el numerador dos : ");
		long numeradorDos = (long) leerNumerador();
		imprimirSalidaNormal("Por favor ingrese el denominador dos: ");
		long denominadorDos = (long) leerDenominador();
		try {
			long sumaNumerador = Calculadora.sumaFraccionNumerador(numeradorUno,denominadorUno,numeradorDos,denominadorDos);
			long sumaDenominador= Calculadora.sumaFraccionDenominador(denominadorUno,denominadorDos);
			String reduccion = Calculadora.reduccionFraccion(sumaNumerador,sumaDenominador);
			imprimirSalidaNormal(" la suma es: " + sumaNumerador+" / "+sumaDenominador+" y su reduccion es : "+ reduccion);
		} catch (CalculadoraExcepcion excepcion) {
			imprimirSalidaError(excepcion.getMessage());
		}
		imprimirSalidaNormal("==========FIN OPERACI�N sumaDeFracciones=========");
	}
	private static void restaDeFracciones() {
		imprimirSalidaNormal("==========INICIO OPERACI�N restaDeFracciones=========");
		imprimirSalidaNormal("Por favor ingrese el numerador uno : ");
		long numeradorUno = (long) leerNumerador();
		imprimirSalidaNormal("Por favor ingrese el denominador uno: ");
		long denominadorUno = (long) leerDenominador();
		imprimirSalidaNormal("Por favor ingrese el numerador dos : ");
		long numeradorDos = (long) leerNumerador();
		imprimirSalidaNormal("Por favor ingrese el denominador dos: ");
		long denominadorDos = (long) leerDenominador();
		try {
			long restaNumerador = Calculadora.restaFraccionNumerador(numeradorUno,denominadorUno,numeradorDos,denominadorDos);
			long sumaDenominador= Calculadora.sumaFraccionDenominador(denominadorUno,denominadorDos);
			String reduccion = Calculadora.reduccionFraccion(restaNumerador,sumaDenominador);
			imprimirSalidaNormal(" la resta es: " + restaNumerador+" / "+sumaDenominador+" y su reduccion es : "+ reduccion);
		} catch (CalculadoraExcepcion excepcion) {
			imprimirSalidaError(excepcion.getMessage());
		}
		imprimirSalidaNormal("==========FIN OPERACI�N restaDeFracciones=========");
	}
	private static void multiplicacionDeFracciones() {
		imprimirSalidaNormal("==========INICIO OPERACI�N multiplicacionDeFracciones=========");
		imprimirSalidaNormal("Por favor ingrese el numerador uno : ");
		long numeradorUno = (long) leerNumerador();
		imprimirSalidaNormal("Por favor ingrese el denominador uno: ");
		long denominadorUno = (long) leerDenominador();
		imprimirSalidaNormal("Por favor ingrese el numerador dos : ");
		long numeradorDos = (long) leerNumerador();
		imprimirSalidaNormal("Por favor ingrese el denominador dos: ");
		long denominadorDos = (long) leerDenominador();
		try {
			long mulNumerador = Calculadora.multiplicacionFraccionNumerador(numeradorUno,numeradorDos);
			long sumaDenominador= Calculadora.sumaFraccionDenominador(denominadorUno,denominadorDos);
			String reduccion = Calculadora.reduccionFraccion(mulNumerador,sumaDenominador);
			imprimirSalidaNormal(" la multiplicacion es: " + mulNumerador+" / "+sumaDenominador+" y su reduccion es : "+ reduccion);
		} catch (CalculadoraExcepcion excepcion) {
			imprimirSalidaError(excepcion.getMessage());
		}
		imprimirSalidaNormal("==========FIN OPERACI�N multiplicacionDeFracciones=========");
	}

	private static void divisionDeFracciones() {
		imprimirSalidaNormal("==========INICIO OPERACI�N divisionDeFracciones=========");
		imprimirSalidaNormal("Por favor ingrese el numerador uno : ");
		long numeradorUno = (long) leerNumerador();
		imprimirSalidaNormal("Por favor ingrese el denominador uno: ");
		long denominadorUno = (long) leerDenominador();
		imprimirSalidaNormal("Por favor ingrese el numerador dos : ");
		long numeradorDos = (long) leerNumerador();
		imprimirSalidaNormal("Por favor ingrese el denominador dos: ");
		long denominadorDos = (long) leerDenominador();
		try {
			long divNumerador = Calculadora.divisionFraccionNumerador(numeradorUno,denominadorDos);
			long divDenominador= Calculadora.diviisonFraccionDenominador(denominadorUno,numeradorDos);
			String reduccion = Calculadora.reduccionFraccion(divNumerador,divDenominador);
			imprimirSalidaNormal(" la multiplicacion es: " + divNumerador+" / "+divDenominador+" y su reduccion es : "+ reduccion);
		} catch (CalculadoraExcepcion excepcion) {
			imprimirSalidaError(excepcion.getMessage());
		}
		imprimirSalidaNormal("==========FIN OPERACI�N divisionDeFracciones=========");
	}

	private static void salir() {
		imprimirSalidaNormal("gracias");
		System.exit(0);
	}

}
