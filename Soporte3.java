import java.util.concurrent.*;

class Soporte3 extends Soporte {

    private ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

    @Override
    public void resolver(Problema problema) {

        System.out.println("Nivel 3 recibió el problema: " + problema.getDescripcion());
        System.out.println("Nivel 3 analizará los efectos del problema...");
        
        // Determinamos la tarea a resolver en 5 segundos
        executor.schedule(
                () -> {

                    System.out.println("Nivel 3 analizó los efectos del problema");

                    System.out.println("Nivel 3 está procesando: " + problema.getDescripcion());

                    System.out.println("Problema resuelto por Nivel 3.");

                },
                5,
                TimeUnit.SECONDS);
    }

    public void apagarExecutor() {
        // finalizamos tareas pendientes y cerramos el executor
        executor.shutdown();
    }
}