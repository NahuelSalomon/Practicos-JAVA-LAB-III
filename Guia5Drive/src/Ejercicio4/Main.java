package Ejercicio4;


public class Main {

	public static void main(String[] args) {
	
		/**********************************
		  HECHO CON ARREGLOS
		 **********************************/
		
		Videojuego videojuegos [] = new Videojuego[5];
		Serie series [] = new Serie[5];
		
		videojuegos[0] = new Videojuego("Call of Duty 3", "Infinity Ward", "Disparos", 15);
		videojuegos[1] = new Videojuego("Minecraft", "Mojang AB", "Construccion", 100);
		videojuegos[2] = new Videojuego("GTA", "Rockstar Games", "Accion", 140);
		videojuegos[3] = new Videojuego("FIFA", "Electronic Arts", "Futbol", 250);
		videojuegos[4] = new Videojuego("NBA 2k18", "Visual Concepts","Basket" , 280);
		
		series[0] = new Serie("Ozark",  "Jason Bateman", 3, "Lavado de dinero");
		series[1] = new Serie("La casa de papel", "Álex Pina", 4, "Accion");
		series[2] = new Serie("Gran hotel", "CodyCross Ramón", 3, "Pieza de época");
		series[3] = new Serie("Elite", "Carlos Montero y Darío Madrona", 4, "Drama");
		series[4] = new Serie("You", "Greg Berlanti y Sera Gamble", 3, "Thriller psicologico");
	
	    videojuegos[2].entregar();
	    videojuegos[4].entregar();
	
	    
	    series[1].entregar();
	    series[2].entregar();
	    series[3].entregar();
	    
	    System.out.println("Videojuegos entregados: "+contarVideojuegosEntregadosYDevolver(videojuegos));
	    System.out.println("Series entregadas: "+contarSeriesEntregadasYDevolver(series));
	    
	    System.out.println("Videojuegos con mas horas: "+buscarVideojuegoConMasHoras(videojuegos));
	    System.out.println("Serie con mas horas: "+ buscarSerieConMasTemporadas(series));
	
	}

	public static int contarVideojuegosEntregadosYDevolver(Videojuego  videojuegos[]) {
		int entregados = 0;
		for(Videojuego e : videojuegos) {
			if(e.isEntregado()) {
				entregados++;
				e.devolver();
			}
		}
	return entregados;
	}
	
	public static int contarSeriesEntregadasYDevolver(Serie series[]) {
		int entregados = 0;
		for(Serie e : series) {
			if(e.isEntregado()) {
				entregados++;
				e.devolver();
			}
		}
	return entregados;
	}

	public static String buscarVideojuegoConMasHoras(Videojuego videojuegos[]) {
		Videojuego videojuego = videojuegos[0];
		
		for(int i = 1 ; i < videojuegos.length ; i++) {
			if(videojuegos[i].getHorasEstimadas() > videojuego.getHorasEstimadas()) {
				videojuego = videojuegos[i];
			}
		}
		
		return videojuego.toString();
	}
	
	public static String buscarSerieConMasTemporadas(Serie series[]) {
		Serie serie = series[0];
		
		for(int i = 1; i < series.length; i++) {
			if(series[i].getNumTemporadas() > serie.getNumTemporadas()) {
				serie = series[i];
			}
		}
		return serie.toString();
	}
}
