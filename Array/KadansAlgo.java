public class KadansAlgo {
    public static void main(String[] args) {
        int[] nums = {2, 3, -8, 7, -1, 2, 3};
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int num : nums) {
            currentSum += num;
            maxSum = Math.max(maxSum, currentSum);
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}
