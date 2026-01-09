class Solution {

    // Fixed Size Sliding Window
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int slidingWindow(int[] arr, int k) {
        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;

        // first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        maxSum = windowSum;

        // sliding the window
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i]; // adding the next element
            windowSum -= arr[i - k]; // removing the previous element

            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;

    }
}
