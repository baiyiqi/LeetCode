package com.byq.leetcode.PalindromeNumber;

import java.math.BigInteger;

/**
 * Created by yiqibai on 12/13/14.
 */
public class solution {

    public static void main(String[] args){
        System.out.println(isPalindrome(1410110141));
    }


    public static boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        if(x < 10 && x > 0)
            return true;

        int z = x;
        long y = 0;

        while (z % 10 != z){
            y = y * 10 + z % 10;
            z = (z - z % 10) /10;
        }
        y = y * 10 + z;

        if(y == x)
            return true;
        else
            return false;
    }
}
