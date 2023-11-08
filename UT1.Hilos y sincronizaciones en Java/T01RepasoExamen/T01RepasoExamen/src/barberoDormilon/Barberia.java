package barberoDormilon;

import java.sql.SQLOutput;

public class Barberia {

    private int numSillasSalaEspera;
    private int sillasOcupadas;
    private boolean sillaBarberoOcupada;

    public Barberia(int numSillasSalaEspera) {
        this.numSillasSalaEspera = numSillasSalaEspera;
        sillasOcupadas = 0;
        sillaBarberoOcupada = false;
    }


    public synchronized void entrar(Cliente cliente) {
        while (sillasOcupadas == numSillasSalaEspera) {
            try {
                System.out.println("Sala de espera llena, el cliente " + cliente.getNombre() + " abandona la peluquería.");
                wait(4000);//Si no hay sillas disponibles espero
            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
            }
        }
        if (sillaBarberoOcupada) {
            sentarseSalaEspera(cliente);
        } else {
            sillaBarberoOcupada = true;
            sillasOcupadas++;
            sentarseSillaBarbero(cliente);
        }
    }

    public synchronized void sentarseSalaEspera(Cliente cliente) {
        sillasOcupadas++;
        System.out.println("----El cliente " + cliente.getNombre() + " se sienta en la sala de espera. Sillas ocupadas: " + sillasOcupadas);
        while (sillaBarberoOcupada) {
            try {
                wait();//Espero mientras esté ocupada la silla del barbero
            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
            }
        }
        sentarseSillaBarbero(cliente);
    }

    public synchronized void sentarseSillaBarbero(Cliente cliente) {
        sillasOcupadas--;
        System.out.println("----El cliente " + cliente.getNombre() + " se sienta en la silla del barbero.Sillas ocupadas: " + sillasOcupadas);
        cortarPelo();
        System.out.println("\t\t\t El cliente " + cliente.getNombre() + " se va con el pelo cortado.");
        sillaBarberoOcupada = false;
        notifyAll();
    }

    public void cortarPelo() {
        try {
            System.out.println("Barbero cortando el pelo XXXX");
            Thread.sleep(5000);
            System.out.println("Barbero termina de cortar el pelo.");
        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
        }
    }
}
