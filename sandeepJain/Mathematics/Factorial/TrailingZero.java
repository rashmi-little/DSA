import java.util.Scanner;

public class TrailingZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int count = 0;
        for(int i = 0;i <= number;i++) {
            int temp = i;
            while (temp % 5 == 0  && temp != 0) {
                count++;
                temp /= 5;
            }
        }
        System.out.println(count);
    }
}
