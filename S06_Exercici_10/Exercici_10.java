import java.util.Scanner;

/**
 * Exercici 10. Sumar dos arrays casella a casella
 * Desa les sumes dels elements corresponents en un tercer array.
 */
public class Exercici_10 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];
        int[] resultat = new int[5];

        System.out.println("Introdueix 5 enters per a l'array A:");
        for (int i = 0; i < a.length; i++) {
            System.out.print("Valor d'A a la posició " + i + ": ");
            a[i] = lector.nextInt();
        }

        System.out.println("Introdueix 5 enters per a l'array B:");
        for (int i = 0; i < b.length; i++) {
            System.out.print("Valor de B a la posició " + i + ": ");
            b[i] = lector.nextInt();
        }

        for (int i = 0; i < resultat.length; i++) {
            resultat[i] = a[i] + b[i];
        }

        System.out.println("Array A:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println("Array B:");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        System.out.println("Resultat de les sumes:");
        for (int i = 0; i < resultat.length; i++) {
            System.out.println(resultat[i]);
        }

        lector.close();
    }
}
