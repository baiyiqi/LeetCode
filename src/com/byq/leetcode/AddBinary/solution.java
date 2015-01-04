package com.byq.leetcode.AddBinary;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by yiqibai on 12/17/14.
 */
public class solution {

    public static void main(String[] args){

        System.out.println(addBinary("11","1"));

    }


    public static String addBinary(String a, String b) {

        int length = a.length() > b.length()?a.length():b.length();

        int lengthA = a.length();
        int lengthB = b.length();

        String result = "";

        int c = 0;
        int sum = 0;

        for (int i = 1; i <= length; i++) {
            int charA = 0;
            int charB = 0;


            if (a.length() >= i)
                charA = a.charAt(lengthA - i)%48;
            if (b.length() >= i)
                charB = b.charAt(lengthB - i)%48;

            sum = charA + charB + c;

            c = sum/2;
            sum = sum%2;

            result = sum + result;
        }
        if (c != 0)
            result = c + result;

        return result;
    }

}
