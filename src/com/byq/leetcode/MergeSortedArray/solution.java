package com.byq.leetcode.MergeSortedArray;

/**
 * Created by yiqibai on 12/30/14.
 */
public class solution {
    public static void main(String[] args){
        int[] a= new int[1];
        int[] b = new int[1];
        b[0] = 1;
        System.out.println(a[0]);
        merge(a, 0, b, 1);

    }

    //merge
    public static void merge(int A[], int m, int B[], int n) {
        if(m == 0 )
            A= B;
        else {
            int[] c = new int[m + n];
            int k = 0;
            int i = 0;
            int j = 0;

            while(i <m && j < n){
               if(A[i] <= B[j]){
                    c[k] = A[i];
                    i ++;
                }
                else {
                    c[k] = B[j];
                    j ++;
                }
                k ++;
            }

            if( i != m && j== n){
                for(int i1 = i; i1<m; i1 ++  )
                    c[k++] = i1;
            }
            else if( i ==m && j != n){
                for(int j1 = j; j1 <n; j1 ++)
                    c[k ++] = j1;
            }

            A = c;
        }
    }
}
