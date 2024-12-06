# Figuras Geométricas en Java

## Descripción
Este proyecto implementa un programa en Java que modela y realiza cálculos básicos para figuras geométricas: **Círculo**, **Cuadrado**, **Rectángulo**, **Triángulo Rectángulo** y **Trapecio**. Cada figura cuenta con métodos para calcular su área y perímetro, y en algunos casos, funcionalidades adicionales como determinar la hipotenusa o el tipo de triángulo.

La clase principal, **PruebaFiguras**, crea instancias de estas figuras y muestra los resultados de los cálculos en la consola.

## Funcionalidades
- **Círculo**:
  - Cálculo del área: `π * r^2`
  - Cálculo del perímetro: `2 * π * r`

- **Cuadrado**:
  - Cálculo del área: `lado * lado`
  - Cálculo del perímetro: `4 * lado`

- **Rectángulo**:
  - Cálculo del área: `base * altura`
  - Cálculo del perímetro: `2 * (base + altura)`

- **Triángulo Rectángulo**:
  - Cálculo del área: `(base * altura) / 2`
  - Cálculo del perímetro: `base + altura + hipotenusa`
  - Cálculo de la hipotenusa: `√(base² + altura²)`
  - Determinación del tipo de triángulo (isósceles o escaleno).

- **Trapecio** (nueva figura agregada):
  - Cálculo del área: `((baseMayor + baseMenor) * altura) / 2`
  - Cálculo del perímetro: `baseMayor + baseMenor + lado1 + lado2`

## Ejecución
Al ejecutar el programa, los resultados del cálculo de área y perímetro para cada figura, junto con otras propiedades relevantes, se muestran en la consola.

## Estructura del Proyecto
El proyecto incluye las siguientes clases:
1. **Círculo**
2. **Cuadrado**
3. **Rectángulo**
4. **Triángulo Rectángulo**
5. **Trapecio**
6. **PruebaFiguras** (clase principal)

## Requisitos
- **Java Development Kit (JDK)** 8 o superior.
- Un IDE o editor de texto que soporte Java (por ejemplo, IntelliJ IDEA, Eclipse o Visual Studio Code).

## Uso
1. Clona el repositorio:
   ```bash
   git clone https://github.com/tu-usuario/tu-repositorio.git
