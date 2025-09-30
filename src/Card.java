public class Card {

    private String palo;        //Atributos definidos como
    private String color;       //las  propiedades de la carta
    private String valor;       //en privado (para esta clase)

    //Estructura para las cartas
    public Card(String palo, String color, String valor) {
        this.palo = palo;       //Atributo de la clase, con valor
        this.color = color;     //asignado recibido como parametro
        this.valor = valor;     //por sus caracteristicas (referencias)
    }

    //Metodo toString para imprimir en el formato solicitado, coherente y legible

   @Override                                       //Sobrescritura de subclase a superclase por metodo definido
   public String toString() {                      //Heredado de Object y se sobrescribe para imprimir en el formato solicitado
        return palo+ ", " +color+ ", " +valor;     //Formato de carta o presentacion
   }
}