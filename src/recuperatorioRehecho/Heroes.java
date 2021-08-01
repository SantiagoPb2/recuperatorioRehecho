package recuperatorioRehecho;

public class Heroes extends Personajes implements Comparable<Heroes>{
	
	public String tipoPersonaje;

	public Heroes(String nombre, Integer poder, String tipoPersonaje) {
		super(nombre, poder);
		this.tipoPersonaje = tipoPersonaje;
	}
	
	public String getTipoPersonaje() {
		return tipoPersonaje;
	}

	@Override
	public int compareTo(Heroes o) {
		return obtenerPoder().compareTo(o.obtenerPoder());
	}

}
