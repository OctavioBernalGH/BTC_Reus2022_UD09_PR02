package Class;

public class SerieClass implements Entregable_Inter{

	// Atributos de clase
	private String titulo;
	private int numeroTemporadas = 3;
	private boolean entregado = false;
	private String genero;
	private String creador;
	
	// Constructor con atributos por defecto.
	public SerieClass() {}
	
	// Constructor con atributos como parámetro y por defecto.
	public SerieClass(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}
	
	// Constructor completo.
	public SerieClass(String titulo, int numeroTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.genero = genero;
		this.creador = creador;
	}
	
	// Getters y setters.

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
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

	// Métodos heredados de la interfaz
	@Override
	public boolean entregar() {
		entregado = true; 
		return entregado;
	}
	
	@Override
	public boolean devolver() {
		entregado = false;
		return entregado;
	}

	@Override
	public boolean isEntregado() {
		return entregado;
	}

	// Método para comparar un atributo de objeto tipo SerieClass.
	public void compareTo(SerieClass a) {
		if(this.numeroTemporadas > a.getNumeroTemporadas()) {
			System.out.println(this.titulo + " tiene más temporadas que " + a.getTitulo());
		} else if (this.numeroTemporadas == a.getNumeroTemporadas()) {
			System.out.println(this.titulo + " tiene las mismas temporadas que " + a.getTitulo());
		} else {
			System.out.println(this.titulo + " tiene menos temporadas que " + a.getTitulo());
		}
	}

	@Override
	public String toString() {
		return "SerieClass [titulo=" + titulo + ", numeroTemporadas=" + numeroTemporadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + "]";
	}

}
