// Question URL: https://leetcode.com/problems/reverse-string/description/
// Question Number : 344
// Difficulty Level : Easy
// Description : Write a function that reverses a string. The input string is given as an array of characters s.
// You must do this by modifying the input array in-place with O(1) extra memory
// Example 1: Input: s = ["h","e","l","l","o"], Output: ["o","l","l","e","h"]
// Example 2: Input: s = ["H","a","n","n","a","H"], Output: ["H","a","n","n","a","H"]
// Example 3: Input: s = ["A","B","C","D","E","F","G"], Output: ["G","F","E","D","C","B","A"]

// Constraints:1). 1 <= s.length <= 10^5
//             2). s[i] is a printable ascii character.

// approach 1: brute force approach: create a new array of same length as s. traverse the s array from end to start and fill the new array from start to end. finally copy the new array to s array.
// time complexity : O(n)
// space complexity : O(n)

// approach 2: two pointer approach: initialize two pointers, one at start and one at end. swap the characters at these pointers and move the pointers towards each other until they meet.
// time complexity : O(n)
// space complexity : O(1)


class Solution  {
    // approach 1: brute force approach
    public void reverseString(char[] s){
        int n = s.length;
        char[] temp = new char[n];

        for(int i = 0; i < n; i++){
            temp[i] = s[n - 1 - i];
        }

        for(int i = 0; i < n; i++){
            s[i] = temp[i];
        }
    }

    // approach 2: two pointer approach
    public void reverseStringTwoPointer(char[] s){
        int left = 0;
        int right = s.length - 1;

        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
    
}
