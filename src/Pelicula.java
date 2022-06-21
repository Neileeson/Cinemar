
public class Pelicula {
	private String titulo;
	private String genero;
	private String creador;
	private String salto;

	public Pelicula(String titulo, int numT, String gen, String creat) {
		this.titulo = titulo;
		this.genero = gen;
		this.creador = creat;
	}
	void mostrar() {
		System.out.println(this.titulo);
		System.out.println("Género: "+ this.genero+ " / Creador: " + this.creador);	
	}
	void cambiar(String titulo, String salto, String gen, String creat) {
		this.titulo = titulo;
		this.genero = gen;
		this.creador = creat;
	}
}
