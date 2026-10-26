import java.util.Scanner;

/**
 * Exercici 7. Comptar totes les aparicions
 * Mostra tots els índexs on apareix un valor i en compta les coincidències.
 */
public class Exercici_07 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int[] dades = new int[8];

        System.out.println("Introdueix 8 enters:");
        for (int i = 0; i < dades.length; i++) {
            System.out.print("Enter de la posició " + i + ": ");
            dades[i] = lector.nextInt();
        }

        System.out.print("Valor a comptar: ");
        int valor = lector.nextInt();
        int total = 0;

        System.out.println("Índexs on apareix:");
        for (int i = 0; i < dades.length; i++) {
            if (dades[i] == valor) {
                System.out.println(i);
                total = total + 1;
            }
        }

        System.out.println("Total: " + total);
        if (total == 0) {
            System.out.println("Cap coincidència");
        }

        lector.close();
    }
}
