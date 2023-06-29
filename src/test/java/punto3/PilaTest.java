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

        Pila<Integer> pila2 = new Pila<>(5);
        pila2.pushPilaConColas(2);
        assertEquals(pila2.estaVaciaPilaConColas(),false);

        Pila<Integer> pila3 = new Pila<>(5);
        pila3.pushPilaConColas(2);
        pila3.pushPilaConColas(5);
        pila3.pushPilaConColas(7);

        assertEquals(pila3.estaVaciaPilaConColas(),false);
    }

    @Test
    void pushPilaConColas() {
        Pila<Integer> pila = new Pila<>(5);
        pila.pushPilaConColas(1);
        pila.pushPilaConColas(2);
        pila.pushPilaConColas(3);
        assertEquals(pila.estaVaciaPilaConColas(),false);
        assertEquals(3,pila.popPilaConColas());

        Pila<Integer> pila2 = new Pila<>(5);
        pila2.pushPilaConColas(100);
        pila2.pushPilaConColas(23);
        pila2.pushPilaConColas(35);
        assertEquals(pila2.estaVaciaPilaConColas(),false);
        assertEquals(35,pila2.popPilaConColas());

        Pila<Integer> pila3 = new Pila<>(2);
        pila3.pushPilaConColas(1);
        pila3.pushPilaConColas(2);
        assertThrows(IllegalStateException.class,()->{
            pila3.pushPilaConColas(4);
        });
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

        Pila<Integer> pila2 = new Pila<>(5);
        pila2.pushPilaConColas(100);
        pila2.pushPilaConColas(200);
        pila2.pushPilaConColas(300);
        pila2.pushPilaConColas(400);
        pila2.pushPilaConColas(500);
        System.out.println("Pila");
        pila2.mostrarPilaConColas();
        System.out.println("-------------------");
        System.out.println("Elemento eliminado de pila");
        assertEquals(pila2.popPilaConColas(),500);
        pila2.mostrarPilaConColas();

    }

    @Test
    void mostrarPilaConColas() {
        Pila<Integer> pila = new Pila<>(5);
        pila.pushPilaConColas(1);
        pila.pushPilaConColas(2);
        pila.pushPilaConColas(3);
        pila.mostrarPilaConColas();

        System.out.println("--------------------");

        Pila<Integer> pila2 = new Pila<>(5);
        pila2.pushPilaConColas(100);
        pila2.pushPilaConColas(240);
        pila2.pushPilaConColas(3231);
        pila2.mostrarPilaConColas();


        System.out.println("--------------------");

        Pila<Integer> pila3 = new Pila<>(5);
        pila3.pushPilaConColas(1);
        pila3.pushPilaConColas(3231);
        pila3.mostrarPilaConColas();
    }
}