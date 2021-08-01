package tipoDeGema;

import recuperatorioRehecho.Gema;
import recuperatorioRehecho.Hechizable;

public class Realidad extends Gema implements Hechizable{

	public Realidad(String nombre) {
		super(nombre);
	}
	
	public Integer aumentarPoder() {
		return 2;
		
	}
	
}

