package tipoDeGema;

import recuperatorioRehecho.Gema;
import recuperatorioRehecho.Hechizable;

public class Mente extends Gema implements Hechizable{

	public Mente(String nombre) {
		super(nombre);
	}
	
	public Integer aumentarPoder() {
		return 3;
		
	}
	
}
