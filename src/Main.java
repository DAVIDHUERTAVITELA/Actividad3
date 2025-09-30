import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n1: Mezclar | 2: Primera carta | 3: Carta al azar | 4: Arreglo 5 cartas ");
        System.out.printf("Eliga la opcion que desea: ");

        Scanner scanner = new Scanner(System.in);   //Ingresar la opcion deseada
        int opc = scanner.nextInt();                //en base al menu de opciones

        Deck deck = new Deck();         //Creacion del conjunto de cartas. Se crea el objeto Deck, que es el contenedor,
                                        //se ejecuta la estructura Deck y se crea un ArrayList y se generan las 52 cartas conforme a sus especificaciones.
                                        //Ahora deck contiene todas las cartas listas para usarse.

        do {                            //Ciclo HACER-MIENTRAS, para ejecutar 1 vez y despues considerar la condicion de repetibilidad
            switch (opc){               //Evaluacion de opcion ingresada, para los metodos definidos en Deck
                case 1:
                    deck.shuffle();     //Metodo mezclar
                    break;
                case 2:
                    deck.head();        //Metodo mostrar primera y removerla
                    break;
                case 3:
                    deck.pick();        //Metodo seleccionar una aleatoria y mostrarla, ademas de removerla
                    break;
                case 4:
                    deck.hand();        //Metodo de 5 mostradas y  removidas
                    break;
                case 5:                 //Para salir del ciclo y por ende del programa
                    System.out.println("\nSaliendo...");
                    break;
                default:
                    System.out.println("\nError"); //En caso de seleccionar una opcion invalida, muestra el mensaje
                    break;
            }

            //Solicita la proxima accion, que evaluara el ciclo HACER-MIENTRAS
            System.out.println("\n1: Mezclar | 2: Primera carta | 3: Carta al azar | 4: Arreglo 5 cartas | 5: Salir ");
            System.out.printf("Ahora que desea: ");

            opc = scanner.nextInt(); //LEER opcion deseada

        } while(opc>=1 && opc<5);

        if (opc==5){                          //SI se selecciona un numero igual que 5, qes la salida
            System.out.println("\nSaliendo...");   //Muestra el siguiente mensaje
        }

        if (opc>5){                          //SI se selecciona un numero mayor que 5, que no forma parte de las opciones
           System.out.println("\nError");   //Muestra el siguiente mensaje
        }
    }
}

//TERMINA EL PROGRAMA