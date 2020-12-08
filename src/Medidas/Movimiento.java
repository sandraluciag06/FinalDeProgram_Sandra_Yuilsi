package Medidas;

import controller.Controller;

public class Movimiento {
    private Vector2D vector;
    private  double velocidad;

    public Movimiento(double velocidad) {
        this.velocidad = velocidad;
        this.vector = new Vector2D(0,0);
    }

    public void update(Controller controller){
        int deltaX= 0;
        int deltaY= 0;

        if(controller.solicitaArriba()){
            deltaY--;
        }
        if(controller.solicitaAbajo()){
            deltaY++;
        }
        if(controller.solicitaIzquierda()){
            deltaX--;
        }
        if(controller.solicitaDerecha()){
            deltaX++;
        }
        vector = new Vector2D(deltaX,deltaY);
        vector.normalizar();
        vector.multiply(velocidad);
        System.out.println(vector.length());
    }

    public Vector2D getVector() {
        return vector;
    }
}
