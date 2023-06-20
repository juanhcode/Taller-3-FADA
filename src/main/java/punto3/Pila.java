package punto3;

public class Pila<T> {

    private Cola<T> cola;

    public Pila(int capacidad){
        cola = new Cola<>(capacidad);
    }
    public boolean estaVaciaPilaConColas(){
        return cola.esVacia();
    }
    public void pushPilaConColas(Object o){
        cola.agregar((T) o);
    }

    public Object popPilaConColas(){
        Cola<T> auxiliar = new Cola<>(cola.getSize());
        int size = cola.getSize();
        for (int i = 0; i < size - 1; i++) {
            auxiliar.agregar(cola.eliminar());
        }
        T elementoEliminado = cola.eliminar();
        cola = auxiliar;
        return elementoEliminado;
    }

    public void mostrarPilaConColas(){
        if (cola.esVacia()) {
            System.out.println("La pila está vacía");
        } else {
            Cola<T> auxiliar = new Cola<>(cola.getSize());
            int size = cola.getSize();
            for (int i = 0; i < size; i++) {
                T elemento = cola.eliminar();
                System.out.println(elemento);
                auxiliar.agregar(elemento);
            }
            cola = auxiliar;
        }
    }
}
