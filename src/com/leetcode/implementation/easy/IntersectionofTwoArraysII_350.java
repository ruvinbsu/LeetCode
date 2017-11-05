package com.leetcode.implementation.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 * Created by ruvinyusubov on 05/11/2017.
 */
public class IntersectionofTwoArraysII_350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> listRes = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int ind1 = 0;
        int ind2 = 0;
        int len1 = nums1.length;
        int len2 = nums2.length;

        for (int i = 0; ind1 < len1 && ind2 < len2; i++) {
            if (nums1[ind1] < nums2[ind2]) {
                ind1++;
            }
            else if (nums1[ind1] > nums2[ind2]) {
                ind2++;
            }
            else {
                listRes.add(nums1[ind1]);
                ind1++;
                ind2++;
            }
        }

        int[] res = new int[listRes.size()];

        for (int i = 0; i < listRes.size(); i++) {
            res[i] = listRes.get(i).intValue();
        }

        return res;
    }
}
