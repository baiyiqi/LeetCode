package com.byq.leetcode.GasStation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by yiqibai on 1/27/15.
 */
public class solution {

    public static void main(String[] args){
        int[] gas = {1,2,3,3};
        int[] cost = {2,1,5,1};
    }

    public  int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        for(int i = 0; i < gas.length; i++){
            gas[i] = gas[i] - cost[i];
            total += gas[i];
        }
        if(total < 0)
            return -1;

        else{
            int start = 0;
            int gasrem = 0;

            while(start < gas.length){
                int i = start;
                int len = gas.length;
                while(len > 0){
                    if(i >= gas.length)
                        i = i - gas.length;
                    gasrem += gas[i];
                    if(gasrem <  0)
                        break;
                    else{
                        i ++;
                        len --;
                    }
                }
                if(gasrem >= 0)
                    return start;
                else{
                    start += 1;
                    gasrem = 0;
                }
            }
            return -1;

        }

    }

    public int canCompleteCircuit1(int[] gas, int[] cost) {
        int total = 0;
        for(int i = 0; i < gas.length; i++){
            gas[i] = gas[i] - cost[i];
            total += gas[i];
        }
        if(total < 0)
            return -1;

        int gasrem = 0;
        int start = 0;
        for(int i = 0 ;i < gas.length; i++){
            gasrem += gas[i];
            if(gasrem < 0){
                start = i + 1;
                gasrem = 0;
            }
        }
        return start;

    }


}
