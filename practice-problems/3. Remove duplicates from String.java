// remove the duplicate from the string 

// Input: String s

//Output: String (duplicates removed)

//Constraints:

//Order must be preserved

//Case-sensitive ('A' ≠ 'a')

// 1. brute force thinking process: build the result string character by character. scan the result string character by character to see if it already exists. if not -> append.

// brute force algorithm: initialize empty result string. for each character in input : a). loop through result to check if it exists. b). if not found, append. return the result

class Solution {

    public static String removeDuplicates(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            boolean found = false;

            for (int j = 0; j < result.length(); j++) {
                if (s.charAt(j) == current) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                result += current;
            }
        }

        return result;
    }

}
