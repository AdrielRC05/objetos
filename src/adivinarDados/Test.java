package adivinarDados;

public class Test {
    public static void main(String[] args) {
        Juego juego1= new AdivinarNumero();
        Juego juego2= new Dados();

        //Adivinar el numero
        juego1.iniciar();
        juego1.jugar();
        juego1.finalizar();

        //Dados
        juego2.iniciar();
        juego2.jugar();
        juego2.finalizar();

        /*El código del ejercicio 4 sería coorecto, ya que ambas clases contienen
        la interfaz "Juegos", por lo que el programa se ejecutaría sin problemas*/
    }
}
