import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        //Se ingresan datos desde teclado
        Scanner X = new Scanner(System.in);

        //se declaran variables
        int a;
        int b;
        int c = 50;

        //se ingresan numeros
        System.out.println("Ingresar un numero: ");
        a = X.nextInt();
        System.out.println("Ingrese otro numero");
        b = X.nextInt();

        //si c esta dentro del intervalo
        if (c >= a) {
            if (c <= b) {
                System.out.println(c + " está dentro del intervalo");
            } else {
                System.out.println(c + " no está dentro del intervalo");
            }
        } else {
            System.out.println(c + " no está dentro del intervalo");
        }

    }
}
