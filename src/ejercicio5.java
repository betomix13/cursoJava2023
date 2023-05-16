import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        //en X se ingresa los datos desde teclado
        Scanner X = new Scanner(System.in);

        //se declaran las variables
        int num1;
        int num2;

        //ingreso los numeros
        System.out.println("Ingresa un numero");
        num1 = X.nextInt();
        System.out.println("ingrese otro numero");
        num2 = X.nextInt();

        //si el resto da cero es multiplo
        if (num1 % num2 == 0) {
            System.out.println(num1 + " Es multiplo de " + num2);
        }
        else{
            System.out.println(num1+ " No es multiplo de " +num2);

        }
    }
}
