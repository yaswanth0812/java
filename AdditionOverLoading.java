class calculator {
    public int add(int num1, int num2){
        int result = num1 + num2;
        return result;
}
    public int add(int num1, int num2, int num3){
        int result = num1 + num2 + num3;
        return result;
}
        public double add(double num1, double num2){
            double result = num1 + num2 ;
            return result;
        }
}


public class AdditionOverLoading {
    public static void main(String[] args) {
        calculator obj = new calculator();
        int sum2 = obj.add(5, 10);
        int sum3 = obj.add(1, 2, 3);
        double sum = obj.add(4.5,5.5);

        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum);
    }
}