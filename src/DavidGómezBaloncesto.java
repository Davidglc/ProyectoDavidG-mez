
public class DavidGómezBaloncesto{
	public String titulo;
	public int nPaginas;
	public String nombreHobby;
	
	public DavidGómezBaloncesto(String titulo, int nPaginas, String nombreHobby) {
		super();
		this.titulo = titulo;
		this.nPaginas = nPaginas;
		this.nombreHobby = nombreHobby;
	}
	public String gettitulo() {
		return titulo;
	}
	public String settitulo(String titulo) {
		return this.titulo=titulo;
	}
}
