package ogr.learning;

import java.util.Scanner;

public class Snack3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        int N = input.nextInt();

        if (N % 2 == 0) {
            System.out.println("Il numero inserito è pari: " + N);
        } else {
            int next = N + 1;
            System.out.println("Il numero inserito è dispari. Numero successivo: " + next);
        }

        input.close();
    }
}
