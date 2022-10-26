import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilidad {

    public static int pedirValorEnteroEnIntervalo(int limite) throws InputMismatchException {
        int valor = new Scanner(System.in).nextInt();
        if (valor < 0 || valor > limite) {
            throw new InputMismatchException();
        }
        return valor;
    }

    public static int pedirOpcionHasta(int limite) {
        try {
            return pedirValorEnteroEnIntervalo(limite);
        } catch (InputMismatchException e) {
            System.out.println("La opción que ingresó supera el límite");
            return pedirOpcionHasta(limite);
        }
    }

    public static int pedirOpcionMayorA(int base){
        int valor = pedirOpcionEntera();
        if(valor <= base){
            System.out.println("Por favor ingrese un numero mayor a " + base);
            return pedirOpcionMayorA(base);
        }else {
            return valor;
        }
    }

    public static int pedirOpcionEntera() {
        try {
            return pedirValorEntero();
        } catch (InputMismatchException e) {
            System.out.println("Por favor ingrese un numero entero");
            return pedirOpcionEntera();
        }
    }

    public static int pedirValorEntero() throws InputMismatchException {
        return new Scanner(System.in).nextInt();
    }

    public static String pedirStringNoVacio() {
        String texto = pedirString();
        if(texto.isBlank()){
            System.out.println("La entrada ingresada se encuentra vacia, intente nuevamente");
            return pedirStringNoVacio();
        }else {
            return texto;
        }
    }

    public static String pedirString() {
        return new Scanner(System.in).nextLine();
    }
}
