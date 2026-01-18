// question link: https://leetcode.com/problems/palindrome-number/description/
// question number: 09
// difficulty level: Easy
// description:  Given an integer x, return true if x is a palindrome, and false otherwise.

//Example 1:

//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.
//Example 2:

//Input: x = -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
//Example 3:

//Input: x = 10
//Output: false
//Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

//Constraints:

// -231 <= x <= 231 - 1 

// Optional : Follow up: Could you solve it without converting the integer to a string?

// approach 1 : convert the int into a string and then introduce a new char[] to store the reversed string and return true or false based on the comparison. problem -> uses extra space

// approach 2: covert the int into a String -> start a binary search and move inwards -> return true or false based on the comparison

// approach 3: Store the original number 
// → Reverse the number using modulo and division 
// → Compare reversed number with original 
// → Return true if equal, else false

class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int n = s.length();
        char[] temp = new char[n];

        for (int i = 0; i < n; i++) {
            temp[i] = s.charAt(n - i - 1);
        }

        String reversedString = new String(temp);

        return s.equals(reversedString);
    }

    public boolean isPalindromeWithBinarySearch(int x) {
        String s = String.valueOf(x);
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public boolean isPlaindrome(int x) {
        int temp = x;
        int rev = 0;

        while (x > 0) {
            int digit = x % 10;
            rev = (rev * 10) + digit;
            x = x / 10;
        }

        if (rev == temp) {
            return true;
        }
        return false;
    }

}
