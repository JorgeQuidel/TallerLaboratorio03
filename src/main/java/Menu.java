import java.util.ArrayList;
import java.util.stream.IntStream;

public class Menu {

    public void iniciar() {
        Equipo equipo = new Equipo();
        ArrayList<Jugador> jugadores = new ArrayList<>();
        mostrarMenuPricipal();
        switch (Utilidad.pedirOpcionHasta(1)) {
            case 0 -> System.out.println("Hasta pronto");
            case 1 -> menuCrearEquipo(equipo, jugadores);
        }
    }

    private void menuCrearEquipo(Equipo equipo, ArrayList<Jugador> jugadores) {
        ingresarNombreEquipo(equipo);

        System.out.print("Elija la cantidad de jugadores de su equipo: ");
        int cantidad = Utilidad.pedirOpcionMayorA(1);

        ingresarJugadores(cantidad, jugadores, equipo);
        ingresarCapitan(jugadores, equipo);

        menuEditorEquipo(equipo);
    }

    private void menuEditorEquipo(Equipo equipo) {
        bucle:
        while (true) {
            System.out.println(equipo.toString());
            mostrarMenuEditorEquipo();
            switch (Utilidad.pedirOpcionHasta(2)) {
                case 0 -> {break bucle;}
                case 1 -> cambiarNombre(equipo);
            }
        }
    }

    private void cambiarNombre(Equipo equipo) {
        System.out.print("Ingrese el nuevo nombre: ");
        equipo.setNombreEquipo(Utilidad.pedirStringNoVacio());
    }

    private void mostrarMenuEditorEquipo() {
        System.out.println("Desea hacer algun otro cambio?");
        System.out.println("[1].Cambiar nombre del equipo");
        System.out.println("[0].Salir (ADVERTENCIA, EL EQUIPO SERA BORRADO UNA VEZ SALE DE ESTE MENU)");
    }

    private void ingresarNombreEquipo(Equipo equipo) {
        System.out.println("Elija el nombre del equipo");
        String nombreEquipo = Utilidad.pedirStringNoVacio();
        equipo.setNombreEquipo(nombreEquipo);
    }

    private void ingresarCapitan(ArrayList<Jugador> jugadores, Equipo equipo) {
        System.out.println("Seleccione al capitan de su equipo");
        for (int index = 0; index < jugadores.size(); index++) {
            System.out.println("["+ index +"]"+jugadores.get(index).getNombre());
        }
        int capitan = Utilidad.pedirOpcionHasta(jugadores.size()-1);
        equipo.setCapitan(jugadores.get(capitan));
        System.out.println("El capitan es " + equipo.getCapitan().getNombre());
    }

    private void ingresarJugadores(int cantidad, ArrayList<Jugador> jugadores, Equipo equipo) {
        IntStream.range(0, cantidad).forEach(i -> {
            System.out.print("Ingrese el nombre del jugador " + i + " : ");
            String nombre = Utilidad.pedirStringNoVacio();
            jugadores.add(new Jugador(nombre, equipo));
        });
    }


    private void mostrarMenuPricipal() {
        System.out.println("¿Que desea hacer?:");
        System.out.println("[1].Formar Equipo");
        System.out.println("[0].Salir");
    }

}
