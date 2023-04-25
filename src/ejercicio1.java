import java.util.Scanner;

public class ejercicio1{

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero " );
        int num1 = leer.nextInt();

        System.out.println(" ingrese otro numero ");
        int num2 = leer.nextInt();

        System.out.println("la suma entre  " +num1+" y "+num2+ " es: "+(num1 + num2));

    }
}
