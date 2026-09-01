class Soporte1 extends Soporte {
@Override
    public void resolver(Problema problema) {

        if (problema.getDificultad() <= 1) {
            System.out.println("Nivel 1 resolvió: " + problema.getDescripcion());
        } else {

            System.out.println("Nivel 1 no puede resolver el problema.");
            if (siguiente != null) {
                siguiente.resolver(problema);
            }
            
        }
    }
}