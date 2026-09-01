public class Main {

    public static void main(String[] args) {

        Soporte1 nivel1 = new Soporte1();
        Soporte2 nivel2 = new Soporte2();
        Soporte3 nivel3 = new Soporte3();

        nivel1.setSiguiente(nivel2);
        nivel2.setSiguiente(nivel3);

        Problema problema = new Problema( "La base de datos está caída", 3);

        System.out.println("Cliente envió el problema.");

        nivel1.resolver(problema);

        System.out.println("El sistema continúa trabajando...");

        // Solo para terminar correctamente el programa
        // después de que haya pasado el tiempo necesario.
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        nivel3.apagarExecutor();
    }
}