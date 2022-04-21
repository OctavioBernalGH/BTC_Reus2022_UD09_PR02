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
	
	// Constructor con atributos como par�metro y por defecto.
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

	// M�todos heredados de la interfaz
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
	// Metodo para comparar un atributo de objeto tipo SerieClass y devolvemos el que mas tiene
	public boolean compareTo(SerieClass a) {
		boolean flag = false;
		//Si tiene mas horas pasamos un true
		if(this.numeroTemporadas > a.numeroTemporadas) {
			flag = true;
		}
		return flag;
	}

	@Override
	public String toString() {
		return "SerieClass [titulo=" + titulo + ", numeroTemporadas=" + numeroTemporadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + "]";
	}

}
