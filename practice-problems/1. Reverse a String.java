// reverse a string

// 2 approaches:
// (thinking process) : create a new char array of the same length as original -> copy element from original array to new array in reverse order -> copy new array to original array
// 1. brute force approach: create a new array of same length as s -> traverse the s array from end to start and fill the new array from start to end -> finally move all the elements of temp array to the original array s.
// time complexity : O(n)
// space complexity : O(n) (extra space for temp array)

// (thinking process): use two pointers -> one left and one right -> swap characters at these pointers -> move pointers inwards.
// 2. two pointer approach: (optimal approach)
// initialize two pointers, one at start and one at the end, swap the characters at these pointers and move the pointers inwards until they meet.
// time complexity : O(n)
// space complexity : O(1)

class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        char[] temp = new char[n];

        for (int i = 0; i < n; i++) {
            temp[i] = s[n - 1 - i];
        }

        for (int i = 0; i < n; i++) {
            s[i] = temp[i];
        }
    }

    public void reverStringWithTwoPointers(char[] s){
        int start = 0;
        int end = s.length - 1;

        while(start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }
    }

    // Edge case to remember : 
    // 1. empty array : s = [] --> no action
    // 2. single character array: s = ['a'] --> already reversed 
    // 3. array with all same characters: s = ['a', 'a', 'a'] --> already reversed
    // 4. even and odd lengths both handled naturally by the two pointer approach.

}
