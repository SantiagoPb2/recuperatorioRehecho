package recuperatorioRehecho;

public class CantidadDeGemasExcedidaException extends Exception {

	public CantidadDeGemasExcedidaException() {
		super("Se sobrepasa el limite de gemas");
	}
}
