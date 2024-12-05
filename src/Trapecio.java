public class Trapecio {
    private int baseMayor, baseMenor, altura, lado1, lado2; // Dimensiones del trapecio.

    // Constructor: aquí inicializo todas las dimensiones necesarias.
    public Trapecio(int baseMayor, int baseMenor, int altura, int lado1, int lado2) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // Método para calcular el área. Uso la fórmula ((baseMayor + baseMenor) * altura) / 2.
    public double calcularArea() {
        return ((baseMayor + baseMenor) * altura) / 2.0;
    }

    // Método para calcular el perímetro sumando todos los lados.
    public double calcularPerimetro() {
        return baseMayor + baseMenor + lado1 + lado2;
    }
}
