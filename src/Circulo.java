public class Circulo {
    private int radio; // Este es el radio del círculo.

    // Constructor: aquí inicializo el radio del círculo.
    public Circulo(int radio) {
        this.radio = radio;
    }

    // Método para calcular el área del círculo. Uso la fórmula π * r^2.
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    // Método para calcular el perímetro del círculo. Uso la fórmula 2 * π * r.
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
