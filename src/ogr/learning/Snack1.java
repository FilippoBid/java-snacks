package ogr.learning;

import java.util.Random;

public class Snack1 {
    public static void main(String[] args){
        String[] name = {"giorno","bruno","abacchio","peppino"};
        String[] surname = {"joestar","bucciarati","trump","spastato","pecora"};

        Random random = new Random();

        System.out.println("Falsa lista di invitati:");

        for (int i = 0; i < 10; i++) {
            String casualname = name[random.nextInt(name.length)];
            String casualsurname = surname[random.nextInt(surname.length)];
            System.out.println(casualname + " " + casualsurname);
        }


    }


}
