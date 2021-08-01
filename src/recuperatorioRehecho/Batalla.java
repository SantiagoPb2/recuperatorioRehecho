package recuperatorioRehecho;

import java.util.Set;
import java.util.TreeSet;

public class Batalla {
	private Set<Villanos>villanosGanadores;
	private Set<Heroes>heroesGanadores;
	private Integer contadorGemasVillanos = 0;
	private Integer contadorGemasHeroes = 0;
	private String nombre;
	
	public Batalla(String nombre) {
		this.nombre = nombre;
		this.villanosGanadores = new TreeSet<Villanos>();
		this.heroesGanadores = new TreeSet<Heroes>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void agregarPersonajeABatalla(Personajes personaje) {
		if(personaje.getTipoPersonaje().equals("Villano")) {
			villanosGanadores.add((Villanos)personaje);
		}
		if(personaje.getTipoPersonaje().equals("Heroe")) {
			heroesGanadores.add((Heroes)personaje);
		}
	}
	
	public Integer obtenerCantidadHeroes() {
		return heroesGanadores.size();
	}
	
	public Integer obtenerCantidadVillanos() {
		return villanosGanadores.size();
	}
	
	public void enfrentamiento(Villanos villano, Heroes heroe) {
		if(villano.obtenerPoder() < heroe.obtenerPoder()) {
			villanosGanadores.remove(villano);
		}
		if(villano.obtenerPoder() > heroe.obtenerPoder()) {
			heroesGanadores.remove(heroe);
		}
	}
	
	public void usarGema(Gema gema,Personajes personaje) throws CantidadDeGemasExcedidaException {
		Villanos villano = buscarVillano(personaje);
		Heroes heroe = buscarHeroe(personaje);
		
		if(villano != null) {
			if(contadorGemasVillanos < 3) {
				villano.obtenerPoderDeGema(gema);
				contadorGemasVillanos++;
			}else {
				throw new CantidadDeGemasExcedidaException();
			}
		}
		if(heroe != null) {
			if(contadorGemasHeroes < 3) {
				heroe.obtenerPoderDeGema(gema);
				contadorGemasHeroes++;
			}else {
				throw new CantidadDeGemasExcedidaException();
			}
		}
	}
	
	public String resultadoFinal() throws WorldDestroyedException {
		String msj = "";
		if(obtenerCantidadHeroes() > obtenerCantidadVillanos()) {
			msj = "Los heroes han ganado";
		}
		if(obtenerCantidadHeroes() < obtenerCantidadVillanos()){
			msj = "Los villanos han ganado";
			throw new WorldDestroyedException();
		}
		return msj;
	}

	private Heroes buscarHeroe(Personajes personaje) {
		for(Heroes e: heroesGanadores) {
			if(e.getNombre().equals(personaje.getNombre())) {
				return e;
			}
		}
		return null;
	}

	private Villanos buscarVillano(Personajes personaje) {
		for(Villanos e: villanosGanadores) {
			if(e.getNombre().equals(personaje.getNombre())) {
				return e;
			}
		}
		return null;
	}

}
