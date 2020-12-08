package Personaje;

import Medidas.Movimiento;
import controller.Controller;

public abstract class MovimientoPersonaje extends ObjetoJuego  {
    private Controller controller;
    private Movimiento movimiento;

    public MovimientoPersonaje(Controller controller){
        super();
        this.controller = controller;
        this.movimiento = new Movimiento(2);

    }
    @Override
    public  void  update(){
        movimiento.update(controller);
        position.aplicar(movimiento);
    }
}
