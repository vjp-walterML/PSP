package filosofosCorregir;


public class Mesa {
    public static void main(String[] args) throws InterruptedException {
        //Creo palillos
        Palillo palillo1 = new Palillo();
        Palillo palillo2 = new Palillo();
        Palillo palillo3 = new Palillo();
        Palillo palillo4 = new Palillo();
        Palillo palillo5 = new Palillo();
        //Creo filósofos con sus respectivos palillos
//        Filosofo filosofo1 = new Filosofo("Socrates", palillo1, palillo2);
//        Filosofo filosofo2 = new Filosofo("Kant", palillo2, palillo3);
//        Filosofo filosofo3 = new Filosofo("Locke", palillo3, palillo4);
//        Filosofo filosofo4 = new Filosofo("Aristóteles", palillo4, palillo5);
//        Filosofo filosofo5 = new Filosofo("Hegel", palillo5, palillo1);

        Filosofo filosofo1 = new Filosofo("filosofo1", palillo1, palillo2);
        Filosofo filosofo2 = new Filosofo("filosofo2", palillo2, palillo3);
        Filosofo filosofo3 = new Filosofo("filosofo3", palillo3, palillo4);
        Filosofo filosofo4 = new Filosofo("filosofo4", palillo4, palillo5);
        Filosofo filosofo5 = new Filosofo("filosofo5", palillo5, palillo1);

        filosofo1.start();
        filosofo2.start();
        filosofo3.start();
        filosofo4.start();
        filosofo5.start();

        filosofo1.join();
        filosofo2.join();
        filosofo3.join();
        filosofo4.join();
        filosofo5.join();

        System.out.println("PROGRAMA FINALIZADO");
    }
}
