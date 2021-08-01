package recuperatorioRehecho;

public class Villanos extends Personajes implements Comparable<Villanos>{
	
	public String tipoPersonaje;

	public Villanos(String nombre, Integer poder,String tipoPersonaje) {
		super(nombre, poder);
		this.tipoPersonaje = tipoPersonaje;
	}

	public String getTipoPersonaje() {
		return tipoPersonaje;
	}

	@Override
	public int compareTo(Villanos o) {
		return o.obtenerPoder().compareTo(obtenerPoder());
	}

}
