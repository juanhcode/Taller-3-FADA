package punto3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColaTest {

    @Test
    void agregar() {
        Cola<Integer> cola = new Cola<>(5);
        cola.agregar(1);
        cola.agregar(2);
        cola.agregar(3);
        assertEquals(cola.esVacia(),false);

    }

    @Test
    void peek() {
        Cola<Integer> cola = new Cola<>(5);
        cola.agregar(1);
        System.out.println(cola.peek());
        assertEquals(cola.peek(),1);

    }

    @Test
    void esVacia() {
        Cola<Integer> cola = new Cola<>(5);
        assertEquals(cola.esVacia(),true);
    }

    @Test
    void eliminar() {
        Cola<Integer> cola = new Cola<>(5);
        cola.agregar(1);
        cola.agregar(3);
        cola.agregar(4);

        cola.eliminar();
        cola.eliminar();
        assertEquals(cola.peek(),4);
    }

    @Test
    void getSize() {
        Cola<Integer> cola = new Cola<>(5);
        assertEquals(cola.getSize(),0);
    }
}