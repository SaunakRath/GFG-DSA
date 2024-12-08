//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int getSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }
        
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                second_large = large;
                large = arr[i];
            } else if (arr[i] > second_large && arr[i] != large) {
                second_large = arr[i];
            }
        }

        // If second_large remains Integer.MIN_VALUE, it means there is no second largest
        if (second_large == Integer.MIN_VALUE) {
            return -1;  // No valid second largest value
        } else {
            return second_large;  // Return the second largest value
}
    }
}