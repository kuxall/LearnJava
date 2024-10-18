//@ AUthor: Kushal Raj Sharma
// @ID: C0940005

import java.util.Scanner;

public class InternetBill {
    public static void main(String[] args)
    {
        Scanner input_005 = new Scanner(System.in);
        System.out.println("Enter monthly traffic in megabytes: ");
        int traffic_005 = input_005.nextInt();
        double rate;
        if (traffic_005 >= 5000){
            rate = 0.1;
        }
        else if (traffic_005 >= 2000){
            rate = 0.015;
        }
        else if (traffic_005 >= 1000){
            rate = 0.02;
        }
        else {
            rate = 0.025;
        }
        double monthly_bill_005 = traffic_005 * rate;
        System.out.println("Monthly bill is $" + monthly_bill_005);
    }
}