abstract class Soporte {

    protected Soporte siguiente;

    public void setSiguiente(Soporte siguiente) {
        this.siguiente = siguiente;
    }

    public abstract void resolver(Problema problema);
}