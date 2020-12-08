package juego;

import Personaje.Jugador;
import Personaje.ObjetoJuego;
import controller.JugadorControlador;
import teclas.Input;
import ventana.Ventana_juego;

import java.util.ArrayList;
import java.util.List;

public class Juego {


    private Ventana_juego ventana_juego;
    private List<ObjetoJuego>objetosJuego;
    private Input input;

    public Juego(int width, int height) {
        input = new Input();
        ventana_juego = new Ventana_juego(width, height, input);
       objetosJuego = new ArrayList<>();
       objetosJuego.add(new Jugador(new JugadorControlador(input)));


    }
    public void update(){
        objetosJuego.forEach(objetosJuego -> objetosJuego.update());
    }
    public void render(){

        ventana_juego.render(this);
    }

    public List<ObjetoJuego> getObjetosJuego() {
        return objetosJuego;
    }
}


