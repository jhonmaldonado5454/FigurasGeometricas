public class Cuadrado {
    private int lado; // Aquí guardo la longitud de los lados del cuadrado.

    // Constructor: aquí asigno el valor del lado.
    public Cuadrado(int lado) {
        this.lado = lado;
    }

    // Método para calcular el área del cuadrado. Uso la fórmula lado * lado.
    public double calcularArea() {
        return lado * lado;
    }

    // Método para calcular el perímetro del cuadrado. Uso la fórmula 4 * lado.
    public double calcularPerimetro() {
        return 4 * lado;
    }
}
