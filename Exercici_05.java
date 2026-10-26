import java.util.Scanner;

/**
 * Exercici 5. Màxim, mínim i primera posició
 * Llegeix 7 enters, els desa en un array i, en un recorregut posterior,
 * troba el valor màxim i el mínim amb l'índex de la seva primera aparició.
 */
public class MaximMinimPosicio {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // dades ← ARRAY DE 7 ENTERS
        int[] dades = new int[7];

        System.out.println("Introdueix 7 enters:");

        // Primer recorregut: lectura de les 7 dades
        for (int i = 0; i < dades.length; i++) {
            System.out.print("Enter de la posició " + i + ": ");
            dades[i] = lector.nextInt();
        }

        // Els extrems s'inicialitzen amb el primer element de l'array,
        // que sempre és un candidat vàlid (sigui quin sigui el signe)
        int maxim = dades[0];
        int posMaxim = 0;
        int minim = dades[0];
        int posMinim = 0;

        // Segon recorregut: comença a l'índex 1 perquè la casella 0 ja s'ha tingut en compte
        for (int i = 1; i < dades.length; i++) {
            // Comparació estricta (>): si el valor és igual, es conserva la primera posició
            if (dades[i] > maxim) {
                maxim = dades[i];
                posMaxim = i;
            }

            // Comparació estricta (<): si el valor és igual, es conserva la primera posició
            if (dades[i] < minim) {
                minim = dades[i];
                posMinim = i;
            }
        }

        // Resultats
        System.out.println("Màxim: " + maxim + ", a l'índex " + posMaxim);
        System.out.println("Mínim: " + minim + ", a l'índex " + posMinim);

        lector.close();
    }
}
