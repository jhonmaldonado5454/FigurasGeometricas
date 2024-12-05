public class TrianguloRectangulo {
    private int base, altura; // Aquí guardo la base y la altura del triángulo.

    // Constructor: aquí asigno los valores de base y altura.
    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular el área. Uso la fórmula (base * altura) / 2.
    public double calcularArea() {
        return (base * altura) / 2.0;
    }

    // Método para calcular el perímetro. Incluyo la hipotenusa en el cálculo.
    public double calcularPerimetro() {
        return base + altura + calcularHipotenusa();
    }

    // Aquí calculo la hipotenusa usando el teorema de Pitágoras.
    public double calcularHipotenusa() {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }

    // Determino el tipo de triángulo (isósceles o escaleno) según sus lados.
    public void determinarTipoTriangulo() {
        if (base == altura) {
            System.out.println("Es un triángulo isósceles.");
        } else {
            System.out.println("Es un triángulo escaleno.");
        }
    }
}
