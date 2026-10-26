import java.util.Scanner;

/**
 * Exercici 4. Positius, negatius i zeros
 * Llegeix 8 enters, els desa en un array i, en un recorregut posterior,
 * compta quants són positius, quants negatius i quants zero.
 */
public class PositiusNegatiusZeros {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // dades ← ARRAY DE 8 ENTERS
        int[] dades = new int[8];

        // Comptadors inicialitzats a 0 abans dels bucles
        int positius = 0;
        int negatius = 0;
        int zeros = 0;

        System.out.println("Introdueix 8 enters:");

        // Primer recorregut: lectura de les 8 dades
        for (int i = 0; i < dades.length; i++) {
            System.out.print("Enter de la posició " + i + ": ");
            dades[i] = lector.nextInt();
        }

        // Segon recorregut: classificació i recompte
        for (int i = 0; i < dades.length; i++) {
            if (dades[i] > 0) {
                positius = positius + 1;
            } else if (dades[i] < 0) {
                negatius = negatius + 1;
            } else {
                // Si no és positiu ni negatiu, és exactament zero
                zeros = zeros + 1;
            }
        }

        // Resultats
        System.out.println("Positius: " + positius);
        System.out.println("Negatius: " + negatius);
        System.out.println("Zeros: " + zeros);

        lector.close();
    }
}
