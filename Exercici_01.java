import java.util.Scanner;

public class Exercici_01 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int[] dades = new int[5];

        System.out.println("Introdueix 5 nombres enters:");

        for (int i = 0; i < dades.length; i++) {
            System.out.print("Valor de la posició " + i + ": ");
            dades[i] = lector.nextInt();
        }

        System.out.println("Contingut de l'array:");

        for (int i = 0; i < dades.length; i++) {
            System.out.println(i + ": " + dades[i]);
        }

        System.out.println("Longitud: " + dades.length);
        System.out.println("Primer valor: " + dades[0]);
        System.out.println("Últim valor: " + dades[dades.length - 1]);

        lector.close(); // Tancar el Scanner
    }
}