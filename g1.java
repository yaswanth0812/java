import java.util.Scanner;

class g1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int score = scan.nextInt();
            
            if (score >= 90) {
                System.out.println("grade A");
            } else if (score >= 80 && score < 90) {
                System.out.println("grade B");
            } else if (score >= 70 && score < 80) {
                System.out.println("grade C");
            } else if (score >= 60 && score < 70) {
                System.out.println("grade D");
            } else {
                System.out.println("Fail");
            }
        } finally {
            scan.close(); 
        }
    }
}