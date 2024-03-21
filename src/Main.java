public class Main {
    public static void main(String[] args)  {
        int sum = 0;
        for (int num1 = 0; num1 < 101; num1++) {
            sum += num1;
            System.out.println(sum); }
        for (int num2 = 0; num2 < 100; num2++){
            if (num2 % 3 == 0){
                System.out.println(num2);
            }
        }
    }
}