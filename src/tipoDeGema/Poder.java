package tipoDeGema;

import recuperatorioRehecho.Gema;
import recuperatorioRehecho.Hechizable;

public class Poder extends Gema implements Hechizable{

	public Poder(String nombre) {
		super(nombre);
	}
	
	public Integer aumentarPoder() {
		return 3;
		
	}
	
}

