package tipoDeGema;

import recuperatorioRehecho.Gema;
import recuperatorioRehecho.Hechizable;

public class Tiempo extends Gema implements Hechizable{

	public Tiempo(String nombre) {
		super(nombre);
	}
	
	public Integer aumentarPoder() {
		return 3;
		
	}
	
}

