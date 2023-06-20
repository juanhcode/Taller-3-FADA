package punto2;

public class Nodo {
    private Obra obra; //informacion
    private Nodo siguiente; //puntero


    public Nodo(Obra obra) {
        this.obra = obra;
        this.siguiente = null;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public Obra getObra() {
        return obra;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
