package ogr.learning;

import java.util.Scanner;

public class snack8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un numero di 4 cifre: ");
        int N = input.nextInt();
        while(!(N >= 1000 && N <= 9999)){
            System.out.println("Il numero inserito non ha 4 cifre.");
            System.out.print("Inserisci un numero di 4 cifre: ");
            N = input.nextInt();
        }
        int number1 =( N / 1000 % 10);
        int number2 = ( N / 100 % 10);
        int number3 =( N / 10 % 10);
        int number4 =( N % 10);

        System.out.println(number1+number2+number3+number4);



        input.close();


    }


}
