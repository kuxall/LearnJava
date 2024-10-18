
//@Author: Kushal Raj Sharma
//@AuthorID: C0940005

import java.util.Scanner;

public class EmployeeInformation {
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Employee's Full Name: \t");
        String fullname_005 = input.nextLine();

        System.out.println("Enter the Employee ID: \t");
        int id_005 = input.nextInt();

        System.out.println("Enter the Employees's monthly Salary: \t");
        double monthlySalary_005 = input.nextDouble();

        System.out.println("Employee's name is " + fullname_005 + ", Employee's id_005 is "
                + id_005 + " and Employee's monthly salary is " + monthlySalary_005 + ".");
    }
}