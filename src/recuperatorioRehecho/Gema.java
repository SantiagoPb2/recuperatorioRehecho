package recuperatorioRehecho;

public abstract class Gema {
	
	private String nombre;
	
	public Gema(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Integer aumentarPoder() {
		return 0;
	}
	
	
}
