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
        if (c >= a && c <= b){
            System.out.println(c + " esta dentro del intervalo");
        }
        //si c no esta dentro del intervalo
        else{
            System.out.println(c + " no esta dentro del intervalo");
        }

    }
}
