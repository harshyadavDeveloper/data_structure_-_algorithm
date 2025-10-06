// Palindrome meaning : A palindrome means the sequence of characters remains the same when reversed.

public class Palindrome {
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
    }

}
