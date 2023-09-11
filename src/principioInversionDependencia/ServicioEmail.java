package principioInversionDependencia;

public class ServicioEmail implements ServicioNotificacion{

    @Override
    public void enviar(String mensaje) {

        System.out.println("Enviando email: " + mensaje);
    }
}
