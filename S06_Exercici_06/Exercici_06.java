import java.util.Scanner;

/**
 * Exercici 6. Cercar la primera coincidència
 * Llegeix 8 enters en un array, després un valor a cercar, i mostra
 * l'índex de la primera coincidència o "No trobat" si el valor no hi és.
 */
public class Exercici_06 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // dades ← ARRAY DE 8 ENTERS
        int[] dades = new int[8];

        // -1 és un senyal de "no trobat": no és mai un índex vàlid
        // i no s'utilitza mai per accedir a l'array
        int posicio = -1;

        System.out.println("Introdueix 8 enters:");

        // Primer recorregut: lectura de les 8 dades
        for (int j = 0; j < dades.length; j++) {
            System.out.print("Enter de la posició " + j + ": ");
            dades[j] = lector.nextInt();
        }

        System.out.print("Valor a cercar: ");
        int valor = lector.nextInt();

        // Cerca lineal: s'atura en trobar la primera coincidència
        int i = 0;
        while (i < dades.length && posicio == -1) {
            if (dades[i] == valor) {
                posicio = i;
            }
            i = i + 1;
        }

        // Resultat
        if (posicio == -1) {
            System.out.println("No trobat");
        } else {
            System.out.println("Índex: " + posicio);
        }

        lector.close();
    }
}