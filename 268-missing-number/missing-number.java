class Solution {
    public int missingNumber(int[] nums) {
        int xor1 = 0, xor2 = 0;
        int N = nums.length;

        // XOR all elements in the array
        for (int num : nums) {
            xor2 ^= num;
        }

        // XOR all numbers from 0 to N
        for (int i = 0; i <= N; i++) {
            xor1 ^= i;
        }

        // The missing number is the XOR of these two
        return xor1 ^ xor2;
    }
}
