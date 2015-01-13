package com.byq.leetcode.FindPeakElement;

/**
 * Created by yiqibai on 1/13/15.
 */
public class solution {

    public int findPeakElement(int[] num) {
        int index = 0;
        int peek = num[index];
        for(int i =0; i< num.length; i++){
            if(num[i] > peek){
                index = i;
                peek = num[index];
            }
        }

        return index;
    }
}
