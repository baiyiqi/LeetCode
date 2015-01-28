package com.byq.leetcode.WordLadder;

import java.util.*;

/**
 * Created by yiqibai on 1/28/15.
 */
public class solution {
    public static void main(String[] args) {

        String start = "hot";
        String end = "dog";
        Set<String> lst = new HashSet<String>();
        lst.add("hot");
        lst.add("dot");
        lst.add("dog");

        int[][] a = new int[10][10];
        int[] b = new int[19];
        System.out.println(a[0][0]);
        System.out.println(b[0]);


    }

    public int ladderLength(String start, String end, Set<String> dict) {
        Queue<String> queue = new ArrayDeque<String>();
        Stack<String> stack = new Stack<String>();
        queue.add(start);
        stack.push(start);

        int loop = 1;
        while(!queue.isEmpty()){
            String word = queue.poll();
            List<String> transformWord;

            transformWord = func(word, dict);
            //map.put(word, transformWord);

            for(String s : transformWord)
                queue.add(s);
            stack.pop();
            if(stack.size() == 0){
                loop += 1;
                for(String s : queue)
                    stack.push(s);
            }
            if(transformWord.contains(end)){
                break;
            }

        }
        if(queue.isEmpty())
            return 0;
        else
            return loop;
    }

    public List<String> func(String start, Set<String> dict){
        List<String> lst = new ArrayList<String>();
        for(String s : dict){
            int flag = 0;
            int len = start.length();
            while(len > 0){
                if(start.charAt(len-1) != s.charAt(len-1))
                    flag +=1;

                len -=1;
            }
            if(flag == 1)
                lst.add(s);
        }
        return lst;
    }
}
