package punto1;

public class Lista {
    private Nodo cabeza;

    public Lista() {
        this.cabeza = null;
    }

    public Nodo getCabeza() {
        return cabeza;
    }


    public void insertarOrden(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null || dato < cabeza.dato) {
            nuevoNodo.siguiente = cabeza;
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null && actual.siguiente.dato <= dato) {
                actual = actual.siguiente;
            }
            nuevoNodo.siguiente = actual.siguiente;
            actual.siguiente = nuevoNodo;
        }
    }

    public static Lista combinar(Lista L1, Lista L2) {
        Lista L3 = new Lista();
        Nodo actual1 = L1.getCabeza();
        Nodo actual2 = L2.getCabeza();

        while (actual1 != null && actual2 != null) {
            if (actual1.dato <= actual2.dato) {
                L3.insertarOrden(actual1.dato);
                actual1 = actual1.siguiente;
            } else {
                L3.insertarOrden(actual2.dato);
                actual2 = actual2.siguiente;
            }
        }

        while (actual1 != null) {
            L3.insertarOrden(actual1.dato);
            actual1 = actual1.siguiente;
        }

        while (actual2 != null) {
            L3.insertarOrden(actual2.dato);
            actual2 = actual2.siguiente;
        }

        return L3;
    }

    public void imprimirLista() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}
