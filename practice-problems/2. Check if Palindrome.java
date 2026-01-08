// check if a given string is a palindrome or not

// 2 approaches: 


// 1. (brute force approach): create a new reversed string and compare it with the original string. if both are the same, then it is a valid palindrome.
// time complexity : O(n)
// space complexity : O(n) (extra space for reversed string)


// 2. (two pointer approach): use two pointers, one at the start and one at the end of the string. compare the characters at these pointers. if they are same, move the pointers towards each other. if they are different, return false. if the pointers meet, return true.
// time complexity : O(n)
// space complexity : O(1)



class Solution {
    public boolean isPalindrome(String str){
        int n = str.length();
        char[] reversed = new char[n];

        for(int i = 0; i<n; i++){
            reversed[i] = str.charAt(n - i -1);
        }

        String reversedString = new String(reversed);
        return str.equals(reversedString);
    }

    public boolean isPalindromeTwoPointers(String str){
        int start = 0;
        int end = str.length() - 1;

        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
}
