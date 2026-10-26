import java.util.Scanner;

/**
 * Exercici 3. Suma i mitjana
 * Llegeix 5 enters en un array, calcula la suma amb un acumulador
 * i la mitjana aritmètica conservant els decimals.
 */
public class Exercici_03 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // dades ← ARRAY DE 5 ENTERS
        int[] dades = new int[5];

        // Acumulador inicialitzat a 0 abans del bucle
        int suma = 0;

        System.out.println("Introdueix 5 enters:");

        // Primer recorregut: lectura de les 5 dades
        for (int i = 0; i < dades.length; i++) {
            System.out.print("Enter de la posició " + i + ": ");
            dades[i] = lector.nextInt();
        }

        // Segon recorregut: acumulació de la suma
        for (int i = 0; i < dades.length; i++) {
            suma = suma + dades[i];
        }

        // Multiplicar per 1.0 evita la divisió entera i conserva els decimals
        double mitjana = suma * 1.0 / dades.length;

        System.out.println("Suma: " + suma);
        System.out.println("Mitjana: " + mitjana);

        lector.close();
    }
}