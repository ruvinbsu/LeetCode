package com.leetcode.stringmanipulation.easy;

import java.util.ArrayList;

/**
 * Created by ruvinyusubov on 24/11/2017.
 */
public class SimplifyPath_71 {
    public String simplifyPath(String path) {
        StringBuilder res = new StringBuilder();
        int lenPath = path.length();
        int i = 0;
        ArrayList<String> folders = new ArrayList<>();

        while (i < lenPath) {
            char c = path.charAt(i);
            StringBuilder folder = new StringBuilder();
            boolean allDots = true;

            while (i < lenPath && c != '/') {
                folder.append(c);
                if (c != '.') {
                    allDots = false;
                }

                i++;

                if (i < lenPath) {
                    c = path.charAt(i);
                }
            }

            if (folder.length() > 0) {
                if (!allDots || folder.length() == 3) {
                    folders.add(folder.toString());
                }
                else if (folder.length() == 2 && folders.size() > 0){
                    folders.remove(folders.size() - 1);
                }
            }

            if (c == '/') {
                i++;
            }
        }

        for (String folder : folders) {
            res.append("/");
            res.append(folder);
        }

        if (res.length() == 0) {
            res.append("/");
        }

        return res.toString();
    }
}
