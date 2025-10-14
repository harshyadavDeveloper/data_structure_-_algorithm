
// write a java program to check if two strings are anagram or not
// An anagram is a word or phrase formed by rearranging the letters of a different word
import java.util.Arrays;

class Anagram {
    public void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(isAnagram(str1, str2));
    }

    // approach 1: sort the two strings and compare them
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
    // time complexity : O(n log n)
    // space complexity : O(1)

    // approach 2: use a frequency array to count the frequency of each character in
    // both strings and compare the frequency arrays
    public boolean isAnagram2(String str1, String str2) {
        int[] freq = new int[26];

        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i) - 'a']++;
            freq[str2.charAt(i) - 'a']--;
        }
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
    // time complexity : O(n)
    // space complexity : O(1)

}
