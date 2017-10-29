package com.leetcode.implementation.easy;

/**
 * Created by ruvinyusubov on 29/10/2017.
 */
public class ExcelSheetColumnNumber_171 {
    public int titleToNumber(String s) {

        int res = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            res += ((int )(s.charAt(i)) - 64) * (int)Math.pow(26, s.length() - 1 - i);
        }

        return res;
    }
}
