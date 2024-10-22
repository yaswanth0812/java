import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[5];
        System.out.println("Enter the scores of 5 students:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Score " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }

        int totalScore = 0;
        for (int score : scores) {
            totalScore += score;
        }
        double averageScore = (double) totalScore / 5;
        int highestScore=scores[0];
        for (int score : scores) {
            if (score > highestScore) {
                highestScore = score;
            }
        }

        
        int lowestScore = scores[0];
        for (int score : scores) {
            if (score < lowestScore) {
                lowestScore = score;
            }
        }

        System.out.println("Scores:");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
        System.out.println("Average Score: " + averageScore);
        System.out.println("Highest Score: " + highestScore);
        System.out.println("Lowest Score: " + lowestScore);

        scanner.close();
    }
}