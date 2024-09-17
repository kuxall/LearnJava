import java.util.Scanner;

public class Main {
    public  static void main(String[] args){
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter the principal amount: \t");
     double principal = sc.nextDouble();

     System.out.print("Enter the interest rate: \t");
     double rate = sc.nextDouble();

     System.out.print("Enter the time in years: \t");
     double time = sc.nextDouble();

     double SimpleInterest = (principal * rate * time) / 100;

     System.out.println("The Simple Interest is: \t " + SimpleInterest);
    }
}