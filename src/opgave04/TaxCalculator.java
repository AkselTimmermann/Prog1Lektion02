package opgave04;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Indtast månedlig indkomst ");
        int income = scanner.nextInt();
        int tax = calculateTax(income);
        int monthly = tax / 12;
        System.out.println("Årlig skat er " + tax + " Månedlig skat er " + monthly );
    }

    public static int calculateTax(int monthlyIncome) {
        int BASEDECUTION = 48_000; //Personfradrag
        int yearlyIncome = monthlyIncome * 12; //Beregn årlig indkomst
        if (yearlyIncome <= 0) {
            return 0;
        }
        int taxedIncome = Math.max(0, yearlyIncome - BASEDECUTION); //beregn skattepligtig indkomst, Math.max(0, x) undgår negative tal
        int yearlyTax = taxedIncome * 37 / 100; //Beregn årlig skat
        int topBase = Math.max(0, taxedIncome - 568900); //Beregn indkomst, der skal betales topskat af
        int topTax = topBase * 15 / 100; //Beregn topskat
        int totalYearlyTax = topTax + yearlyTax; //Beregn total skattepligtig

        return totalYearlyTax; //returnere resultat, så det kan tilføjes til main
    }
}
