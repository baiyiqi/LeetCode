package com.byq.leetcode.PascalTriangle2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yiqibai on 12/13/14.
 */
public class solution {
    public static void main(String[] args){

        System.out.println(getRow(2));

    }


    public static List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();
        if (rowIndex < 0)
            return list;

        for (int i = 0; i < rowIndex + 1; i++) {
            list.add(0, 1);
            for (int j = 1; j < list.size() - 1; j++) {
                list.set(j, list.get(j) + list.get(j + 1));
            }
        }
        return list;
    }



    /*
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> lst = new ArrayList<Integer>();
        int i = 0;
        while (i <= (rowIndex + 1)/2){
            int start = 1;
            if(i == 0)
                lst.add(i, start);
            if(i == 1)
                lst.add(i, rowIndex);
            if(i > 1){
                List<Integer> pLst = getRow(rowIndex -1);
                lst.add(i, pLst.get(i-1) + pLst.get(i));
            }
            i ++;
        }

        while(i <= rowIndex){
            lst.add(i, lst.get(rowIndex - i));
            i++;
        }

        return lst;
    }*/

}
