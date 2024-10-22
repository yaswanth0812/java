import java.util.Scanner;
class Student {
    private int grade;
    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Error: Grade must be between 0 and 100.");
        }
    }
    public int getGrade() {
        return grade;
    }
}
public class StudentGradem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.print("Enter student grade: ");
        int grade = scanner.nextInt();
        student.setGrade(grade);
        System.out.println("Student grade: " + student.getGrade());
        scanner.close();
    }

}