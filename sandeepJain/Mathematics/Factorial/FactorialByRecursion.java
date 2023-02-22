import java.util.Scanner;

import javax.swing.JSpinner.NumberEditor;

public class FactorialByRecursion {
    public static void main(String[] args) {
        System.out.println("Enter the number you want to find for factorial");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("The factorial value of the number " + number + " is " + factorialValue(number));
    }
    static int factorialValue(int number) {
        if (number == 1 || number == 0)
            return 1;
        else
        return number * factorialValue(number - 1);
    }
}

/*
 * it takes 0(n) time complexity and 0(n) auxillary space for function call stack.
 */