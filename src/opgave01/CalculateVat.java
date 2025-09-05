package opgave01;

import java.util.Scanner;

public class CalculateVat {
    public static void main(String[] args) {

        //Spørg bruger efter beløb i hele kroner
        Scanner input = new Scanner(System.in);
        System.out.print("Indtast beløb i hele kroner: ");
        int beløb = input.nextInt();

        //Beregn moms af beløbet
        double moms = beløb * 0.25;
        //Udskriv moms beløbet
        System.out.println("moms af beløbet" + beløb + "er = " + moms + "kr");
    }
}
