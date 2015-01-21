package com.byq.leetcode.EvaluateReversePolishNotation;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created by yiqibai on 1/21/15.
 */
public class solution {

    public int evalRPN(String[] tokens) {
        Stack<Integer> valStack = new Stack<Integer>();
        if(tokens.length < 2)
            return Integer.valueOf(tokens[0]);
        else{
            valStack.push(Integer.valueOf(tokens[0]));
            valStack.push(Integer.valueOf(tokens[1]));
        }

        for(int i = 2; i < tokens.length; i++){
            String v = tokens[i];
            if(!v.equals("+") && !v.equals("-")&& !v.equals("*")&& !v.equals("/") )
                valStack.push(Integer.valueOf(tokens[i]));
            else {
                int v1 = valStack.pop();
                int v2 = valStack.pop();

                if(v.equals("+"))
                    valStack.push(v1+v2);
                else if(v.equals("-"))
                    valStack.push(v2 - v1);
                else if(v.equals("*"))
                    valStack.push(v1*v2);
                else if(v.equals("/"))
                    valStack.push(v2 / v1);
            }
        }
        return valStack.pop();

    }


}
