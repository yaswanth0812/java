public class five {
    public static void main(String[] args) {
        
        for (int i = 5; i < 50; i++) {
            
            if (i % 10 == 5) {
               
                continue;
            }
            
            System.out.println(i);
            
            
            if (i >= 50) {
                break;
            }
        }
    }
}