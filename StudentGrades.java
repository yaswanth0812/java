import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();
        int[][] scores = new int[numberOfStudents][numberOfSubjects];
        String[] subjects = new String[numberOfSubjects];
        for (int j = 0; j < numberOfSubjects; j++) {
            System.out.print("Enter the name of subject " + (j + 1) + ": ");
            subjects[j] = scanner.next();
        }

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter scores for Student " + (i + 1) + ":");
            for (int j = 0; j < numberOfSubjects; j++) {
                System.out.print(subjects[j] + ": ");
                scores[i][j] = scanner.nextInt();
            }
        }
        double[] studentAverages = calculateStudentAverages(scores);
        System.out.println("Average scores for each student:");
        for (int i = 0; i < studentAverages.length; i++) {
            System.out.printf("Student %d: %.2f%n", i + 1, studentAverages[i]);
        }
        double[] subjectAverages = calculateSubjectAverages(scores);
        System.out.println("Average scores for each subject:");
        for (int j = 0; j < subjectAverages.length; j++) {
            System.out.printf("%s: %.2f%n", subjects[j], subjectAverages[j]);
        }

        scanner.close();
    }

    public static double[] calculateStudentAverages(int[][] scores) {
        double[] averages = new double[scores.length];
        for (int i = 0; i < scores.length; i++) {
            int total = 0;
            for (int j = 0; j < scores[i].length; j++) {
                total += scores[i][j];
            }
            averages[i] = total / (double) scores[i].length;
        }
        return averages;
    }

    public static double[] calculateSubjectAverages(int[][] scores) {
        if (scores.length == 0) return new double[0];

        double[] averages = new double[scores[0].length];
        int numberOfStudents = scores.length;

        for (int j = 0; j < scores[0].length; j++) {
            int total = 0;
            for (int i = 0; i < numberOfStudents; i++) {
                total += scores[i][j];
            }
            averages[j] = total / (double) numberOfStudents;
        }
        return averages;
    }
}