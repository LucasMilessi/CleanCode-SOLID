package principioSegregacionInterfaces;

public class Television implements Encendible, Ajustable{

    private boolean encendida;
    private int volumen;

    @Override
    public void encender() {
        encendida = true;

        System.out.println("Televisión encendida.");
    }

    @Override
    public void apagar() {
        encendida = false;

        System.out.println("Televisión apagada.");
    }

    @Override
    public void ajustarVolumen(int nivel) {

        if (encendida) {
            volumen = nivel;
            System.out.println("Volumen de la televisión ajustado a " + nivel);
        } else {
            System.out.println("No se puede ajustar el volumen, la televisión está apagada.");
        }
    }
}
