package principioSegregacionInterfaces;

public class PruebaDispositivo {

    public static void main(String[] args) {

        Television television = new Television();

        television.encender();

        television.ajustarVolumen(30);

        television.apagar();

        Radio radio = new Radio();

        radio.encender();

        radio.apagar();
    }
}
