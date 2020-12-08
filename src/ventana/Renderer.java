package ventana;

import juego.Juego;

import java.awt.*;

public class Renderer {
    public void render(Juego juego, Graphics graphics){

        juego.getObjetosJuego().forEach(objetoJuego-> graphics.drawImage(
                objetoJuego.getSprite(),
                objetoJuego.getPosition().intx(),
                objetoJuego.getPosition().inty(),
                null));
    }
}
