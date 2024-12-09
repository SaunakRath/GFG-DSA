class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = -1; // Initialize j to -1

        // Find the first zero's index
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        // If no zero is found, the array is already processed
        if (j == -1) {
            return;
        }

        // Move non-zero elements to the position of the first zero found
        for (int i = j + 1; i < n; i++) {
            if (nums[i] != 0) {
                // Swap nums[i] & nums[j]
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                j++;
            }
        }
    }
}