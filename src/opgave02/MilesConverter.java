package opgave02;

import java.util.Scanner;

public class MilesConverter {
    public static void main(String[] args) {
        //spørg bruger efter antal mil
        Scanner input = new Scanner(System.in);
        System.out.print("Indtast antal mil: ");
        double antalMil = input.nextDouble();

        //omregn mil til kilometer
        double kilometer = antalMil * 1.6;

        //Udksriv antal kilometer med 1 decimal
        System.out.printf(antalMil + " mil er %.1f km", kilometer);
    }
}
