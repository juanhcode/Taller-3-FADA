package punto2;

public class Inventario {
    private Nodo cabeza; //inicio

    public void agregarReplica(String nombre) {
        if (cabeza == null) {
            Obra nuevaObra = new Obra(nombre, 1);
            Nodo nuevoNodo = new Nodo(nuevaObra);
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                if (actual.getObra().getNombre().equals(nombre)) {
                    actual.getObra().aumentarCantidad();
                    return;
                }
                actual = actual.getSiguiente();
            }
            if (actual.getObra().getNombre().equals(nombre)) {
                actual.getObra().aumentarCantidad();
            } else {
                Obra nuevaObra = new Obra(nombre, 1);
                Nodo nuevoNodo = new Nodo(nuevaObra);
                actual.setSiguiente(nuevoNodo);
            }
        }

        /*
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.getObra().getNombre().equals(nombre)) {
                actual.getObra().aumentarCantidad();
                return;
            }
            actual = actual.getSiguiente();
        }

        Obra nuevaObra = new Obra(nombre, 1);
        Nodo nuevoNodo = new Nodo(nuevaObra);
        nuevoNodo.setSiguiente(cabeza);
        cabeza = nuevoNodo;
        */
    }

    public String venderReplica(String nombre){
        if(cabeza == null){
            return "No se encontró la obra en el inventario";
        }

        if(cabeza.getObra().getNombre().equals(nombre)){
            cabeza.getObra().disminuirCantidad();
            if(cabeza.getObra().getCantidad()==0){
                cabeza = cabeza.getSiguiente();
            }

        }

        Nodo anterior = cabeza;
        Nodo actual = cabeza.getSiguiente();
        while (actual != null) {
            if (actual.getObra().getNombre().equals(nombre)) {
                actual.getObra().disminuirCantidad();
                if (actual.getObra().getCantidad() == 0) {
                    anterior.setSiguiente(actual.getSiguiente());
                }
            }
            anterior = actual;
            actual = actual.getSiguiente();
        }

        return "No se encontró la obra en el inventario";
    }


    public void listarReplicas() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(
                    "Nombre: " + actual.getObra().getNombre() + ", Cantidad: " + actual.getObra().getCantidad());
            actual = actual.getSiguiente();
        }
    }
}
