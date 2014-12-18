package com.byq.leetcode.LongestCommonPrefix;

/**
 * Created by yiqibai on 12/12/14.
 */
public class solution {
    public String longestCommonPrefix(String[] strs) {
        String prefx = "";

        if(strs.length == 0)
            return prefx;
        if(strs.length == 1)
            return strs[0];

        prefx = commonPrefix(strs[0], strs[1]);

        if(strs.length == 2)
            return prefx;
        else{
            for(int i =2 ; i<strs.length; i++){
                prefx = commonPrefix(prefx, strs[i]);
            }
        }
        return prefx;

    }

    public String commonPrefix(String s1, String s2){
        String prefx = "";
        byte[] b1 = s1.getBytes();
        byte[] b2 = s2.getBytes();
        for(int i = 0; i < Math.min(b1.length, b2.length); i++){
            if(b1[i] == b2[i])
                prefx += s1.charAt(i);
            else
                break;
        }
        return prefx;
    }



}
