package principioSegregacionInterfaces;

public class Radio implements Encendible{

    private boolean encendida;

    @Override
    public void encender() {
        encendida = true;
        System.out.println("Radio encendida.");
    }

    @Override
    public void apagar() {
        encendida = false;
        System.out.println("Radio apagada.");
    }
}
