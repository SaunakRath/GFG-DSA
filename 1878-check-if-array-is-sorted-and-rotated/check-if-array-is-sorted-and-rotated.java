class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            // Check if the current element is greater than the next element
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        // Array is sorted and rotated if there is at most one "break" in the order
        return count <= 1;
    }
}