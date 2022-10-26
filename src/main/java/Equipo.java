import java.util.ArrayList;

public class Equipo {
	private String nombreEquipo;
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	private Jugador capitan;


	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public Jugador getCapitan() {
		return capitan;
	}

	public void setCapitan(Jugador capitan) {
		this.capitan = capitan;
	}

	@Override
	public String toString() {
		return "Equipo{" +
				"nombreEquipo='" + nombreEquipo + '\'' +
				", jugadores=" + jugadores +
				", capitan=" + capitan +
				'}';
	}
}