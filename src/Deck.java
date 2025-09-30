import java.util.ArrayList;     //Permite usar la clase Arreglo, para listas dinamicas
import java.util.Collections;   //Permite usar la clase Collection, para metodos estaticos en la manipulacion de colecciones de listas, conjuntos, etc.
import java.util.Random;        //Permite usar la clase Random, para generar numeros pseudoaleatorios

public class Deck {

    private ArrayList<Card> cards;  //Declaracion de variable de lista de objetos del tipo Card, en privada
    private Random random;          //Declaracion de una variable para la generacion de numeros pseudoaleatorios

    public Deck() {                 //Estructura
        cards = new ArrayList<>();  //Se declara y crea una variable que contendra un ArrayLit vacio para almacenar datos especificos
        random = new Random();      //Inicia un generador de números pseudoaleatorios, para ser usado en metodos para obtener estos datos

        launchDeck();               //Ejecutar metodo de las cartas del poker
    }

    private void launchDeck() {     //Creacion de las 52 cartas de Poker

        String[] palos = {"♣", "♥", "♠", "♦"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

        for (String palo : palos) { //Para cada String palo que se encuentre en la coleccion palos. RECORRER
            String color = (palo.equals("♥") || palo.equals("♦")) ? "Rojo" : "Negro";   //Operador ternario, tres operandos: condicion booleana ? valor verdadero-falso (expresion ejecutada)

            for (String valor : valores) {                  //Para cada String valor que se encuentre en la coleccion valores. RECORRER
                cards.add(new Card(palo, color, valor));    //Creacion objeto de clase Card, recibe 3 parametros. Añade la configuracion de parametros ingresados al ArrayList cards
            }
        }
    }

    //Opc. 1. Mezclar el deck
    public void shuffle() {
        Collections.shuffle(cards);     //De Collections (metodos estaticos para usar listas), desordena "shuffle" la lista cards

        System.out.println("\nSe mezcló el Deck.");
    }

    //Opc. 2. Mostrar la primera carta del deck y removerla de este
    public void head() {
        if (!cards.isEmpty()) {                     //SI la lista cards NO se encuentra vacia
            Card carta = cards.remove(0);     //Remueve o quita el  primer elemento de la lista cards, es decir la posicion 0

            System.out.println("\n" +carta);              //Muestra la carta removida
            System.out.println("Quedan " +cards.size()+ " cartas."); //Remanentes
        }
    }

    //Opc. 3. Seleccionar una carta al azar del deck y removerla de este
    public void pick() {
        if (!cards.isEmpty()) {                         //SI la lista cards NO se encuentra vacia
            int index = random.nextInt(cards.size());   //Elige un numero aleatorio valido dentro de la cantidad de cartas, para despues guardarlo en index

            Card carta = cards.remove(index);           //Remueve o quita el elemento de la lista cards por el numero definido, es decir la posicion obtenida de index

            System.out.println("\n" +carta);                  //Muestra la carta removida
            System.out.println("Quedan " +cards.size()+ " cartas."); //Remanentes
        }
    }

    //Opc. 4. Regresar un arreglo de cinco cartas
    public void hand() {
        if (cards.size() >= 5) {                        //SI la cantidad de cartas es igual o mayor que 5
            System.out.println("");

            for (int i=0; i<5; i++){                   //PARA mostrar del elemento 0 al 4 (5 elementos)
                Card carta = cards.remove(0);     //Remueve el elemento que se esta ejecutando al momento, que siempre tendra posicion 0

                System.out.println(carta);              //Muestra la carta removida
            }

            System.out.println("Quedan " +cards.size()+ " cartas."); //Remanentes
        }
        else {                                           //SINO se cumple la condicion, es decir, hay meos de 5 cartas restantes
            System.out.println("\nNo hay suficientes cartas para mostrar.");
        }
    }
}