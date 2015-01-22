package com.byq.leetcode.ReverseWordsinaString;

/**
 * Created by yiqibai on 1/22/15.
 */
public class solution {
    public static void main(String[] args){
        String a = 		"   a   b ";
        System.out.println(reverseWords(a));

    }
    public static String reverseWords(String s) {
        String[] sarr = s.split(" ");
        String rt = "";
        for(int i = sarr.length -1; i >= 0; i--){
            if(sarr[i].equals(""))
                rt += sarr[i] + " ";
        }

        return rt.trim();
    }

}
