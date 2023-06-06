public class ejercicio11 {
    public static class Rectangulo extends Main {
        //Se crea la clase con 2 atributos privados
        private double lado1;
        private double lado2;
        //El constructor parametrizado los lados con valor 0
        public Rectangulo() {
            this.lado1 = 0;
            this.lado2 = 0;
        }
        //Se inicializa los lados con los valores proporcionados
        public Rectangulo(double lado1, double lado2) {
            this.lado1 = lado1;
            this.lado2 = lado2;
        }

        //Se calcula el la superficie y el perimetro del rectangulo
        public double getPerimetro() {
            return 2 * (lado1 + lado2);
        }
        public double getSuperficie() {
            return lado1 * lado2;
        }


    }
}
