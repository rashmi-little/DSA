import java.util.Scanner;

public class Gcd {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        
    }
        static int getGcdValue(int number1,int number2) {
            int minimum = (number1 < number2) ? number1 : number2;
            for (int i = minimum; i > 1; i--) {
                if(number1 % i == 0 && number2 % i == 0) {
                    return i;
                }
            }
            return 1;
        }
}