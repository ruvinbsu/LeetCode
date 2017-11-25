package com.leetcode.datastructure.stack.easy;

import java.util.ArrayList;

/**
 * Created by ruvinyusubov on 25/11/2017.
 */
public class MinStack_155 {
    ArrayList<Integer> stack = new ArrayList<>();
    int minn = Integer.MAX_VALUE;

    public MinStack_155() {

    }

    public void push(int x) {
        if (x <= minn) {
            stack.add(minn);
            minn = x;
        }
        stack.add(x);
    }

    public void pop() {
        int x = stack.get(stack.size() - 1);
        if (x == minn) {
            if (stack.size() > 1) {
                minn = stack.get(stack.size() - 2);
            }
            else {
                minn = Integer.MAX_VALUE;
            }
            stack.remove(stack.size() - 1);
        }
        stack.remove(stack.size() - 1);
    }

    public int top() {
        return stack.get(stack.size() - 1);
    }

    public int getMin() {
        return minn;
    }
}

