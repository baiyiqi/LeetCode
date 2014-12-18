package com.byq.leetcode.LengthofLastWord;

import java.util.Stack;

/**
 * Created by yiqibai on 11/18/14.
 */


public class Solution {

    public int lengthOfLastWord(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(0);

        if(s.length() == 0)
            return 0;
        else{
            char[] charArr = s.toCharArray();
            for(char c : charArr){
                if(c != ' '){
                    stack.push(stack.pop() +1);
                }
               else {
                  stack.push(0);
               }
            }
        }

        while(!stack.isEmpty()){
            int v = stack.pop();
            if(v == 0)
                continue;
            else
                return v;
        }
        return 0;
    }
}