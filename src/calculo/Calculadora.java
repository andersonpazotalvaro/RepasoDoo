package calculo;

import excepcion.CalculadoraExcepcion;

public class Calculadora {

	public static double sumar(double numeroUno, double numeroDos) {
		return numeroUno + numeroDos;
	}

	public static double restar(double numeroUno, double numeroDos) {
		return numeroUno - numeroDos;
	}

	public static double dividir(Number numeroUno, Number numeroDos) {

		if (numeroDos.doubleValue() == 0) {
			throw new CalculadoraExcepcion("No es posible dividir por cero...");

		}

		Number resultado = 0;

		if (numeroEsEntero(numeroUno) && numeroEsEntero(numeroDos)) {
			resultado = numeroUno.longValue() / numeroDos.longValue();
		} else {
			resultado = numeroUno.doubleValue() / numeroDos.doubleValue();
		}

		return resultado.doubleValue();
	}

	public static double multiplicar(double numeroUno, double numeroDos) {
		return numeroUno * numeroDos;
	}

	public static boolean esNumeroPrimo(int numero) {
		return hallarCantidadDivisoresExactos(numero) == 2;
	}

	private static long hallarCantidadDivisoresExactos(long numero) {

		long cantidadDivisores = 0;

		for (long indice = 1; indice <= numero; indice++) {
			if (esDivisionExacta(numero, indice)) {
				cantidadDivisores = cantidadDivisores + 1;
			}
		}

		return cantidadDivisores;
	}

	public static long hallarMinimoComunMultiplo(long numeroUno, long numeroDos) {

		long mcm = 1;
		long contador = 2;

		while (contador <= numeroUno || contador <= numeroDos) {

			if (esDivisionExacta(numeroUno, contador) || esDivisionExacta(numeroDos, contador)) {
				mcm = mcm * contador;

				if (esDivisionExacta(numeroUno, contador)) {
					numeroUno = numeroUno / contador;
				}

				if (esDivisionExacta(numeroDos, contador)) {
					numeroDos = numeroDos / contador;
				}
			} else {
				contador = contador + 1;
			}
		}

		return mcm;
	}

	public static boolean esDivisionExacta(long numeroUno, long numeroDos) {
		return hallarModuloDivision(numeroUno, numeroDos) == 0;
	}

	public static long hallarMaximoComunDivisor(long numeroUno, long numeroDos) {
		return 0;
	}

	public static long hallarModuloDivision(long numeroUno, long numeroDos) {
		if (numeroDos == 0) {
			throw new CalculadoraExcepcion("No es posible hallar el m�dulo de una divisi�n por cero...");
		}

		return numeroUno % numeroDos;
	}

	public static boolean numeroEsEntero(Number numero) {
		return (numero instanceof Byte || numero instanceof Short || numero instanceof Integer
				|| numero instanceof Long);
	}

	public static boolean numeroMayor(double numero, double numero2) {
		boolean mayor=false;
		if(numero>numero2){
			mayor=true;
		}
		return mayor;
	}
	public static boolean numeroMenor(double numero, double numero2) {
		boolean menor=false;
		if(numero<numero2){
			menor=true;
		}
		return menor;
	}
	public static boolean esDiferente (double numero, double numero2) {
		boolean diferente=false;
		if(numero!=numero2){
			diferente=true;
		}
		return diferente;
	}
	public static boolean esIgual (double numero, double numero2) {
		boolean igual=false;
		if(numero==numero2){
			igual=true;
		}
		return igual;
	}
	public static boolean mayorIgual (double numero, double numero2) {
		boolean mayor=false;
		if(numero>=numero2){
			mayor=true;
		}
		return mayor;
	}
	public static boolean menorIgual(double numero, double numero2) {
		boolean menor=false;
		if(numero<=numero2){
			menor=true;
		}
		return menor;
	}

	public static double fraccionADecimal(double numero, double numero2) {

		return numero/numero2;
	}

	public static String reduccionFraccion(long numeroUno, long numeroDos) {

		String retorno="";
		boolean sw= false;

		for (int i=2;i<numeroUno || i<numeroDos;i++) {
			if(sw){
				i=2;
				sw=false;
			}
			if (esDivisionExacta(numeroUno, i) && esDivisionExacta(numeroDos, i)) {
				//mcm = mcm * contador;
				sw= true;
				numeroUno=numeroUno/i;
				numeroDos=numeroDos/i;
			}
		}
		if(numeroDos==1){
			retorno=""+numeroUno;
		}else{
			if (numeroUno==numeroDos){
			retorno="1";
			}else{
			retorno =numeroUno + " / " + numeroDos;
			}
		}
		return retorno;
	}

	public static long sumaFraccionNumerador(long numerador1,  long denominador1,long numerador2, long denominador2) {
		if (denominador1 == 0 || denominador2==0) {
			throw new CalculadoraExcepcion("No es posible dividir por cero...");
		}
		long numerador = (numerador1*denominador2)+(numerador2*denominador1);
		return numerador;
	}
	public static long restaFraccionNumerador(long numerador1,  long denominador1,long numerador2, long denominador2) {
		if (denominador1 == 0 || denominador2==0) {
			throw new CalculadoraExcepcion("El denominador no puede ser cero...");
		}
		long numerador = (numerador1*denominador2)-(numerador2*denominador1);
		return numerador;
	}
	public static long multiplicacionFraccionNumerador(long numerador1,long numerador2) {
		long numerador = numerador1*numerador2;
		return numerador;
	}
	public static long sumaFraccionDenominador(long denominador1, long denominador2) {
		if (denominador1 == 0 || denominador2==0) {
			throw new CalculadoraExcepcion("El denominador no puede ser cero..");
		}
		long denominador= denominador1*denominador2;
		return denominador;
	}
	public static long divisionFraccionNumerador(long numerador1, long denominador2) {
		if (denominador2 == 0 ) {
			throw new CalculadoraExcepcion("El denominador no puede ser cero...");
		}
		long numerador= numerador1*denominador2;
		return numerador;
	}
	public static long diviisonFraccionDenominador(long denominador1, long numerador2) {
		if (denominador1 == 0) {
			throw new CalculadoraExcepcion("El denominador no puede ser cero...");
		}
		long denominador= denominador1*numerador2;
		return denominador;
	}

	public static double potenciaDeNumero(double numero, double exponente) {
		double resultado=1;
		if(exponente==0){
			resultado=1;
		}else {
			for (int i = 0; i < exponente; i++) {
				resultado = numero * resultado;
			}

		}
		return resultado;
	}

	public static boolean raizDeNumero(int numero, int exponente) {
		int resultado;
		for (int i=0;i<numero;i++){
			resultado=i *i;
			if (resultado==numero){

			}
		}
		return true;
	}

}
