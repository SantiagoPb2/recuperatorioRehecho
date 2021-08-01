package tipoDeGema;

import recuperatorioRehecho.Gema;
import recuperatorioRehecho.Hechizable;

public class Alma extends Gema implements Hechizable{

	public Alma(String nombre) {
		super(nombre);
	}
	
	public Integer aumentarPoder() {
		return 2;
		
	}
	
}

