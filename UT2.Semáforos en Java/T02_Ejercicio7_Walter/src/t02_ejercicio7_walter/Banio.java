package t02_ejercicio7_walter;

import java.util.concurrent.Semaphore;

public class Banio {

    //Variables globales
    private int personasDentro;
    private boolean limpiezaBanio;
    private Semaphore entrarBanio;
    private Semaphore mutex;

    public Banio() {
        personasDentro = 0;
        limpiezaBanio = false;
        this.entrarBanio = new Semaphore(0, true);
        this.mutex = new Semaphore(1, true);
    }

    public void usarBanio(Persona persona) throws InterruptedException {
        System.out.println(persona.getNombre()+" quiere entrar en el baño");
        if (!limpiezaBanio){
            mutex.acquire();
            personasDentro++;
            System.out.println(persona.getNombre()+" está utilizando el baño");
            mutex.release();
        }


    }

    public void limpiarBanio(Empleado empleado) throws InterruptedException {


    }
}
