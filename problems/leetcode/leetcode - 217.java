// Question Link : https://leetcode.com/problems/contains-duplicate/description/
// Question Number : 217
// Difficulty Level : Easy
// Description : Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
// Example 1: Input: nums = [1,2,3,1], Output: true
// Example 2: Input: nums = [1,2,3,4], Output: false

// Constraints:1). 1 <= nums.length <= 105
//             2). -109 <= nums[i] <= 109

// approach 1 : using nested loops. start the i index from 0 and j index from i+1 and check if nums[i] == nums[j]. if found return true. if no such pair found return false
// time complexity : O(n^2)
// space complexity : O(1)

// approach 2 : using hash map. traverse the array and check if the element is already present in the hash map. if present return true. if not present add it to the hash map. if no such pair found return false
// time complexity : O(n)
// space complexity : O(n)

import java.util.HashMap;

class Solution {

    public boolean containsDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsDuplicate2(int[] nums) {
        HashMap<Integer, Integer> seenValues = new HashMap<>();
        for (int num : nums) {
            if (seenValues.containsKey(num) && seenValues.get(num) > 1) {
                return true;
            }
            seenValues.put(num, seenValues.getOrDefault(num, 0) + 1);
        }
        return false;
    }

}