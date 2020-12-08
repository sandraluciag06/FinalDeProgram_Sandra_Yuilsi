import juego.Bucle_juego;
import juego.Juego;

public class Principal {
    public static void main(String[] args){
       //ventana_juego display = new ventana.Ventana_juego( 800, 600);
    new Thread(new Bucle_juego(new Juego( 800,   600)
    )).start();
    }
}
