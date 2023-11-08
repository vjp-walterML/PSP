package filosofosCorregir;

public class Filosofo extends Thread {
    private String nombre;
    private Palillo palilloIzquierdo;
    private Palillo palilloDerecho;

    public Filosofo(String nombre, Palillo palilloIzquierdo, Palillo palilloDerecho) {
        this.nombre = nombre;
        this.palilloIzquierdo = palilloIzquierdo;
        this.palilloDerecho = palilloDerecho;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(300);//Pensar
        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
        }
        //Comer
        comer();
    }

    private void comer() {
        try {
            cogerPalillos();
            System.out.println("\t" + nombre + " está comiendo.");
            Thread.sleep(500);//Duerme simulando que come
            dejarPalillos();
        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
        }
    }

    private void cogerPalillos() {
        palilloIzquierdo.coger();
        palilloDerecho.coger();
        System.out.println(nombre + " coge los palillos.");
    }

    private void dejarPalillos() {
        palilloIzquierdo.dejar();
        palilloDerecho.dejar();
        System.out.println("\t\t" + nombre + " suelta los palillos.");
    }

    //    private void cogerPalillos() {
//        while (true) {
//            palilloIzquierdo.coger();
//            //Si no esta cogido el palillo derecho
//            if (!palilloDerecho.estaTomado()) {
//                palilloDerecho.coger();//Cojo
//                System.out.println(nombre + " coge los palillos.");
//                return;//Salgo del método
//            } else {
//                //Suelto el palillo izquierdo
//                palilloIzquierdo.dejar();
//                try {
//                    //Espero para volver a intentar
//                    Thread.sleep(new Random().nextInt(100) + 23);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }
//    }
}
