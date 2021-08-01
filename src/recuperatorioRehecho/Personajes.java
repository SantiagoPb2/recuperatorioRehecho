package recuperatorioRehecho;

public abstract class Personajes {
	
	private String nombre;
	private Integer contadorGemas = 0;
	private Integer poder;
	
	public Personajes(String nombre,Integer poder) {
		this.nombre = nombre;
		this.poder = poder;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Integer obtenerPoder() {
		return poder;
	}
	
	public String getTipoPersonaje() {
		return "";
	}
	
	public void obtenerPoderDeGema(Gema gema) {
		if(contadorGemas < 1) {
			this.poder = poder * gema.aumentarPoder();
		}
	}
	
}
