import java.util.Scanner;

/**
 * Exercici 11. Invertir el contingut de l'array
 * Inverteix el mateix array intercanviant els valors simètrics.
 */
public class Exercici_11 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int[] dades = new int[7];

        System.out.println("Introdueix 7 enters:");
        for (int i = 0; i < dades.length; i++) {
            System.out.print("Enter de la posició " + i + ": ");
            dades[i] = lector.nextInt();
        }

        for (int i = 0; i < dades.length / 2; i++) {
            int temporal = dades[i];
            int indexOposat = dades.length - 1 - i;
            dades[i] = dades[indexOposat];
            dades[indexOposat] = temporal;
        }

        System.out.println("Array invertit:");
        for (int i = 0; i < dades.length; i++) {
            System.out.println(dades[i]);
        }

        lector.close();
    }
}
