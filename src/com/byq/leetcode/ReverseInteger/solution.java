package com.byq.leetcode.ReverseInteger;

/**
 * Created by yiqibai on 12/16/14.
 */
public class solution {
    public static void main(String[] args){
        System.out.println(214748364);


    }
    public int reverse(int x) {
        int ret = 0;
        while (x != 0) {
            // handle overflow/underflow
            if (Math.abs(ret) > 214748364) {
                return 0;
            }
            ret = ret * 10 + x % 10;
            x /= 10;
        }
        return ret;
    }
}
