import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //pedido antes de ingresar al bucle
        System.out.println("ingrese un numero entero o cero para terminar ");
        //declaro variables
        int num= leer.nextInt();
        int cantidad=0;
        int num_max=num;
        while (num!=0){
            if (num>=num_max){
                num_max=num;
            }
            System.out.println("ingrese un numero entero o cero para terminar ");
            num=leer.nextInt();
            cantidad++;
        }
        if(cantidad>0){
            System.out.println("el numero maximo es: "+ num_max);
        }
        else {
            System.out.println("ingrese un numero valido");
        }
    }
}
