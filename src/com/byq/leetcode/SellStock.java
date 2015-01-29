package com.byq.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by yiqibai on 1/28/15.
 */
public class SellStock {
    public static void main(String[] args) {


    }

    //iterative
    public static int  maxProfit(int[] prices) {
        if( prices.length < 2)
            return 0;

        int[] brr = new int[prices.length];
        for(int j = 1; j < brr.length; j++){
            int[] arr = new int[prices.length];
            for(int i= 1; i< arr.length; i++)
                arr[i] = fun(i, j -1, arr, prices);
            brr[j] = Math.max(arr[arr.length -1], brr[j-1]);
        }
        return brr[brr.length -1];
    }

    public static int fun(int i, int j,  int[] arr, int[] prices){
        if(i == 0)
            return prices[0];
        int mx = Math.max(prices[i]-prices[j], arr[i-1]);
        mx = Math.max(prices[i]-prices[i-1], mx);
        mx = Math.max(0, mx);
        return mx;

    }



    public int maxProfit1(int[] prices) {
        if( prices.length < 2)
            return 0;

        int[] arr = new int[prices.length];
        for(int i= 1; i< arr.length; i++)
            arr[i] = fun1(i, arr, prices);

        return arr[arr.length -1];
    }

    public int fun1(int i, int[] arr, int[] prices){
        if(i == 0)
            return prices[0];
        int mx = 0;
        for(int j =0; j<i; j++)
            mx = Math.max(mx, prices[i]-prices[j]);
        return Math.max(mx, arr[i]);
    }
}
