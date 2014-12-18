package com.byq.leetcode.ValidParentheses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yiqibai on 12/18/14.
 */
public class solution {
    public static void main(String[] args){
        System.out.println(isValid("()"));
    }

    public static boolean isValid(String s) {
        char[] sarr = s.toCharArray();
        Map<Character, Character > lMap = new HashMap<Character, Character>();
        lMap.put('(', ')');
        lMap.put('{', '}');
        lMap.put('[', ']');

        Map<Character, Character > rMap = new HashMap<Character, Character>();
        rMap.put(')', '(');
        rMap.put('}', '{');
        rMap.put(']', '[');

        char[] arr = new char[s.length()];
        int j = 0;

        for(char c : sarr){
            if( lMap.containsKey(c)){
                arr[j] = lMap.get(c);
                j++;
            }
            if(rMap.containsKey(c)){
                j--;
                if(j >= 0 && arr[j] == c)
                    continue;
                else
                    return false;

            }
        }
        if(j== 0)
            return true;
        else
            return false;

    }
}
