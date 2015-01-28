package com.byq.leetcode.WordBreak;

import java.util.Set;

/**
 * Created by yiqibai on 1/23/15.
 */
public class solution {

    public static void main(String[] args){

        String a = "thisisaword";
        char[] aar = a.toCharArray();
        String s = a.substring(0,2);
        for(char i : aar)
            System.out.println(i + " ");
        System.out.println(s + " ");

    }


    public boolean wordBreak(String s, Set<String> dict) {

        return false;
    }
}
