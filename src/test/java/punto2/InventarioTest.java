package punto2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventarioTest {

    @Test
    void agregarReplica() {
        System.out.println("Inventario 1");
        Inventario inventario = new Inventario();
        inventario.agregarReplica("Gioconda");
        inventario.agregarReplica("El beso");
        inventario.agregarReplica("El beso");
        inventario.agregarReplica("La última cena");
        inventario.agregarReplica("La joven de la perla");
        inventario.agregarReplica("El beso");
        inventario.listarReplicas();

        System.out.println("--------------------------");
        System.out.println("Inventario 2");
        Inventario inventario2 = new Inventario();
        inventario2.agregarReplica("Las Meninas");
        inventario2.agregarReplica("La Noche Estrellada");
        inventario2.agregarReplica("El Grito");
        inventario2.agregarReplica("Capilla Sixtina");
        inventario2.agregarReplica("La Noche Estrellada");
        inventario2.agregarReplica("El Grito");
        inventario2.listarReplicas();


        System.out.println("--------------------------");
        System.out.println("Inventario 3");
        Inventario inventario3 = new Inventario();
        inventario3.agregarReplica("Las Meninas");
        inventario3.listarReplicas();
    }

    @Test
    void listarReplicas() {
        System.out.println("Inventario 1");
        Inventario inventario = new Inventario();
        inventario.agregarReplica("Nenúfares");
        inventario.agregarReplica("La Persistencia de la Memoria");
        inventario.agregarReplica("Rueda de Bicicleta");
        inventario.agregarReplica("El Beso");
        inventario.agregarReplica("El Beso");
        inventario.agregarReplica("La Persistencia de la Memoria");
        inventario.listarReplicas();

        System.out.println("--------------------------");
        System.out.println("Inventario 2");
        Inventario inventario2 = new Inventario();
        inventario2.agregarReplica("El Nacimiento de Venus");
        inventario2.agregarReplica("El Nacimiento de Venus");
        inventario2.agregarReplica("El Nacimiento de Venus");
        inventario2.listarReplicas();

        System.out.println("--------------------------");
        System.out.println("Inventario 3");

        Inventario inventario3 = new Inventario();
        inventario3.agregarReplica("El bicho");
        inventario3.listarReplicas();
    }

    @Test
    void venderReplica() {
        System.out.println("Inventario 1");
        Inventario inventario = new Inventario();
        inventario.agregarReplica("Gioconda");
        inventario.agregarReplica("El beso");
        inventario.agregarReplica("Gioconda");
        assertEquals("No se encontró la obra en el inventario",inventario.venderReplica("El Nacimiento de Venus"));
        inventario.listarReplicas();
        System.out.println("--------------------------");
        //Se espera el inventario vacio
        System.out.println("Inventario 2");
        Inventario inventario2 = new Inventario();
        assertEquals("No se encontró la obra en el inventario",inventario2.venderReplica("La Creación de Adán"));
        inventario2.listarReplicas();
        System.out.println("--------------------------");

        //Se disminuye la cantidad de una obra
        System.out.println("Inventario 3");
        Inventario inventario3 = new Inventario();
        inventario3.agregarReplica("La Persistencia de la Memoria");
        inventario3.agregarReplica("El beso");
        inventario3.agregarReplica("Gioconda");
        inventario3.agregarReplica("Gioconda");
        inventario3.venderReplica("Gioconda");
        inventario3.listarReplicas();
        System.out.println("--------------------------");
        System.out.println("Inventario 4");
        Inventario inventario4 = new Inventario();
        inventario4.agregarReplica("Gioconda");
        System.out.println(inventario4.venderReplica("La Creación de Adán"));
        inventario4.listarReplicas();

    }
}