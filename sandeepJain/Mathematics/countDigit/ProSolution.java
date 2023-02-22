import java.util.Scanner;

// This is a naive approach to find the number of digit in a integer
public class ProSolution {
    public static void main(String[] args) {
        System.out.println("Enter the number you want to count for digit");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(number == 0) 
        {
            System.out.println("The number is 0 having Zero digit");
            return ;
        }
        System.out.println("The number of digit in the number " + number + " " + ((int)Math.floor(Math.log10((double) Math.abs(number)))+1));
    }
}
// Time complexity 0(1)