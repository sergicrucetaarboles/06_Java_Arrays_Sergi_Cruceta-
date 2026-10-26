import java.util.Scanner;

/**
 * Exercici 8. Modificar una casella amb un índex vàlid
 * Comprova l'índex abans de modificar una casella de l'array.
 */
public class Exercici_08 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int[] dades = new int[5];

        System.out.println("Introdueix 5 enters:");
        for (int i = 0; i < dades.length; i++) {
            System.out.print("Enter de la posició " + i + ": ");
            dades[i] = lector.nextInt();
        }

        System.out.print("Índex de la casella que vols modificar: ");
        int index = lector.nextInt();
        while (index < 0 || index >= dades.length) {
            System.out.println("Índex no vàlid");
            System.out.print("Torna a introduir l'índex: ");
            index = lector.nextInt();
        }

        System.out.print("Nou valor: ");
        dades[index] = lector.nextInt();

        System.out.println("Array final:");
        for (int i = 0; i < dades.length; i++) {
            System.out.println(dades[i]);
        }

        lector.close();
    }
}
