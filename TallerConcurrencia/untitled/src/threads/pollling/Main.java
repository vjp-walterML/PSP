package threads.pollling;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> messages = List.of("message1", "message2", "message3", "message4");

        Thread.currentThread().setName("thread1");

        long startTime = System.currentTimeMillis();

        Thread thread2 = new Thread(() -> {
            Thread.currentThread().setName("thread2");
            print("Iniciando trabajo");
            try {
                for (String msg : messages) {
                    Thread.sleep(4000);
                    print(msg);
                }
                print("Fin de las tareas");
            } catch (InterruptedException e) {
                print("Hilo interrumpido");
            }
        });

        thread2.start();

        while (){

        }

//        MINUTO 46:18
    }

    static void print(String message) {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + ": " + message);
    }
}
