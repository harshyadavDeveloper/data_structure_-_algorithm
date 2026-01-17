// problem link : https://leetcode.com/problems/first-unique-character-in-a-string/description/
// question number: 387
// difficulty level: Easy
// description: Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

// Example 1:

// Input: s = "leetcode"

// Output: 0

// Explanation:

// The character 'l' at index 0 is the first character that does not occur at any other index.

// Example 2:

// Input: s = "loveleetcode"

// Output: 2

// Example 3:

// Input: s = "aabb"

// Output: -1

// Approach:
// 1. Use a HashMap to store the frequency of each character in the string.
// 2. Traverse the string again and return the index of the first character
//    whose frequency is exactly 1.
// 3. If no such character exists, return -1.

// time complexity : O(n)
// space complexity : O(n)



import java.util.HashMap;

class Solution {
    public int firstUniqChar(String s){
        HashMap<Character, Integer> seen = new HashMap<>();

        for(char a : s.toCharArray()){
            seen.put(a, seen.getOrDefault(a, 0) + 1);
        }
        for(int i = 0; i < s.length(); i++){
            if(seen.get(s.charAt(i)) == 1){
                return i;
            }
        }

        return -1;
    }

}
