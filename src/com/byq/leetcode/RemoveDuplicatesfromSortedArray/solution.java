package com.byq.leetcode.RemoveDuplicatesfromSortedArray;



/**
 * Created by yiqibai on 12/7/14.
 */
public class solution {
    public static int removeDuplicates(int[] A) {
        if(A == null)
            return 0;
        if(A.length <= 1)
            return A.length;

        int ind = 1;
        int ins = 1;
        while(ind < A.length){
            if(A[ind] != A[ins - 1]){
                A[ins] = A[ind];
                ins +=1;
            }
            ind += 1;
        }
        return ins;
    }
}
