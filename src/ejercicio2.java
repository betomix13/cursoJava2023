import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombre=leer.next();

        System.out.println("Ingrese su apellido");
        String apellido=leer.next();

        System.out.println("Hola "+nombre+" "+apellido );

    }
}
