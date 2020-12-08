package Personaje;

import Medidas.Position;
import Medidas.Size;

import java.awt.*;

public abstract class ObjetoJuego {

    protected Position position;
    protected Size size;

    public ObjetoJuego(){
        position = new Position(50,50);
        size = new Size(50,50);

    }

    public Position getPosition() {
        return position;
    }

    public Size getSize() {
        return size;
    }

    public abstract void update();
    // Todos los objetos del juegos proveen sus propios gráficos
    public abstract Image getSprite();
}
