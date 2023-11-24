package t02_ejercicio9_walter;

public class Encargado extends Thread {
    //Atributos
    private String nombre;
    private Jaula jaula;

    //Constructor
    public Encargado(String nombre, Jaula jaula) {
        this.nombre = nombre;
        this.jaula = jaula;
    }

    //Getter nombre
    public String getNombre() {
        return nombre;
    }

    @Override
    public void run() {
        while (true) {
            jaula.reponerAlpiste(this);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
            }
        }
    }
}
