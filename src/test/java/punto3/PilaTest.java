package punto3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PilaTest {

    @Test
    void estaVaciaPilaConColas() {
        Pila<Integer> pila = new Pila<>(5);
        assertEquals(pila.estaVaciaPilaConColas(),true);
    }

    @Test
    void pushPilaConColas() {
        Pila<Integer> pila = new Pila<>(5);
        pila.pushPilaConColas(1);
        pila.pushPilaConColas(2);
        pila.pushPilaConColas(3);
        assertEquals(pila.estaVaciaPilaConColas(),false);
        assertEquals(3,pila.popPilaConColas());
    }

    @Test
    void popPilaConColas() {
        Pila<Integer> pila = new Pila<>(5);
        pila.pushPilaConColas(1);
        pila.pushPilaConColas(2);
        pila.pushPilaConColas(3);
        pila.pushPilaConColas(4);
        pila.pushPilaConColas(5);

        assertEquals(pila.popPilaConColas(),5);
        assertEquals(pila.popPilaConColas(),4);
        assertEquals(pila.popPilaConColas(),3);
        assertEquals(pila.popPilaConColas(),2);
        assertEquals(pila.popPilaConColas(),1);
        assertEquals(pila.estaVaciaPilaConColas(),true);

        assertThrows(IllegalStateException.class,()->{
            pila.popPilaConColas();
        });

    }

    @Test
    void mostrarPilaConColas() {
        Pila<Integer> pila = new Pila<>(5);
        pila.pushPilaConColas(1);
        pila.pushPilaConColas(2);
        pila.pushPilaConColas(3);
        pila.mostrarPilaConColas();
    }
}