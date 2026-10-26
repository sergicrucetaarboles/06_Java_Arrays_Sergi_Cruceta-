import java.util.Scanner;

/**
 * Exercici 12. Informe de notes del grup
 * Valida les notes de deu alumnes i mostra les estadístiques del grup.
 */
public class Exercici_12 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int[] notes = new int[10];

        System.out.println("Introdueix les notes dels 10 alumnes (de 0 a 10):");
        for (int i = 0; i < notes.length; i++) {
            System.out.print("Nota de l'alumne " + i + ": ");
            notes[i] = lector.nextInt();
            while (notes[i] < 0 || notes[i] > 10) {
                System.out.println("Nota no vàlida");
                System.out.print("Torna a introduir la nota de l'alumne " + i + ": ");
                notes[i] = lector.nextInt();
            }
        }

        int suma = 0;
        for (int i = 0; i < notes.length; i++) {
            suma = suma + notes[i];
        }
        double mitjana = suma * 1.0 / notes.length;

        int aprovats = 0;
        int suspesos = 0;
        int maxim = notes[0];
        int minim = notes[0];
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] >= 5) {
                aprovats = aprovats + 1;
            } else {
                suspesos = suspesos + 1;
            }

            if (notes[i] > maxim) {
                maxim = notes[i];
            }
            if (notes[i] < minim) {
                minim = notes[i];
            }
        }

        System.out.println("Mitjana: " + mitjana);
        System.out.println("Aprovats: " + aprovats);
        System.out.println("Suspesos: " + suspesos);
        System.out.println("Màxim: " + maxim);
        System.out.println("Mínim: " + minim);

        int quantitatSuperiors = 0;
        System.out.print("Índexs amb nota superior a la mitjana: ");
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] > mitjana) {
                if (quantitatSuperiors > 0) {
                    System.out.print(", ");
                }
                System.out.print(i);
                quantitatSuperiors = quantitatSuperiors + 1;
            }
        }
        if (quantitatSuperiors == 0) {
            System.out.println("Cap nota supera la mitjana");
        } else {
            System.out.println();
        }

        lector.close();
    }
}
