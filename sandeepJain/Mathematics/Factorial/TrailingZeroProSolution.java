import java.util.Scanner;

public class TrailingZeroProSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println( trailingZero(number));
    }
    static int trailingZero(int number) {
        int count = 0;
        if(number < 5) {
            return 0;
        }
        else
        {
            for(int i = 5; i <= number ; i*=5) {
                // for (int i = 0; number/i >=1;i*=5) {
                count += number/i;
            }
        }
        return count;
    }
}
