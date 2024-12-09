// class Solution {
//     public void rotate(int[] nums, int k) {
//         int n = nums.length;
//         for(int i=0;i<k;i++){
//             int temp = nums[n-1];
//             for(int j=n-1;j>0;j--){
//                 nums[j]=nums[j-1];
//             }
//             nums[0]=temp;
//         }
//     }
// }

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n; // To handle cases where k >= n

        // Reverse the entire array
        reverse(nums, 0, n - 1);
        // Reverse the first k elements
        reverse(nums, 0, k - 1);
        // Reverse the remaining elements
        reverse(nums, k, n - 1);
    }

    // Helper function to reverse a portion of the array
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

