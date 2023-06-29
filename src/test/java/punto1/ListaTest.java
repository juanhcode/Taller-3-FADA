package punto1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaTest {

    @Test
    void insertarOrden() {
        Lista L1 = new Lista();
        Lista L2 = new Lista();
        Lista L3 = new Lista();

        System.out.println("L1");
        L1.insertarOrden(10);
        L1.insertarOrden(20);
        L1.insertarOrden(45);
        L1.imprimirLista();
        System.out.println("-------------------------");

        System.out.println("L2");
        L2.insertarOrden(1);
        L2.insertarOrden(3);
        L2.insertarOrden(8);
        L2.imprimirLista();
        System.out.println("-------------------------");

        System.out.println("L3");
        L3.insertarOrden(1);
        L3.insertarOrden(3);
        L3.insertarOrden(8);
        L3.imprimirLista();
    }

    @Test
    void combinar() {
        Lista L1 = new Lista();
        Lista L2 = new Lista();

        L1.insertarOrden(3);
        L1.insertarOrden(7);
        L1.insertarOrden(9);
        System.out.println("L1");
        L1.imprimirLista();
        System.out.println("--------------------------------------");

        L2.insertarOrden(1);
        L2.insertarOrden(3);
        L2.insertarOrden(8);
        System.out.println("L2");
        L2.imprimirLista();
        System.out.println("--------------------------------------");
        Lista L3 = Lista.combinar(L1, L2);
        System.out.println("L1 y L2 Combinadas");
        L3.imprimirLista();

        Lista L4 = new Lista();
        Lista L5 = new Lista();

        System.out.println("--------------------------------------");

        L4.insertarOrden(6);
        L4.insertarOrden(15);
        L4.insertarOrden(918);
        System.out.println("L4");
        L4.imprimirLista();
        System.out.println("-------------------------");
        L5.insertarOrden(4);
        L5.insertarOrden(7);
        L5.insertarOrden(15);
        System.out.println("L5");
        L5.imprimirLista();
        System.out.println("--------------------------------------");
        Lista L6 = Lista.combinar(L4, L5);
        System.out.println("L4 y L5 Combinadas");
        L6.imprimirLista();
    }

    @Test
    void imprimirLista() {
        //Mostrar lista combinada
        Lista L1 = new Lista();
        Lista L2 = new Lista();

        L1.insertarOrden(45);
        L1.insertarOrden(50);
        L1.insertarOrden(55);

        L2.insertarOrden(1);
        L2.insertarOrden(2);
        L2.insertarOrden(3);
        Lista L3 = Lista.combinar(L1, L2);
        System.out.println("Lista L1 Y L2 Combinadas");
        L3.imprimirLista();



        Lista L5 = new Lista();

        L5.insertarOrden(75);
        L5.insertarOrden(920);
        L5.insertarOrden(12301);
        System.out.println("Lista l5");
        L5.imprimirLista();


        Lista L8 = new Lista();
        System.out.println("Lista L8");
        L8.imprimirLista();
    }
}