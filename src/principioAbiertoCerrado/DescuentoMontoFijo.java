package principioAbiertoCerrado;

public class DescuentoMontoFijo implements Descuento{

    private double montoDescuento;

    public DescuentoMontoFijo(double montoDescuento) {
        this.montoDescuento = montoDescuento;
    }

    @Override
    public double aplicarDescuento(double precio) {

        return precio - montoDescuento;
    }
}
