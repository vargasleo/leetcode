package zigzagConversion;

import java.util.Arrays;

/**
 * 6. Zigzag Conversion
 * Medium
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 * (you may want to display this pattern in a fixed font for better legibility)
 * <p>
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * <p>
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a number of rows:
 * string convert(string s, int numRows);
 * <p>
 * Example 1:
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 * <p>
 * Example 2:
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * <p>
 * Explanation:
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 * <p>
 * Example 3:
 * Input: s = "A", numRows = 1
 * Output: "A"
 * <p>
 * Constraints:
 * 1 <= s.length <= 1000
 * s consists of English letters (lower-case and upper-case), ',' and '.'.
 * 1 <= numRows <= 1000
 */
class Solution {

    public String convert(String s, int numRows) {
        StringBuilder[] stringBuilders = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            stringBuilders[i] = new StringBuilder();
        }
        char[] charArr = s.toCharArray();
        int n = charArr.length;
        int index = 0;
        while (index < n) {
            for (int i = 0; i < numRows && index < n; i++) {
                stringBuilders[i].append(charArr[index++]);
            }
            for (int j = numRows - 2; j > 0 && index < n; j--) {
                stringBuilders[j].append(charArr[index++]);
            }
        }
        StringBuilder res = stringBuilders[0];
        for (int i = 1; i < stringBuilders.length; i++) {
            res.append(stringBuilders[i]);
        }
        return stringBuilders[0].toString();
    }
}
