package com.byq.leetcode.RemoveElement;

/**
 * Created by yiqibai on 12/11/14.
 */
public class solution {
    public static int removeElement(int[] A, int elem) {

        if(A == null || A.length == 0)
            return 0;

        else {
            int end = A.length;
            for(int start = 0; start < end; start ++){
                while( A[start] == elem && end > start){
                    end --;
                    A[start] = A[end];
                }
            }
            return end;
        }

    }
}
