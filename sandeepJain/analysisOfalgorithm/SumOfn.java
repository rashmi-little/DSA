import java.util.Scanner;

public class SumOfn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of Nth natural number");
        int number = scanner.nextInt();
        System.out.println("The sum of natural number till n is "+(number * (number+1))/2);
    }
}