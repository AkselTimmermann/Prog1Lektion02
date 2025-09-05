package opgave03;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        //prompt bruger for højde og vægt
        Scanner input = new Scanner(System.in);
        System.out.print("indtast vægt i kg: ");
        double vægt = input.nextDouble();
        System.out.print("indtast højde i cm: ");
        double højde = input.nextDouble();

        //Konverter højde til meter
        double højdeMeter = højde / 100;

        //Beregn BMI
        double bmi = vægt / (højdeMeter * højdeMeter);

        //Udskriv BMI
        System.out.println("BMI er = " + bmi);

        input.close();
    }
}
