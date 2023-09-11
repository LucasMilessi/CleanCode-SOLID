package principioInversionDependencia;

public class ServicioSMS implements ServicioNotificacion{

    @Override
    public void enviar(String mensaje) {

        System.out.println("Enviando SMS: " + mensaje);
    }
}
