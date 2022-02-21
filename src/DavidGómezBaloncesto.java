
public class DavidGómezBaloncesto{
	public String nombreJugador;
	public int dorsal;
	public String nombreHobby;
	
	public DavidGómezBaloncesto(String titulo, int nPaginas, String nombreHobby) {
		super();
		this.nombreJugador = titulo;
		this.dorsal = nPaginas;
		this.nombreHobby = nombreHobby;
	}
	public String getnombreJugador() {
		return nombreJugador;
	}
	public String setnombreJugador(String nombreJugador) {
		return this.nombreJugador=nombreJugador;
	}
	public int getdorsal() {
		return dorsal;
	}
}
