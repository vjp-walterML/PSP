package ejercicio18_solucion;

public class Estanquero extends Thread {
    Banyo banyo;

    public Estanquero(Banyo _banyo) {
        this.banyo = _banyo;
    }

    @Override
    public void run() {
        while (true) {
            banyo.reponer();
        }
    }
}
