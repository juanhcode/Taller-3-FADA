package org.example;

import punto3.Pila;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        System.out.println("Clase PILA");
        Stack<Integer> pilaStack = new Stack<>();
        pilaStack.push(1);
        pilaStack.push(2);
        pilaStack.push(3);
        pilaStack.push(4);
        pilaStack.push(5);

        for (int numero: pilaStack) {
            System.out.println(numero);
        }

        System.out.println("Clase pila elemento eliminado");
        System.out.println(pilaStack.pop());

        System.out.println("Clase pila actualizada");
        for (int numero: pilaStack) {
            System.out.println(numero);
        }


        System.out.println("-----------------------------");


        System.out.println("PILA PERSONALIZADA");
        Pila<Integer> pila = new Pila<>(5);
        pila.pushPilaConColas(1);
        pila.pushPilaConColas(2);
        pila.pushPilaConColas(3);
        pila.pushPilaConColas(4);
        pila.pushPilaConColas(5);
        pila.mostrarPilaConColas();

        System.out.println("pila personalizada elemento eliminado");
        System.out.println(pila.popPilaConColas());

        System.out.println("pila personalizada actualizada");
        pila.mostrarPilaConColas();


    }
}