import java.util.*;
class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter the number to check for palindrome or not");
        int number = scanner.nextInt();

        System.out.println(PalindromeCheck.Checker(number));
    }
}
public class PalindromeCheck {
    static boolean Checker(int number) {
        int temp = number;
        int reverse = 0;
        while (number != 0) {
            reverse = reverse * 10 + (number % 10);
            number /= 10;
        }
        return reverse == temp;
    }
}

// Time complexity is 0(n) -> where n is the size of input digit