package juego;/* Función de la clase bucle de juego:
El bucle del juego en sí es un bucle infinito controlado que hace que tu juego siga funcionando; Es el lugar donde todas
 sus pequeñas piezas se actualizarán y dibujarán en la pantalla...
El bucle de juego es el código central de tu juego, dividido en diferentes partes.
En general, estos son: inicializar, actualizar y dibujar.*/

import juego.Juego;

public class Bucle_juego implements Runnable{

    private Juego juego;

    private boolean corriendo;
    private final double updateRate = 1.0d/60.0d;
    private long nextStatTime;
    private int fps, aps; //actualizaciones por segundo

    public Bucle_juego(Juego juego){
        this.juego = juego;
    }

    @Override
    public void run() {
        corriendo = true;
        double accumulator = 0;
        //Para verificar cuál tiempo es el actual y cuál desde la última puesta en marcha
        long currentTime, lastUpdate = System.currentTimeMillis();
        nextStatTime = System.currentTimeMillis() + 1000;


        while(corriendo) {
            currentTime = System.currentTimeMillis();
            double lastRenderTimeInSeconds = (currentTime - lastUpdate) / 1000d;
            accumulator += lastRenderTimeInSeconds;
            lastUpdate = currentTime;

            if(accumulator >= updateRate) {
                while (accumulator > updateRate) {
                    update();
                    accumulator -= updateRate;

                }
                render();
                printStats();
            }

        }
    }
    private void printStats(){
        if(System.currentTimeMillis() > nextStatTime){
            System.out.println(String.format("FPS: %d, APS: %d", fps,aps));
            fps = 0;
            aps= 0;
            nextStatTime = System.currentTimeMillis() + 1000;
        }
    }
    private void render(){
        juego.render();
        fps++;

    }
    private void update(){
       juego.update();
        aps++;
    }
}
