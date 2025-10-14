// Question URL: https://leetcode.com/problems/find-resultant-array-after-removing-anagrams/description/
// Question Number: 2273
// Difficulty Level: Easy
// Description: You are given a 0-indexed string array words, where words[i] consists of lowercase English letters.
// In one operation, select any index i such that 0 < i < words.length and words[i - 1] and words[i] are anagrams, and delete words[i] from words. Keep performing this operation as long as you can select an index that satisfies the conditions.
// Return words after performing all operations. It can be shown that selecting the indices for each operation in any arbitrary order will lead to the same result.
// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase using all the original letters exactly once. For example, "dacb" is an anagram of "abdc".

// Example 1: Input: words = ["abba","baba","bbaa","cd","cd"]
//            Output: ["abba","cd"]

//           Explanation: - Since words[2] = "bbaa" and words[1] = "baba" are anagrams, we choose index 2 and delete words[2].
//                        - Now words = ["abba","baba","cd","cd"].
//                        - Since words[1] = "baba" and words[0] = "abba" are anagrams, we choose index 1 and delete words[1].
//                        - Now words = ["abba","cd","cd"].
//                        - Since words[2] = "cd" and words[1] = "cd" are anagrams, we choose index 2 and delete words[2].
//                        - Now words = ["abba","cd"].
//                        - We can no longer perform any operations. Thus, the resultant array is ["abba","cd"].

// approach: 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<String> removeAnagrams(String[] words) {
        int curr = 1;
        int prev = 0;
        List<String> result = new ArrayList<>();

        result.add(words[0]);
        while (curr < words.length) {
            if (!isAnagram(words[prev], words[curr])) {
                result.add(words[curr]);
                prev = curr;
            }
            curr += 1;
        }
        return result;
    }

    public boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
