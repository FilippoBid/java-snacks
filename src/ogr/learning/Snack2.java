package ogr.learning;

import java.util.Random;

public class Snack2 {
    public static void main(String[] args){
        int[] numbers = {10, 20, 30, 40, 50};
        int totalodd = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 != 0) {
                totalodd += numbers[i];
            }
        }
        System.out.println(totalodd);



    }

}
