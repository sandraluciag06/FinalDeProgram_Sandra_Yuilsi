package Medidas;

public class Position {
    private double x;
    private double y;

    public Position (int x, int y){
        this.x = x;
        this.y = y;
    }
    public  int intx(){
        return (int) Math.round(x);

    }
    public  int inty(){

        return (int) Math.round(y);
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void aplicar(Movimiento movimiento) {
        Vector2D vector = movimiento.getVector();
        x += vector.getX();
        y += vector.getY();
    }
}
