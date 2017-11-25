package com.leetcode.stringmanipulation.easy;

/**
 * Created by ruvinyusubov on 25/11/2017.
 */
public class AdditiveNumber_306 {
    public boolean isAdditiveNumber(String num) {
        for (int i = 0; i < num.length() - 2; i++) {
            String first = num.substring(0, i + 1);
            for (int j = i + 1; j < num.length() - 1; j++) {
                String second = num.substring(i + 1, j + 1);
                if (checkTheRest(first, second, num.substring(j + 1, num.length()))
                        && (second.charAt(0) != '0' || second.length() == 1)) {
                    return true;
                }
            }
        }

        return false;
    }

    boolean checkTheRest(String a, String b, String num) {
        if (num.length() <= 0) {
            return true;
        }

        String sum = getSum(a, b);
        if (isSumExist(sum, num, 0)) {
            int coveredLen = sum.length();
            return checkTheRest(b, sum, num.substring(coveredLen, num.length()));
        }

        return false;
    }

    boolean isSumExist(String sum, String num, int pos) {
        int sumPos = 0;

        while (sumPos < sum.length() && pos < num.length()) {
            if (sum.charAt(sumPos) != num.charAt(pos)) {
                return false;
            }

            sumPos++;
            pos++;
        }

        if (sumPos == sum.length()) {
            return true;
        }
        else {
            return false;
        }
    }

    String getSum(String first, String second) {
        StringBuilder res = new StringBuilder();
        int len = Math.max(first.length(), second.length());
        int rem = 0;
        int fInd = first.length() - 1;
        int sInd = second.length() - 1;

        for (int i = len - 1; i >= 0; i--) {
            int a = 0;
            int b = 0;

            if (fInd >= 0) {
                a = Character.getNumericValue(first.charAt(fInd));
                fInd--;
            }

            if (sInd >= 0) {
                b = Character.getNumericValue(second.charAt(sInd));
                sInd--;
            }

            int sum = a + b + rem;
            res.append((char)(sum % 10 + '0'));
            rem = sum / 10;
        }

        if (rem > 0) {
            res.append('1');
        }

        return res.reverse().toString();
    }
}
