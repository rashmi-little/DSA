import java.util.Scanner;

// This is the effective solution for the factorial
public class FactorialByIterative {
    public static void main(String[] args) {
        System.out.println("Enter the number you want to find for factorial");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("The factorial of the number " + number +" is " + factorialValue(number));
    }
    static int factorialValue(int number) {
        int factorial = 1; 
       for(int i = 1;i <=number;i++) {
            factorial *= i;
       }
       return factorial;
    }
}
// Time complexity is 0(n)