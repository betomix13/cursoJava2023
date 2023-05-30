import java.util.Scanner;

class ejercicio7
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int suma = 0;
        // Se repite el bucle for 5 veces
        for (int i = 1; i <= 5; i++) {
            // se ingresan  los 5 nros. por teclado
            System.out.println("Ingrese el " + i + "º número: ");
            numero = teclado.nextInt();
            // al ingresar el numero se va sumando
            suma = suma + numero;
        }
        // Se calcula el  promedio de los número ingresados y se muestra
        float promedio = (float)suma / 5;
        System.out.println("El promedio de los 5 números  es: " + promedio);
        teclado.close();

    }
}
