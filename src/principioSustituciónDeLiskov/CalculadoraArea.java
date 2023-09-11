package principioSustituciónDeLiskov;

public class CalculadoraArea {

    public double calcularAreaTotal(Forma[] formas) {

        double areaTotal = 0.0;

        for (Forma forma : formas) {
            areaTotal += forma.calcularArea();
        }
        return areaTotal;
    }
}
