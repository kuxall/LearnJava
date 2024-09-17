public class Student {
    private String student_name;
    private int student_age;
    private String grade;

    public Student(String student_name, int student_age, String grade)
    {
        this.student_name = student_name;
        this.student_age = student_age;
        this.grade = grade;
    }

    // Getters for getting student information.
    public String getStudent_name() {
        return student_name;
    }

    public int getStudent_age() {
        return student_age;
    }

    public String getGrade() {
        return grade;
    }
    @Override
    public String toString() {
        return "Name: " + student_name + ", Age: " + student_age + ", Grade: " + grade;
    }
}