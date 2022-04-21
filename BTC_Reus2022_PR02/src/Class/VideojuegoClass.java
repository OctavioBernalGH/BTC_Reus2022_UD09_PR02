package Class;

public class VideojuegoClass implements Entregable_Inter {

	// Atributos de clase
		private String titulo;
		private int horasEstimadas = 10;
		private boolean entregado = false;
		private String genero;
		private String creador;
	
	//Contructor por defecto
		public VideojuegoClass() {
		
		}	
	//Constructor con titulo y horas estimadas
		
		public VideojuegoClass(String titulo, int horasEstimadas) {
			super();
			this.titulo = titulo;
			this.horasEstimadas = horasEstimadas;
		}
	
	//Constructor con todos los atributos menos entregado
		
		public VideojuegoClass(String titulo, int horasEstimadas, String genero, String creador) {
			super();
			this.titulo = titulo;
			this.horasEstimadas = horasEstimadas;
			this.genero = genero;
			this.creador = creador;
		}
	
//Metodos de la interface
	
	@Override
	public boolean entregar() {
		return this.entregado = true;
	}
	@Override
	public boolean devolver() {
		return this.entregado = false;
	}

	@Override
	public boolean isEntregado() {
		return this.entregado;
	}
	// Metodo para comparar un atributo de objeto tipo Videojuego y devolvemos el que mas tiene
		public boolean compareTo(VideojuegoClass a) {
			boolean flag = false;
			//Si tiene mas horas pasamos un true
			if(this.horasEstimadas > a.horasEstimadas) {
				flag = true;
			}
			return flag;
		}

		
	
	//Todos los Getters and setters menos entregado

		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public int getHorasEstimadas() {
			return horasEstimadas;
		}
		public void setHorasEstimadas(int horasEstimadas) {
			this.horasEstimadas = horasEstimadas;
		}
		public String getGenero() {
			return genero;
		}
		public void setGenero(String genero) {
			this.genero = genero;
		}
		public String getCreador() {
			return creador;
		}
		public void setCreador(String creador) {
			this.creador = creador;
		}	
	//Sobreescribir el método toString();

		@Override
		public String toString() {
			return "VideojuegoClass [titulo=" + titulo + ", HorasEstimadas=" + horasEstimadas + ", entregado=" + entregado
					+ ", genero=" + genero + ", creador=" + creador + "]";
		}
		

}
