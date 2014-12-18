package com.byq.leetcode.MinStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by yiqibai on 11/12/14.
 */
public class MinStack {
    Stack<Long> stack = new Stack<Long>();
    Long min;

    public void push(int x) {
        if(stack.isEmpty()){
            stack.push(0L);
            min = new Long(x);
            return;
        }

        stack.push(x-min);
        if(x < min)
            min = new Long(x);;
    }

    public void pop() {
        if(stack.isEmpty())
            return;
        int dif = (int)(long)stack.pop();
        if(dif < 0)
            min = min - dif; //when pop an element, min changes
    }

    public int top() {
        int dif = (int)(long)stack.peek();
        if(dif <= 0){
            return (int)(long) min;
        }
        else{
            return (int)(long)  min + dif;
        }

    }

    public int getMin() {
        return (int)(long) min;
    }
}
