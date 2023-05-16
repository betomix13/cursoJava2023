import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        //se ingresa en x los datos de teclado
        Scanner X = new Scanner(System.in);

        //se declara variable num
        int num;
        System.out.println("ingrese un numero");

        //Se ingresa el numero para ver si es par o impar
        num = X.nextInt();
        //si el resto da cero el numero es par, sino es impar
        if ( num % 2 == 0){
            System.out.println("El numero ingresado es par");
            }
            else{
                System.out.println("El numero ingresado es impar");
        }

    }
}
