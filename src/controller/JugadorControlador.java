package controller;


import teclas.Input;

import java.awt.event.KeyEvent;

public class JugadorControlador implements Controller {
    private Input input;
    public JugadorControlador(Input input){
        this.input = input;
    }


    @Override
    public boolean solicitaArriba() {
        return input.isPressed(KeyEvent.VK_UP);
    }

    @Override
    public boolean solicitaAbajo() {
        return input.isPressed(KeyEvent.VK_DOWN);
    }

    @Override
    public boolean solicitaIzquierda() {
        return input.isPressed(KeyEvent.VK_LEFT);
    }

    @Override
    public boolean solicitaDerecha() {
        return input.isPressed(KeyEvent.VK_RIGHT);
    }
}
