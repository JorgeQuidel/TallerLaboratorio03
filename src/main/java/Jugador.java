public class Jugador {
	private String nombre;
	private Equipo equipo;

	public Jugador(String nombre, Equipo equipo) {
		this.nombre = nombre;
		this.equipo = equipo;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Jugador{" +
				"nombre='" + nombre + '\'' +
				'}';
	}
}