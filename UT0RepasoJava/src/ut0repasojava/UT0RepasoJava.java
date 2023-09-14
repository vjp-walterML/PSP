package ut0repasojava;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author wmartinl01
 */
public class UT0RepasoJava {

    final static int IVA = 21;

    public static void main(String[] args) {
        int opcion;
        do {
            opcion = pedirEntero("Introduce el número de ejercicio:");
            switch (opcion) {
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    ejercicio4();
                    break;
                case 5:
                    ejercicio5();
                    break;
                case 6:
                    ejercicio6();
                    break;
                case 7:
                    ejercicio7();
                    break;
                case 8:
                    ejercicio8();
                    break;
                case 9:
                    ejercicio9();
                    break;
                case 10:
                    ejercicio10();
                    break;
                case 11:
                    ejercicio11();
                    break;
                case 12:
                    ejercicio12();
                    break;
                case 13:
                    ejercicio13();
                    break;
                case 14:
                    ejercicio14();
                    break;
                case 15:
                    break;
                case 16:
                    break;
                case 17:
                    break;
                case 18:
                    break;
                default:
                    System.out.println("ERROR.INTRODUCE UNA OPCION VALIDA.");
                    opcion = -1;
            }
        } while (opcion == -1);
    }

    public static int pedirEntero(String texto) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println(texto);
        try {
            opcion = entrada.nextInt();
        } catch (InputMismatchException e) {
            opcion = -1;
        }
        return opcion;

    }

    public static float pedirDecimal(String texto) {
        Scanner entrada = new Scanner(System.in);
        float opcion;
        System.out.println(texto);
        try {
            opcion = entrada.nextFloat();
        } catch (InputMismatchException e) {
            opcion = -1;
        }
        return opcion;

    }

    public static String pedirCadena(String texto) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(texto);
        return entrada.nextLine();
    }

    // EJERCICIO 1
    public static void ejercicio1() {
        int a = 4;
        int b = 2;
        int resultado;
        System.out.println("Declaramos 2 variables, una con valor 4 y otra con valor 2.");
        resultado = a + b;
        System.out.println("Suma: " + resultado);
        resultado = a - b;
        System.out.println("Resta: " + resultado);
        resultado = a * b;
        System.out.println("Multiplicación: " + resultado);
        resultado = a / b;
        System.out.println("Division: " + resultado);
        resultado = a % b;
        System.out.println("Resto: " + resultado);
    }

    //EJERCICIO 2
    public static void ejercicio2() {
        System.out.println("Declaramos 2 variables a y b, una con valor 6 y otra con valor 4.");
        int a = 6;
        int b = 4;

        if (a > b) {
            System.out.println("La variable a es mayor a b.");
        } else {
            System.out.println("La variable b es mayor a a.");
        }

        System.out.println("Ahora la variable a valdrá 1 y la variable b 9");
        a = 1;
        b = 9;

        if (a > b) {
            System.out.println("La variable a es mayor a b.");
        } else {
            System.out.println("La variable b es mayor a a.");
        }
    }

    //EJERCICIO 3
    public static void ejercicio3() {
        System.out.println("Declara un String que contenga tu nombre, después muestra un mensaje de\n"
                + "bienvenida por consola. Por ejemplo: si introduzco “Marcos”, me aparece “Bienvenido\n"
                + "Marcos”.");
        String nombre = "Walter";
        System.out.println("Bienvenido " + nombre);
    }

    //EJERCICIO 4
    public static void ejercicio4() {
        System.out.println("Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir\n"
                + "(haz uso de la librería java.util.Scanner).");
        String nombre = pedirCadena("Introduce un nombre:");
        System.out.println("Bienvenido " + nombre);
    }

    //EJERCICIO 5
    public static void ejercicio5() {
        System.out.println("Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es,\n"
                + "también debemos indicarlo.");
        int numero = pedirEntero("Introduce un número:");
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + ", es divisible por dos.");
        } else {
            System.out.println("El número " + numero + ",no es divisible por dos.");
        }
    }

    //EJERCICIO 6
    public static void ejercicio6() {
        System.out.println("Lee un número por teclado que pida el precio de un producto (puede tener decimales)\n"
                + "y calcule el precio final con IVA. El IVA será una constante que será del 21%.");
        float precio = pedirDecimal("Por favor, introduce un precio: ");
        precio += (precio * IVA);
        System.out.println("El precio incluido IVA es: " + precio);
    }

    //EJERCICIO 7
    public static void ejercicio7() {
        System.out.println("Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.");
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }

    }

    //EJERCICIO 8
    public static void ejercicio8() {
        System.out.println("Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle for.");
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    //EJERCICIO 9
    public static void ejercicio9() {
        System.out.println("Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el\n"
                + "bucle que desees.");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    //EJERCICIO 10
    public static void ejercicio10() {
        System.out.println("Realiza una aplicación que nos pida un número de ventas a introducir, después nos\n"
                + "pedirá tantas ventas por teclado como número de ventas se hayan indicado. Al final\n"
                + "mostrará la suma de todas las ventas. Piensa que es lo que se repite y lo que no.");
        int numVentas = pedirEntero("Introduce el número de ventas: ");
        int resultado = 0;
        for (int i = 0; i < numVentas; i++) {
            resultado += pedirEntero("Venta " + (i + 1));
        }
    }

    //EJERCICIO 11
    public static void ejercicio11() {
        System.out.println("Lee un número por teclado y comprueba que este número es mayor o igual que cero,\n"
                + "si no lo es lo volverá a pedir (do while), después muestra ese número por consola.");
        int numero;
        do {
            numero = pedirEntero("Introduce un numero: ");
        } while (numero < 0);
        System.out.println("El numero es " + numero);
    }

    //EJERCICIO 12
    public static void ejercicio12() {
        System.out.println("Escribe una aplicación con un String que contenga una contraseña cualquiera.\n"
                + "Después se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes\n"
                + "ya no pedirá más la contraseña y mostrará un mensaje diciendo “Enhorabuena”.\n"
                + "Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden\n"
                + "intentos).");
        String psw = "walter";
        String pswUsuario;
        int intentos = 0;
        boolean correcta = false;
        do {
            pswUsuario = pedirCadena("Introduce una contraseña: ");
            if (pswUsuario.equals(psw)) {
                correcta = true;
            } else {
                intentos++;
            }
        } while (intentos < 3 && !correcta);

        if (correcta) {
            System.out.println("ENHORABUENA! CONTRASEÑA CORRECTA!");
        } else {
            System.out.println("Has superado el maximo numero de intentos.");
        }
    }

    //EJERCICIO 13
    public static void ejercicio13() {
        System.out.println("Crea una aplicación que nos pida un día de la semana y que nos diga si es un día\n"
                + "laboral o no. Usa un switch para ello.");
        String diaSemana = pedirCadena("Introduce un día de la semana: ");
        switch (diaSemana) {
            case "lunes":
                System.out.println("Es un dia laboral.");
                break;
            case "martes":
                System.out.println("Es un dia laboral.");
                break;
            case "miércoles":
                System.out.println("Es un dia laboral.");
                break;
            case "jueves":
                System.out.println("Es un dia laboral.");
                break;
            case "viernes":
                System.out.println("Es un dia laboral.");
                break;
            case "sábado":
                System.out.println("No es un dia laboral.");
                break;
            case "domingo":
                System.out.println("No es un dia laboral.");
                break;
            default:
                System.out.println("INTRODUCE UN DIA VÁLIDO");
        }
    }

    //EJERCICIO 14
    public static void ejercicio14() {
        System.out.println("Pide por teclado dos números y genera 10 números aleatorios entre esos números.\n"
                + "Usa el método Math.random para generar un número entero aleatorio (recuerda el\n"
                + "casting de double a int).");
        int num1 = pedirEntero("Introduce el primer numero:");
        int num2 = pedirEntero("Introduce el segundo numero:");
        int aux;
        for (int i = 0; i < 10; i++) {
            aux = (int) Math.round(Math.random() * (num2 - 1) + num1);
            System.out.println(aux);
        }

    }

    //EJERCICIO 15
    public static void ejercicio15() {

    }
}
