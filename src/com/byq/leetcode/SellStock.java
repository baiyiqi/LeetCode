package com.byq.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by yiqibai on 1/28/15.
 */
public class SellStock {
    public static void main(String[] args) {

        int[] b = new int[2];
        b[0] = 2;
        b[1] = 1;
        System.out.print(maxProfit(b));

    }

    public static int maxProfit(int[] prices) {
        if( prices.length < 2)
            return 0;

        int mx = 0;
        int j = prices.length-1;
        while(j > 1){
            for(int i= 1; i< j; i++)
                mx = Math.max(prices[j]-prices[i], mx);
            j --;
        }
        return mx;
    }




}
