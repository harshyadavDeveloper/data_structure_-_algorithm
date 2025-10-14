// Question link: https://leetcode.com/problems/valid-anagram/description/
// Question number: 242
// Difficulty level: Easy
// Description: Given two strings s and t, return true if t is an anagram of s, and false otherwise.

// Example 1: Input: s = "anagram", t = "nagaram"
//            Output: true

// Example 2: Input: s = "rat", t = "car"
//            Output: false

// approach 1: sort the two strings and compare them
// time complexity : O(n log n)
// space complexity : O(1)

// approach 2: use a frequency array to count the frequency of each character in both strings and compare the frequency arrays
// time complexity : O(n)
// space complexity : O(1)

import java.util.Arrays;

class Solution {
    // approach 1
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    // approach 2
    public boolean isAnagram2(String s, String t) {
        int[] freq = new int[26];

        if (s.length() != t.length()) {
            return false;

        }
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
