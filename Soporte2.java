class Soporte2 extends Soporte {
@Override
    public void resolver(Problema problema) {

        if (problema.getDificultad() <= 2) {
            System.out.println("Nivel 2 resolvió: " + problema.getDescripcion());
        } else {
            
            System.out.println("Nivel 2 no puede resolver el problema.");
            if (siguiente != null) {
                siguiente.resolver(problema);
            }
        }
    }
}