package com.byq.leetcode.TwoSum;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by yiqibai on 2/1/15.
 */
public class solution {


    public static void main(String[] args) {

        int[] arr = {0,4,3,0};
        System.out.print(twoSum(arr, 0));

    }
    public static int[] twoSum(int[] numbers, int target) {
        int[] rst = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer,  Integer>();
        for(int i = 0; i< numbers.length; i++){
            int e = numbers[i];
            if(!map.containsKey(e))
                map.put(e, i+1);
            else{
                if(e * 2 == target){
                    rst[0] = Math.min(map.get(e), i +1);
                    rst[1] = Math.max(map.get(e), i +1);
                }
            }

        }

        for( int e : map.keySet()){
            int s = target - e;
            if(map.containsKey(s)){
                rst[0] = Math.min(map.get(e), map.get(s));
                rst[1] = Math.max(map.get(e), map.get(s));
            }
        }

        return rst;
    }
}
