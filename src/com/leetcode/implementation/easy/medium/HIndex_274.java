package com.leetcode.implementation.easy.medium;

/**
 * Created by ruvinyusubov on 24/11/2017.
 */
public class HIndex_274 {
    public int hIndex(int[] citations) {
        int len = citations.length;
        int[] numOfTimesForCitation = new int[len + 1];

        for (int numOfCitations: citations) {
            if (numOfCitations > 0){
                numOfCitations = Math.min(len, numOfCitations);
                numOfTimesForCitation[numOfCitations]++;
            }
        }

        int numOfBooksWithAtLeastHCitations = numOfTimesForCitation[len];
        len--;
        while (len > 0 && len >= numOfBooksWithAtLeastHCitations) {
            numOfBooksWithAtLeastHCitations += numOfTimesForCitation[len];
            len--;
        }

        return Math.min(numOfBooksWithAtLeastHCitations, len + 1);
    }
}
