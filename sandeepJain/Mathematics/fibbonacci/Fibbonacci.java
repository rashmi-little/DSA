import java.util.Scanner;

// Fibbonacci by the iterative method
public class Fibbonacci {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();

        System.out.println("Fibbo value is "+FibboValue(index));
    }
    public static int FibboValue(int index) {
        int firstTerm = 0;
        int secondTerm = 1;
        if(index == 0 || index == 1)
        return index;

        int nextIndex = 0;

        while (index != 1) {
            nextIndex = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextIndex;
            index--;
        }
        return nextIndex;
    }
}