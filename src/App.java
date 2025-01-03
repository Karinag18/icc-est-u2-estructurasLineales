


import Controller.MenuController;
import Ejercicio_01_sign.SignValidator;
import Ejercicio_02_sorting.StackSorter;
import Materia.Queues.Queue;
import Materia.Queues.QueueGeneric;

import Models.Pantalla;

import Ejercicio_01_sign.*;
import Ejercicio_02_sorting.*;
import Materia.Stacks.StackGeneric;

public class App {
    public static void main(String[] args) throws Exception {
        //runContactMannager();
        //runStack();
        //runStackGeneric();
        //runQueue();
        //runQueueGeneric();

        System.out.println("╔═════════════════════════════════════════════════════╗");
        System.out.println("║                  Validación de Signos               ║");
        System.out.println("╚═════════════════════════════════════════════════════╝");
        runEjercicio1();
        System.out.println("╔═════════════════════════════════════════════════════╗");
        System.out.println("║                    Ordenar un Stack                ║");
        System.out.println("╚═════════════════════════════════════════════════════╝");
        runEjercicio2();
        System.out.println("╚═════════════════════════════════════════════════════╝");
        
    }

    public static void runStack() {
        //Instanciar la clase
        /*Stack stack = new Stack();
        

        //Agregar elementos a la pila
        stack.push(5);
        stack.push(7);
        stack.push(12);
        stack.push(23);

        // Imprimir la pila usando printStack
        System.out.println("Contenido de la pila:");
        stack.printStack();
        System.out.println(""); // Esto imprimira directamente los elementos de la pila

        // Obtener y mostrar el tamaño de la pila
        System.out.println("Tamaño de la pila: " + stack.getSize());


        //Mostrar elementos de la pila
        System.out.println("Cima   -> "+ stack.peek());
        System.out.println("Retirar-> "+ stack.pop());
        System.out.println("Cima   -> "+ stack.peek());
        System.out.println("Retirar-> "+ stack.pop());
        System.out.println("Cima   -> "+ stack.peek());
*/
        
    }
    public static void runStackGeneric() {
        StackGeneric<Pantalla> router = new StackGeneric<>();

        router.push(new Pantalla(1, "Home Page", "/home"));
        router.push(new Pantalla(1, "Menu Page", "/home/menu"));
        router.push(new Pantalla(1, "Users Page", "/home/menu/users"));

        System.out.println("Estoy en " + router.peek().getRuta());
        System.out.println("Regreso a " + (router.popNode().getNext().getValue()).getRuta());
        System.out.println("Estoy en " + router.peek().getRuta());
        
        router.push(new Pantalla(1,"Settings Page","/home/menu/setting"));

        System.out.println("Pantallas = " + router.getSize());
        System.out.println("Estoy en " + router.peek().getRuta());
        router.printStack();


        
        
        
    }

    public static void runQueue() {
        Queue cola = new Queue();
        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);
        cola.enqueue(40);

        System.out.println("Contenido de la cola:");
        cola.printQueue();
        System.out.println("Tamaño de la cola: " + cola.getSize());
        System.out.println("Elemento en el frente: " + cola.peek());
        System.out.println("Desencolado: " + cola.dequeue());
        System.out.println("Contenido de la cola después de desencolar:");
        cola.printQueue();
        
    }

    public static void runQueueGeneric() {
        QueueGeneric<String> colaGen = new QueueGeneric<>();
        colaGen.enqueue("Primero");
        colaGen.enqueue("Segundo");
        colaGen.enqueue("Tercero");
        colaGen.enqueue("Cuarto");

        System.out.println("Contenido de la cola genérica:");
        colaGen.printQueue();
        System.out.println("Tamaño de la cola genérica: " + colaGen.getSize());
        System.out.println("Elemento en el frente: " + colaGen.peek());
        System.out.println("Desencolado: " + colaGen.dequeue());
        System.out.println("Contenido de la cola genérica después de desencolar:");
        colaGen.printQueue();
    }

    private static void runContactMannager() {
        MenuController menuController = new MenuController();
        menuController.showMenu();
    }

    private static void runEjercicio1() {
        String input1 = "([]){}";
        String input2 = "({)}";
    
        // Validar los signos
        System.out.println("╔═════════════════════════════════════════════════════╗");
        System.out.println("║ Ejemplo cuando es Valido '([]){}' " + SignValidator.isValid(input1)); // true
        System.out.println("║ Ejemplo cuando es Invalido'({)}'" + SignValidator.isValid(input2)); // false
        System.out.println("╚═════════════════════════════════════════════════════╝");
    }
    
    private static void runEjercicio2() {
        StackGeneric<Integer> stack = new StackGeneric<>();
    
        // Agregar elementos a la pila
        stack.push(2);
        stack.push(4);
        stack.push(1);
        stack.push(5);
    
        // Mostrar la pila antes de ordenar
        System.out.println("╔═════════════════════════════════════════════════════╗");
        System.out.println("║ Pila antes de ordenar: ");
        stack.printStack();
        System.out.println("╚═════════════════════════════════════════════════════╝");
    
        // Ordenar la pila
        StackSorter.sort(stack);
    
        // Mostrar la pila después de ordenar
        System.out.println("╔═════════════════════════════════════════════════════╗");
        System.out.println("║ Pila después de ordenar: ");
        stack.printStack();
        System.out.println("╚═════════════════════════════════════════════════════╝");
    }
    
}
