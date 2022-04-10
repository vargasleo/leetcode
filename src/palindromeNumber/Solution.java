package palindromeNumber;

/**
 * 9. Palindrome Number
 * Easy
 * <p>
 * Given an integer x, return true if x is palindrome integer.
 * <p>
 * An integer is a palindrome when it reads the same backward as forward.
 * <p>
 * For example, 121 is a palindrome while 123 is not.
 * Example 1:
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * <p>
 * Example 2:
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * <p>
 * Example 3:
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * <p>
 * Constraints:
 * -231 <= x <= 231 - 1
 * Follow up: Could you solve it without converting the integer to a string?
 */
class Solution {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int start = x;
        int reversed = 0;
        while (x != 0) {
            if (reversed < Integer.MIN_VALUE / 10 || reversed > Integer.MAX_VALUE / 10)
                return false;
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return reversed == start;
    }
}
