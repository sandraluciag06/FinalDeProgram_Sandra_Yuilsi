package ventana;

import com.sun.org.apache.xpath.internal.objects.XNumber;
import juego.Juego;
import sun.reflect.annotation.EnumConstantNotPresentExceptionProxy;
import teclas.Input;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

public class Ventana_juego extends JFrame {

    private Canvas canvas;
    private Renderer renderer;

    public Ventana_juego (int width, int height, Input input){
        //titulo:
        setTitle("Sandra y Yuilsi juego super increíble");
        //Para cerrar el JFrame y que no se quede ejecutando el programa
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        this.renderer = new Renderer();

        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width, height));
        canvas.setFocusable(false);
        add(canvas);
        addKeyListener(input);
        pack();

//Buffer sirve para dibujar continuamente y que siempre se esté mostrando
        //en pantalla la imagen
        canvas.createBufferStrategy(
                3
        );

        setLocationRelativeTo(null);
        setVisible(true);

    }
    public void  render (Juego juego){
        BufferStrategy  bufferStrategy = canvas.getBufferStrategy();
        Graphics graphics = bufferStrategy.getDrawGraphics();

        graphics.setColor(Color.black);
        graphics.fillRect(0,0, canvas.getWidth(), canvas.getHeight());

        renderer.render(juego,graphics);

        graphics.dispose();
        bufferStrategy.show();

    }

}
