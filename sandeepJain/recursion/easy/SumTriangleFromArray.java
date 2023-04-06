/**
 * SumTriangleFromArray
 * Given an array of integers, print a sum triangle from it such that the first level has all array elements. From then, at each level number of elements is one less than the previous level and elements at the level is be the Sum of consecutive two elements in the previous level. 
 * Input : A = {1, 2, 3, 4, 5}
Output : 48
         20, 28
         8, 12, 16 
         3, 5, 7, 9 
         1, 2, 3, 4, 5
 */
public class SumTriangleFromArray {

    public static void main(String[] args) {
        int arr[] = new int[] {1,2,3,4,5};
        new SumTriangleFromArray().printTriangle(arr);
    }

    public void printTriangle(int[] temp) {
        int size = temp.length;
        if(size < 1) {
            return;
        }
        int topLevelArray[] = new int[size - 1]; 
        // to intialize the top array element
        for(int i = 0; i < (size - 1); i++) {
            topLevelArray[i] = temp[i] + temp[i+1];
        }

        printTriangle(topLevelArray);
        for(int i = 0 ; i < temp.length; i++) {
            if(i == temp.length - 1) {
                System.out.println(temp[i]);
            } else {
                System.out.print(temp[i] + ", ");
            }
        }
    }
}