package principioSustituciónDeLiskov;

public class CalcularAreaTotal {

    public static void main(String[] args) {

        Circulo circulo1 = new Circulo(5.0);
        Rectangulo rectangulo = new Rectangulo(4.0, 6.0);
        Circulo circulo2 = new Circulo(3.0);

        Forma[] formas = {circulo1, rectangulo, circulo2};

        CalculadoraArea calculadora = new CalculadoraArea();

        double areaTotal = calculadora.calcularAreaTotal(formas);

        System.out.println("El área total de las formas es: " + areaTotal);
    }
}
