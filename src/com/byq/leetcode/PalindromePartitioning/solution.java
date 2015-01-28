package com.byq.leetcode.PalindromePartitioning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yiqibai on 1/27/15.
 */
public class solution {

    static Map<String, List<List<String>>> palMap = new HashMap<String, List<List<String>>>();

    public static void main(String[] args) {

        String s = "aaabaa";
        List<String> lst = new ArrayList<String>();
        lst.add(s);

        System.out.print( partition(s));

    }


    public static List<List<String>> partition(String s) {
        List<List<String>> lst = new ArrayList<List<String>>();
        if(palMap.containsKey(s))
            return palMap.get(s);
        if(check(s)){
            List<String> lst1= new ArrayList<String>();
            lst1.add(s);
            lst.add(lst1);
            if(s.length() ==1)
                palMap.put(s, lst);
        }

        for(int i = 0; i< s.length(); i++){
            String head = s.substring(0, i + 1);
            String tail = s.substring(i + 1, s.length());
            List<List<String>> tlst = partition(tail);
            if(check(head)){
                for(List<String> l2 : tlst){
                    List<String> l3 = new ArrayList<String>(l2);
                    l3.add(0, head);
                    lst.add(l3);
                }
            }


            palMap.put(s, lst);
        }
        return lst;
    }

    public static boolean check(String s){
        if(s == null)
            return false;
        if(s.equals(""))
            return false;
        if(s.length() == 1)
            return true;
        else{
            int hd = 0;
            int tl = s.length()-1;
            while(hd <tl){
                if(s.charAt(hd) == s.charAt(tl)){
                    hd +=1;
                    tl -= 1;
                }
                else
                    return false;
            }
            return true;
        }
    }
}
