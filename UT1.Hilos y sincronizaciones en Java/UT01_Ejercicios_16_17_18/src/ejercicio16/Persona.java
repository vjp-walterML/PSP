package ejercicio16;

import java.util.Random;

public class Persona extends Thread {
    private Wc wc;
    private String nombre;

    //    Constructor
    public Persona(Wc wc, String nombre) {
        this.wc = wc;
        this.nombre = nombre;
    }

    //    Métodos propios
    public int tiempoAleatorio() {
//        Este método retorna una cantidad aleatoria de ms entre 5 y 20ms
        return new Random().nextInt((20 + 1) - 5) + 5;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
//        Entrar
            wc.entrar(this);
//        Tiempo aleatorio dentro
            try {
                sleep(tiempoAleatorio());
            } catch (InterruptedException e) {
                //Nada
            }
//        Salir
            wc.salir(this);
//        Espera de 50ms después de ir al baño
            try {
                sleep(500);
            } catch (InterruptedException e) {
                //Nada
            }
        }
    }
}
