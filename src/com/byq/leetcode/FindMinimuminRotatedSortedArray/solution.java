package com.byq.leetcode.FindMinimuminRotatedSortedArray;

/**
 * Created by yiqibai on 1/13/15.
 */
public class solution {
    public int findMin(int[] num) {
        int min = num[0];

        for(int i=0; i< num.length; i++){
            if(num[i] < min){
                min = num[i];
                break;
            }
        }
        return min;
    }
}
