import java.util.Scanner;

/**
 * Exercici 9. Copiar i transformar sense perdre l'original
 * Copia els valors a un array independent i duplica els de la còpia.
 */
public class Exercici_09 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int[] original = new int[5];
        int[] copia = new int[5];

        System.out.println("Introdueix 5 enters:");
        for (int i = 0; i < original.length; i++) {
            System.out.print("Enter de la posició " + i + ": ");
            original[i] = lector.nextInt();
        }

        for (int i = 0; i < original.length; i++) {
            copia[i] = original[i];
        }

        for (int i = 0; i < copia.length; i++) {
            copia[i] = copia[i] * 2;
        }

        System.out.println("Array original:");
        for (int i = 0; i < original.length; i++) {
            System.out.println(original[i]);
        }

        System.out.println("Còpia multiplicada per 2:");
        for (int i = 0; i < copia.length; i++) {
            System.out.println(copia[i]);
        }

        lector.close();
    }
}
