public class PruebaFiguras {
    public static void main(String[] args) {
        // Creo instancias de cada figura y las inicializo con valores de ejemplo.
        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1, 2);
        Cuadrado figura3 = new Cuadrado(3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3, 5);
        Trapecio figura5 = new Trapecio(4, 2, 3, 3, 4);

        // Aquí calculo y muestro los resultados del círculo.
        System.out.println("El área del círculo es = " + figura1.calcularArea());
        System.out.println("El perímetro del círculo es = " + figura1.calcularPerimetro());

        // Aquí calculo y muestro los resultados del rectángulo.
        System.out.println("El área del rectángulo es = " + figura2.calcularArea());
        System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerimetro());

        // Aquí calculo y muestro los resultados del cuadrado.
        System.out.println("El área del cuadrado es = " + figura3.calcularArea());
        System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerimetro());

        // Aquí calculo y muestro los resultados del triángulo rectángulo.
        System.out.println("El área del triángulo es = " + figura4.calcularArea());
        System.out.println("El perímetro del triángulo es = " + figura4.calcularPerimetro());
        figura4.determinarTipoTriangulo();

        // Aquí calculo y muestro los resultados del trapecio.
        System.out.println("El área del trapecio es = " + figura5.calcularArea());
        System.out.println("El perímetro del trapecio es = " + figura5.calcularPerimetro());
    }
}