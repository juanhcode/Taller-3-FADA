package punto2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventarioTest {

    @Test
    void agregarReplica() {
        Inventario inventario = new Inventario();
        inventario.agregarReplica("Gioconda");
        inventario.agregarReplica("El beso");
        inventario.agregarReplica("El beso");
        inventario.agregarReplica("La última cena");
        inventario.agregarReplica("La joven de la perla");
        inventario.agregarReplica("El beso");
        inventario.listarReplicas();
    }

    @Test
    void listarReplicas() {
        Inventario inventario = new Inventario();
        inventario.agregarReplica("Gioconda");
        inventario.agregarReplica("El beso");
        inventario.agregarReplica("El beso");
        inventario.agregarReplica("La última cena");
        inventario.agregarReplica("La joven de la perla");
        inventario.agregarReplica("Guernica");
        inventario.agregarReplica("El beso");
        inventario.agregarReplica("La joven de la perla");
        inventario.listarReplicas();
    }

    @Test
    void venderReplica() {
        Inventario inventario = new Inventario();
        inventario.agregarReplica("Gioconda");
        inventario.agregarReplica("El beso");
        inventario.agregarReplica("Gioconda");
        assertEquals("No se encontró la obra en el inventario",inventario.venderReplica("Siu"));
        inventario.listarReplicas();
    }
}