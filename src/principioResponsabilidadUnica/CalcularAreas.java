package principioResponsabilidadUnica;

public class CalcularAreas {
    public static void main(String[] args) {

        // Crear instancias de Circulo y Rectangulo
        Circulo circulo = new Circulo(5.0);
        Rectangulo rectangulo = new Rectangulo(4.0, 6.0);

        // Calcular y mostrar el área de cada forma
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
    }
}
