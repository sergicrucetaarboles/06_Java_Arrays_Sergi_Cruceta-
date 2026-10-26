import java.util.Scanner;

/**
 * Exercici 2. Llegir en un ordre i mostrar en l'ordre contrari
 * Llegeix 6 enters en un únic array, els mostra de l'última casella a la
 * primera i després els torna a mostrar en l'ordre original.
 */
public class Exercici_02 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // dades ← ARRAY DE 6 ENTERS (l'únic array del programa)
        int[] dades = new int[6];

        System.out.println("Introdueix 6 enters:");

        // Recorregut ascendent: lectura de les 6 dades
        for (int i = 0; i < dades.length; i++) {
            System.out.print("Enter de la posició " + i + ": ");
            dades[i] = lector.nextInt();
        }

        // Recorregut descendent: de l'índex 5 (length - 1) fins a l'índex 0, inclòs
        System.out.println("Ordre invers:");
        for (int i = dades.length - 1; i >= 0; i--) {
            System.out.println(dades[i]);
        }

        // Recorregut ascendent: l'array no s'ha modificat
        System.out.println("Ordre original:");
        for (int i = 0; i < dades.length; i++) {
            System.out.println(dades[i]);
        }

        lector.close();
    }
}