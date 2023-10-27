package ejercicio16;

public class Persona extends Thread {
    private Wc wc;
    private String nombre;

//    Constructor
    public Persona(Wc wc, String nombre) {
        this.wc = wc;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        //ACCIONES
    }
}
