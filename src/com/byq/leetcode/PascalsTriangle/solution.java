package com.byq.leetcode.PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yiqibai on 12/13/14.
 */
public class solution {
    public static void main(String[] args){

        System.out.println(generate(2));

    }
    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> lst = new ArrayList<List<Integer>>();

        if(numRows > 0){
            for(int i = 0; i < numRows; i++){
                List<Integer> lst1 = new ArrayList<Integer>();
                int s = 0;
                while(s <= i){
                    int num = 1;
                    if(s != 0 && s !=i)
                        num = lst.get(i-1).get(s-1) + lst.get(i-1).get(s);
                    lst1.add(num);
                    s += 1;
                }
                lst.add(lst1);
            }

        }

        return lst;
    }
}
