package excepcion;

import calculo.Calculadora;
import presentacion.Operaciones;

public class CalculadoraExcepcion extends RuntimeException {
	private static final long serialVersionUID = -1173551665462552223L;

	public CalculadoraExcepcion(String mensaje) {
		super(mensaje);
	}
}
