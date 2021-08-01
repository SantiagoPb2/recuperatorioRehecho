package tipoDeGema;

import recuperatorioRehecho.Gema;
import recuperatorioRehecho.Hechizable;

public class Espacio extends Gema implements Hechizable{

	public Espacio(String nombre) {
		super(nombre);
	}
	
	public Integer aumentarPoder() {
		return 2;
		
	}
	
}
