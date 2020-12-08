package Personaje;

import controller.Controller;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Jugador extends MovimientoPersonaje {


    public Jugador(Controller controller){
        super(controller);

    }
    @Override
    public void update() {
    super.update();

    }

    @Override
    public Image getSprite() {
        BufferedImage image = new BufferedImage(size.getWidth(),size.getHeight(),BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = image.createGraphics();

        graphics.setColor(Color.BLUE);
        graphics.fillRect(0,0, size.getWidth(), size.getHeight());

        graphics.dispose();


        return image;
    }
}
