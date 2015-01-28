package com.byq.leetcode;

import java.util.*;

/**
 * Created by yiqibai on 1/26/15.
 */
public class WordBreakII {

    static Map<String, List<String>> wordMap= new HashMap<String, List<String>>();

    public static void main(String[] args){
        String s = "aaaaaaaaaaaaa";
        Set<String> dict = new HashSet<String>();
        dict.add("a");
        dict.add("aa");
        dict.add("aaa");
        dict.add("aaaa");
        dict.add("aaaaa");
        dict.add("aaaaaa");
        dict.add("aaaaaaa");
        dict.add("aaaaaaaa");
        dict.add("aaaaaaaaa");
        dict.add("aaaaaaaaaa");
        System.out.print(s.contains("aab"));

        //System.out.print(wordBreak(s, dict));
    }
    public static List<String> wordBreak(String s, Set<String> dict) {
        List<String> lst = new ArrayList<String>();
        if(wordMap.containsKey(s))
            return wordMap.get(s);

        if(dict.contains(s)){
            lst.add(s);
            wordMap.put(s, lst);
            //return lst;
        }

        if(s.length() == 1 && !dict.contains(s)){
            wordMap.put(s, lst);
            return lst;
        }

        for(int i = 0; i< s.length(); i++){
            String head = s.substring(0, i+1);
            String tail = s.substring(i+1, s.length());
            List<String> headlst = wordBreak(head, dict);
            List<String> taillst = wordBreak(tail, dict);
            System.out.print("h " + head);
            System.out.println("     t " +tail);

            if(headlst.size() > 0 && taillst.size() > 0){
                for(String ss : headlst){
                    for(String sss : taillst){
                        String seg = ss + " " + sss;
                        if(!lst.contains(seg))
                            lst.add(seg);
                    }
                }
            }
            wordMap.put(s, lst);
        }
        return lst;

    }



    public class Solution {
        Map<String, List<String>> wordMap= new HashMap<String, List<String>>();

        public List<String> wordBreak(String s, Set<String> dict) {
            List<String> lst = new ArrayList<String>();
            if(wordMap.containsKey(s))
                return wordMap.get(s);

            if(dict.contains(s)){
                lst.add(s);
                wordMap.put(s, lst);
                //return lst;
            }

            if(s.length() == 1 && !dict.contains(s)){
                wordMap.put(s, lst);
                return lst;
            }

            for(int i = 0; i< s.length(); i++){
                String head = s.substring(0, i+1);
                String tail = s.substring(i+1, s.length());
                if(dict.contains(head)){
                    List<String> taillst = wordBreak(tail, dict);
                    if(taillst.size() > 0){
                        for(String ss : taillst){
                            String seg = head + " " + ss;
                            if(!lst.contains(seg))
                                lst.add(seg);
                        }
                    }
                }

                wordMap.put(s, lst);
            }
            return lst;

        }
    }
}
