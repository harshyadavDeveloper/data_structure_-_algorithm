// Question Link : https://leetcode.com/problems/search-insert-position/?envType=problem-list-v2&envId=binary-search
// Question Number : 35
// Difficulty Level : Easy
// Description : Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
// You must write an algorithm with O(log n) runtime complexity.

// Example 1: Input = [1,3,5,6], target = 5
// Output : 2

// Example 2 : [1,3,5,6], target = 2
// Output : 1

// Example 3: [1,3,5,6], target = 7
// Output: 4

// Constraints: 1). 1 <= nums.length <= 104
//              2). 104 <= nums[i] <= 104
//              3). nums contains distinct values sorted in ascending order.
//              4). 104 <= target <= 104

// approach : write a code for binary search as a normal code and then return start int at the end casue it will always point at the missing value. Throughout the loop:
// start always moves forward toward where the target should be
// end always moves backward away from where the target can’t be

class Solution {

    public int searchInsert(int[] sums, int target) {
        int start = 0;
        int end = sums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < sums[mid]) {
                end = mid - 1;

            }
            if (target > sums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;

    }

}
