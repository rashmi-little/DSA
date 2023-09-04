import java.util.ArrayList;

class UnionSorted {
    public static void main(String[] args) {
        Solution solution = new Solution();

        var array = solution.findUnion(new int[] {3,5,8}, new int[] {2,2,8,9,10,15}, 3, 6);
        System.out.println(array);
    }
}

class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        
        ArrayList li = new ArrayList<Integer>();
        int a = 0;
        int b = 0;
        
        while(a < n && b < m) {
            if(a > 0 && arr1[a] == arr1[a-1]) {
                a++;
                continue;
            }
            
            if(b > 0 && arr2[b] == arr2[b-1]) {
                b++;
                continue;
            }
            
            if(arr1[a] > arr2[b]) {
                li.add(arr2[b]);
                b++;
            } else if(arr1[a] < arr2[b]) {
                li.add(arr1[a]);
                a++;
            } else {
                li.add(arr1[a]);
                a++;
                b++;
            }
        }
        
        while(a < n) {
            if(a > 0 && arr1[a] == arr1[a-1]) {
                a++;
                continue;
            } else {
                li.add(arr1[a]);
            }
        }
        
        while(b < m) {
            if(b > 0 && arr2[b] == arr2[b-1]) {
                b++;
                continue;
            } else {
                li.add(arr2[b]);
                b++;
            }
        }
        
        return li;
    }
}
