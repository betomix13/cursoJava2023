import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // Se lee la cantidad de notas ingresada por el usuario
        System.out.println("ingrese la cantidad de notas");
        int cantidadNotas = leer.nextInt();
        int contador = 0;

        // Se crea un arreglo de enteros con el tamaño especificado
        int notas [] = new int[cantidadNotas];
        for (int i=0; i< cantidadNotas; i++){

            System.out.println("Ingrese la nota " + (i + 1)+": ");
            // Se lee cada una de las notas ingresadas por el usuario y se almacenan en el arreglo
            int nota= leer.nextInt();

            if (nota>=6 && nota <=10){
                notas[contador]= nota;
                contador++;
            }
        }
        System.out.println("notas ingresadas:");
        for (int i=0; i<contador; i++){
            // Se muestra el contenido de cada una de las notas ingresadas
            System.out.println("Nota "+(i+1)+": "+ notas[i]);
        }
    }
}
