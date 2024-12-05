public class Rectangulo {
    private int base, altura; // Aquí almaceno las dimensiones del rectángulo.

    // Constructor: aquí inicializo la base y la altura.
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular el área. Uso la fórmula base * altura.
    public double calcularArea() {
        return base * altura;
    }

    // Método para calcular el perímetro. Uso la fórmula 2 * (base + altura).
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
