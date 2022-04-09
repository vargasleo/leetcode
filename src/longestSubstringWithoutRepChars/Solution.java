package longestSubstringWithoutRepChars;

import java.util.*;

/**
 * 3. Longest Substring Without Repeating Characters
 * Medium
 * <p>
 * Given a string s, find the length of the longest substring without repeating characters.
 * <p>
 * Example 1:
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * <p>
 * Example 2:
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * <p>
 * Example 3:
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * <p>
 * Constraints:
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and spaces.
 */
class Solution {

    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();

        Set<Character> characters = new HashSet<>();
        int start = 0;
        int end = 0;
        int max = 0;

        while (end < s.length()) {
            if (!characters.contains(chars[end])) {
                characters.add(chars[end]);
                end++;
                max = Math.max(characters.size(), max);
            } else {
                characters.remove(chars[start]);
                start++;
            }
        }
        return max;
    }
}
