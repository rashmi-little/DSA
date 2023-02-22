import java.util.Scanner;

/**
 * This class contains a method which checks for that the in binary representation of a number the kth bit is set or not.
 * Algorith
 * We have to perform and operation of that number with such a number that the kth bit in only set and every other bit is unset
 * Now the totel result depends upon the kth bit of original number.
 * If it is set then set & set = set
 * else the numbers kth index is not set
 */
public class KthBit {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(10);
        System.out.println("Enter the bit position to check it is set or not");
        int k = scanner.nextInt(10); // constarints k should be less than the representation of n
        if(k < 0) {
            System.out.println("Abnormal termination");
            System.exit(1);
        }
        System.out.println(new KthBit().isKthBitSet(number,k));
    }
    boolean isKthBitSet(int number,int k) {
       /*  if((number & (int)Math.pow(2,k)) == 0) {
            return false;
        }
        return true; */
        // We can also have 
        number = number >> (k); // Right shift will move the bits towards right
        if ((number & 1) != 0) {
            return true;
        }
        return false;
    }
}