// Palindrome meaning : A palindrome means the sequence of characters remains the same when reversed.

class Palindrome {
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str) {
        String newStr = str.toLowerCase();
        int start = 0;
        int end = newStr.length() - 1;

        while (start < end) {
            if (newStr.charAt(start) != newStr.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;

        // in this solution we are using two pointer approach to check if the string is palindrome or not.
        // time complexity : O(n)
        // space complexity : O(1)
    }

    static boolean isPalindrome2(String str){
        int n = str.length();
        char[] reversed = new char[n];

        for(int i = 0; i < n; i++){
            reversed[i] = str.charAt(n - 1 - i);
        }
        String reversedString = new String(reversed);

        return str.equals(reversedString);

        // in this solution we are creating a new reversed string and comparing it with the original string. This approach uses extra space for the reversed string.
        // time complexity : O(n)
        // space complexity : O(n) (extra space for reversed string)
        
    }

}
