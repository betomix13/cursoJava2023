public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Se crea un objeto rectangulo el constructor parametrizado
        ejercicio11.Rectangulo rectangulo = new ejercicio11.Rectangulo(5, 8);

        //Se obtiene el perimetro y la superficie del rectangulo usando el metodo get
        double perimetro = rectangulo.getPerimetro();
        double superficie = rectangulo.getSuperficie();

        //Se imprime el perimetro y la superficie del rectangulo
        System.out.println("Perímetro del rectángulo: " + perimetro);
        System.out.println("Superficie del rectángulo: " + superficie);

    }
}