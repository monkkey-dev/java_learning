import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        ejercicio3();
        }

    /**
     * Ejercicio 1: Positivo o negativo.
     */    
    public static void ejercicio1() {
        Scanner number = new Scanner(System.in);
        System.out.println("¿Que numero quieres comprobar?");
        int receivedNumber = number.nextInt();

        if (receivedNumber > 0) {
            System.out.println("Positivo");
        } else if (receivedNumber < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("El numero es 0.");
        }
    }

    /**
     * Ejercicio 2: Mayor o menor que
     */
    public static void ejercicio2() {
        Scanner number = new Scanner(System.in);
        System.out.println("Cual es el primer numero");
        int receivedNumber1 = number.nextInt();
        System.out.println("Cual es el segundo");
        int receivedNumber2 = number.nextInt();

        if (receivedNumber1 > receivedNumber2) {
            System.out.println(receivedNumber1 + " es mayor que " + receivedNumber2);
        } else if (receivedNumber1 < receivedNumber2) {
            System.out.println(receivedNumber1 + " es menor que " + receivedNumber2);
        } else if (receivedNumber1 == receivedNumber2 ){
            System.out.println(receivedNumber1 + " es igual a " + receivedNumber1);
        }
        }

    /**
     * Ejercicio 3: pide una nota de 0 a 100, si esta entre 90-100 sea a... y si es 0 a 60f
      */

    public static void ejercicio3() {
        Scanner number = new Scanner(System.in);
        System.out.println("¿Qué nota?");
        int getMark = number.nextInt();

        if (getMark >= 0 && getMark < 50) {
            System.out.println("La nota es F.");
        } else if (getMark >= 50 && getMark < 60) {
            System.out.println("La nota es E.");
        } else if (getMark >= 60 && getMark < 70) {
            System.out.println("La nota es D.");
        } else if (getMark >= 70 && getMark < 80) {
            System.out.println("La nota es C.");
        } else if (getMark >= 80 && getMark < 90) {
            System.out.println("La nota es B.");
        } else if (getMark >= 90 && getMark <= 100) {
            System.out.println("La nota es A.");
        } else if (getMark > 100) {
            System.out.println("La nota tiene que estar en un rango de 0 a 100.");
        } else if (getMark < 0) {
            System.out.println("Ya me jodería que se me dieran tan mal las matemáticas...");
        }

    }
}

