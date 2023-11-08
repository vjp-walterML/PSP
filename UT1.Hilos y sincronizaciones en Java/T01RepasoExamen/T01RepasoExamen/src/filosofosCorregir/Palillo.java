package filosofosCorregir;

public class Palillo {
    private boolean estaTomado = false;

    public boolean estaTomado() {
        return estaTomado;
    }

    public synchronized void coger() {
        while (estaTomado) {
            try {
                wait();//Espero
            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
            }
        }
        estaTomado = true;
    }

    public synchronized void dejar() {
        estaTomado = false;
        notifyAll();
    }

}
