import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private static ArrayList<Student> students = new ArrayList<>();

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("\n Student Management System \n");
            System.out.println("1. Add Student");
            System.out.println("2. Print All Students");
            System.out.println("3. Save Students to File");
            System.out.println("4. Load Students fo File");
            System.out.println("5. Exit");

            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); //Consume newline

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;

                case 2:
                    viewStudent(scanner);
                    break;

                case 3:
                    saveStudentsToFile(scanner);
                    break;

                case 4:
                    loadStudentsFromFile(scanner);
                    break;

                case 5:
                    run = false;
                    break;

                default:
                    System.out.println("Invalid choice");
                    System.out.println("Please Try again!");
            }
        }
        scanner.close();
    }

    private static void addStudent(Scanner scanner) {
        System.out.println("Enter Student Name: ");
        String student_name = scanner.nextLine();

        System.out.println("Enter student age: ");
        int student_age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter student grade: ");
        String grade = scanner.nextLine();

        students.add(new Student(student_name, student_age, grade));
        System.out.println("Student Added Successfully!");
    }

    private static void viewStudent(Scanner scanner) {
        if (students.isEmpty()) {
            System.out.println("No Students Found");
        }
        else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    private static void saveStudentsToFile(Scanner scanner) {
        try (FileWriter writer = new FileWriter("students.txt")) {
            for (Student student : students) {
                writer.write(student.getStudent_name() + "," + student.getStudent_age() + "," + student.getGrade() + "\n");
            }
            System.out.println("Student saved to file. ");
        } catch (IOException e) {
            System.out.println("Error while saving students to file." + e.getMessage());
        }
    }
    private static void loadStudentsFromFile(Scanner scanner) {
        try (BufferedReader reader = new BufferedReader(new FileReader("students.txt"))) {
            String line;
            students.clear();
            while ((line = reader.readLine()) != null) {
                String[] details = line.split(",");
                String name = details[0];
                int age = Integer.parseInt(details[1]);
                String grade = details[2];
                students.add(new Student(name, age, grade));
            }

            System.out.println("Student loaded from file. ");
        } catch (IOException e) {
            System.out.println("Error while loading students from file." + e.getMessage());
        }
    }
}
