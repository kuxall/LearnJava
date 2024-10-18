//@Author: Kushal Raj Sharma
//@ID: C0940005

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args){
        Scanner input_005 = new Scanner(System.in);

        final double TAX_RATE_005 = 0.13;

        System.out.println("Enter the Sales Amount: \t");
        double sales_amount_005 = input_005.nextDouble();

        double tax_amount_005 = sales_amount_005 * TAX_RATE_005;

        System.out.println("The TAX AMOUNT is : $" + tax_amount_005);
    }
}