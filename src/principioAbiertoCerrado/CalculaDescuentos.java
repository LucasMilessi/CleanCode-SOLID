package principioAbiertoCerrado;


public class CalculaDescuentos {
    public static void main(String[] args) {

        Descuento descuentoPorciento = new DescuentoPorcentaje(40);
        double precioConDescuento1 = descuentoPorciento.aplicarDescuento(100.0); // Esto calculará un 40% de descuento y devolverá 60.0

        Descuento descuentoMontoFijo = new DescuentoMontoFijo(25);
        double precioConDescuento2 = descuentoMontoFijo.aplicarDescuento(80.0); // Esto calculará un descuento de 20 y devolverá 55.0

        System.out.println(precioConDescuento1);
        System.out.println(precioConDescuento2);
    }
}
