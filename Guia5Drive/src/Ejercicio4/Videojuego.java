package Ejercicio4;

public class Videojuego implements Prestar{
	
	
		private double horasEstimadas;
		private boolean entregado;
		private String genero;
		private String compañia;
		private String titulo;
		
		private final double HORAS_ESTIMADAS_DEF = 10;
		private final boolean ENTREGADO = false;
	
		public Videojuego() {
			this.titulo = "";
			this.compañia = "";
			this.genero = "";
			this.entregado = ENTREGADO;
			this.horasEstimadas = HORAS_ESTIMADAS_DEF;
		}

		public Videojuego(String titulo, int horasEstimadas) {
			this.titulo = titulo;
			this.compañia = "";
			this.genero = "";
			this.entregado = ENTREGADO;
			this.horasEstimadas = horasEstimadas;
		}
		
		public Videojuego(String titulo, String compañia, String genero, double horasEstimadas) {
			this.titulo = titulo;
			this.compañia = compañia;
			this.genero =  genero;
			this.entregado = ENTREGADO;
			this.horasEstimadas = horasEstimadas;
		}
		

		public String getTitulo() {
			return titulo;
		}

		public String getGenero() {
			return genero;
		}

		public String getCompañia() {
			return compañia;
		}

		public double getHorasEstimadas() {
			return this.horasEstimadas;
		}
		
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public void setEntregado(boolean entregado) {
			this.entregado = entregado;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		public void setCompañia(String compañia) {
			this.compañia = compañia;
		}

		@Override
		public String toString() {
			return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
					+ ", genero=" + genero + ", compañia=" + compañia + "]";
		}
		
		@Override
		public boolean isEntregado() {
			return this.entregado;
		}
		
		@Override
		public void entregar() {
			this.entregado = true;
		}

		@Override
		public void devolver() {
			this.entregado = false;
		}
		
}
