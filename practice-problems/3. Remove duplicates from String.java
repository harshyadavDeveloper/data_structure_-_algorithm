// remove the duplicate from the string 

// Input: String s

//Output: String (duplicates removed)

//Constraints:

//Order must be preserved

//Case-sensitive ('A' ≠ 'a')

// 1. brute force thinking process: build the result string character by character. scan the result string character by character to see if it already exists. if not -> append.

// brute force algorithm: initialize empty result string. for each character in input : a). loop through result to check if it exists. b). if not found, append. return the result

// time complexity : O(n²) (Nested loops)
// space complexity : O(n)

// 2. optimal solution: use HashSet to trach the seen character. use stringbuilder to build the string efficiently. traverse the string only once

// optimal solution: create an empty hashset -> create a string builder -> for each character : a) if not seen in the set -> add to the set and also append to the string builder. return the builder as string 
import java.util.HashSet;

class Solution {
    // approach 1: using nested loops

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

    // approach 2: using hashset
    public static String removeDuplicatesWithHashSet(String s){
        HashSet<Character> seen = new HashSet<>();

        StringBuilder result = new StringBuilder();
        
        for(char c : s.toCharArray()){
            if(!seen.contains(c)){
                seen.add(c);
                result.append(c);
            }
        }

        return result.toString();

    }

}
