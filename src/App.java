import java.util.Queue;
import java.util.LinkedList;

import Materia.Stack.Stack;
import Materia.Stack.StackGeneric;

public class App {
    public static void main(String[] args) throws Exception {
        runStack();
        runStackGeneric();
        runQueue();
    }

    public static void runStack() {
        Stack stack = new Stack();  

        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(20);

        System.out.println("Top -> " + stack.peek());
        System.out.println("Pop -> " + stack.pop());
        System.out.println("Top -> " + stack.peek());
        System.out.println("Pop -> " + stack.pop());
        System.out.println("Top -> " + stack.peek());
    }

    public static void runStackGeneric() {
        StackGeneric<Pantalla> router = new StackGeneric<>();

        router.push(new Pantalla(1, "Home Page", "/home"));
        router.push(new Pantalla(1, "Home Page", "/home/menu"));
        router.push(new Pantalla(1, "Home Page", "/home/menu/settings"));

        System.out.println("Estoy en " + router.peek().getRuta());
        System.out.println("Regreso a " + router.pop().getNext().getValue().getRuta());
        System.out.println("Estoy en " + router.peek().getRuta());

        router.push(new Pantalla(1, "Settings Page", "/home/menu/settings"));
        System.out.println("Pantallas = " + router.getSize());
        System.out.println("Estoy en " + router.peek().getRuta());
    }

    public static void runQueue() {

        Queue<Integer> cola = new LinkedList<>();
        cola.add(10);
        cola.add(20);
        cola.add(30);
        cola.add(40);

        System.out.println("Primer elemento en la cola: " + cola.peek());

        System.out.println("Eliminado: " + cola.remove());
        System.out.println("Eliminado: " + cola.remove());
        System.out.println("Siguiente elemento en la cola: " + cola.peek());
    }
}
