package t02_ejercicio7_walter;

import javax.xml.transform.Transformer;
import java.util.concurrent.Semaphore;

public class Banio {

    //Variables globales
    private int personasDentro;
    private boolean limpiezaBanio;
    private Semaphore entrarBanio;
    private Semaphore limpiarBanio;
    private Semaphore mutex;

    public Banio() {
        personasDentro = 0;
        limpiezaBanio = false;
        limpiarBanio = new Semaphore(0);
        entrarBanio = new Semaphore(0, true);
        mutex = new Semaphore(1);
    }

    public void usarBanio(Persona persona) throws InterruptedException {
        System.out.println(persona.getNombre() + " quiere entrar en el baño");
        //ENTRAR====================================================================
        if (limpiezaBanio) {
            System.out.println("\tXX" + persona.getNombre() + " está esperando a que terminen de limpiar");
            entrarBanio.acquire();
        }
        mutex.acquire();
        personasDentro++;
        System.out.println(persona.getNombre() + " está utilizando el baño");
        mutex.release();
        Thread.sleep(2000);//MEA

        //SALIR====================================================================
        mutex.acquire();
        personasDentro--;
        mutex.release();
        if (limpiezaBanio && personasDentro == 0) {
            System.out.println("\t\t\t\t=>" + persona.getNombre() + " es el/la último/a en abandonar el baño,avisa al limpiador");
            limpiarBanio.release();
        } else {
            System.out.println("\t\t\t\t=>" + persona.getNombre() + " abandona el baño");
        }
    }

    public void limpiarBanio(Empleado empleado) throws InterruptedException {
        mutex.acquire();
        System.out.println("--" + empleado.getNombre() + " pone el cartel para limpiar el baño");
        limpiezaBanio = true;//Activo bandera limpieza
        mutex.release();
        limpiarBanio.acquire();
        System.out.println("\tXX Limpiando baño");
        Thread.sleep(2000);
        mutex.acquire();
        System.out.println("\t\t\tBaño limpio");
        limpiezaBanio = false;
        mutex.release();
        entrarBanio.release();//Desbloqueo entrar al baño
    }
}
