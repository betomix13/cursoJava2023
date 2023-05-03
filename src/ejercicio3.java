
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Leer dos números enteros desde el teclado
        System.out.print("Ingrese el primer número: ");
        int num1 = leer.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = leer.nextInt();

        // Realizar las operaciones
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        double division = (double) num1 / num2; //  double para obtener un resultado decimal

        // Informar los resultados de las operaciones
        System.out.println("La suma de los números es: " + suma);
        System.out.println("La resta de los números es: " + resta);
        System.out.println("La multiplicación de los números es: " + multiplicacion);
        System.out.println("La división de los números es: " + division);


    }
}

