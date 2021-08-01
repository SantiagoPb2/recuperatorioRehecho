package recuperatorioRehecho;

import static org.junit.Assert.*;

import org.junit.Test;

import tipoDeGema.Alma;
import tipoDeGema.Mente;
import tipoDeGema.Poder;
import tipoDeGema.Tiempo;

public class Prueba {

	@Test
	public void queSePuedaAdquirirUnaGema() throws CantidadDeGemasExcedidaException {
		Personajes ironman = new Heroes("Tony stark",3000,"Heroe");
		Gema gemaDelPoder = new Poder("Poder");
		Batalla batalla = new Batalla("Infinity war");
		batalla.agregarPersonajeABatalla(ironman);
		batalla.usarGema(gemaDelPoder, ironman);
		
		assertEquals(9000,ironman.obtenerPoder(),0.0);
	}
	
	@Test(expected = CantidadDeGemasExcedidaException.class)
	public void queNoSePuedaTenerMasDe3Gemas() throws CantidadDeGemasExcedidaException {
		Personajes loki = new Villanos("Loki",2100,"Villano");
		Personajes redskull = new Villanos("Red skull",2300,"Villano");
		Personajes hela = new Villanos("Hela",3300,"Villano");
		Personajes ronnan = new Villanos("El acusador Ronnan",3100,"Villano");
		
		Gema gemaDelPoder = new Poder("Poder");
		Gema gemaDelAlma = new Alma("Alma");
		Gema gemaDelMente = new Mente("Mente");
		Gema gemaDelTiempo = new Tiempo("Tiempo");
		
		Batalla batalla = new Batalla("Infinity war");
		batalla.agregarPersonajeABatalla(loki);
		batalla.agregarPersonajeABatalla(redskull);
		batalla.agregarPersonajeABatalla(hela);
		batalla.agregarPersonajeABatalla(ronnan);
		batalla.usarGema(gemaDelPoder, loki);
		batalla.usarGema(gemaDelAlma, redskull);
		batalla.usarGema(gemaDelMente, hela);
		batalla.usarGema(gemaDelTiempo, ronnan);

	}
	
	@Test
	public void queGanenLosHeroes() throws WorldDestroyedException {
		Personajes ironman = new Heroes("Tony stark",3000,"Heroe");
		Personajes capitanamerica = new Heroes("Steve Rogers",2500,"Heroe");
		Personajes loki = new Villanos("Loki",2100,"Villano");
		Personajes redskull = new Villanos("Red skull",2300,"Villano");
		
		Batalla batalla = new Batalla("Infinity war");
		batalla.agregarPersonajeABatalla(ironman);
		batalla.agregarPersonajeABatalla(capitanamerica);
		batalla.agregarPersonajeABatalla(loki);
		batalla.agregarPersonajeABatalla(redskull);
		batalla.enfrentamiento((Villanos)loki, (Heroes)ironman);
		batalla.enfrentamiento((Villanos)redskull, (Heroes)capitanamerica);
		assertEquals("Los heroes han ganado",batalla.resultadoFinal());
	}
	
	@Test(expected = WorldDestroyedException.class)
	public void queGanenLosVillanos() throws WorldDestroyedException{
		Personajes ironman = new Heroes("Tony stark",3000,"Heroe");
		Personajes capitanamerica = new Heroes("Steve Rogers",2500,"Heroe");
		Personajes loki = new Villanos("Loki",5000,"Villano");
		Personajes redskull = new Villanos("Red skull",4000,"Villano");
		
		Batalla batalla = new Batalla("Infinity war");
		batalla.agregarPersonajeABatalla(ironman);
		batalla.agregarPersonajeABatalla(capitanamerica);
		batalla.agregarPersonajeABatalla(loki);
		batalla.agregarPersonajeABatalla(redskull);
		batalla.enfrentamiento((Villanos)loki, (Heroes)ironman);
		batalla.enfrentamiento((Villanos)redskull, (Heroes)capitanamerica);
		assertEquals("Los villanos han ganado",batalla.resultadoFinal());
			
	}

}
