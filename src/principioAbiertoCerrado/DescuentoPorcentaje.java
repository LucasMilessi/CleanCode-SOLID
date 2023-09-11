package principioAbiertoCerrado;

public class DescuentoPorcentaje implements Descuento{
    private double porsentajeDescuento;

    public DescuentoPorcentaje(double porsentajeDescuento) {
        this.porsentajeDescuento = porsentajeDescuento;
    }

    @Override
    public double aplicarDescuento(double precio) {

        double descuento = (porsentajeDescuento / 100.0) * precio;
        return precio - descuento;
    }
}
