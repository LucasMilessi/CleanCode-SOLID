package principioInversionDependencia;

public class PruebaNotificacion {

    public static void main(String[] args) {

        ServicioNotificacion servicioEmail = new ServicioEmail();
        ServicioNotificacion servicioSMS = new ServicioSMS();

        Notificador notificadorEmail = new Notificador(servicioEmail);
        notificadorEmail.enviarNotificacion("Hola, este es un mensaje por email.");

        Notificador notificadorSMS = new Notificador(servicioSMS);
        notificadorSMS.enviarNotificacion("Hola, este es un mensaje por SMS.");
    }
}
