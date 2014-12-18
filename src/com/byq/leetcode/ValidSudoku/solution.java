package com.byq.leetcode.ValidSudoku;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by yiqibai on 12/14/14.
 */
public class solution {
    public boolean isValidSudoku(char[][] board) {

        int i = 0;
        while(i < board.length){
            char[] hc = board[i];
            if(check(hc) == false)
                return false;

            int j = 0;
            char[] vc = new char[board.length];
            while(j < board.length){
                vc[j] = board[j][i];
                j+= 1;
            }
            if(check(vc) == false)
                return false;
            i+=1;
        }

        




        return true;




    }

    boolean check(char[] chars){
        Set<Character> s = new HashSet<Character>();

        int ct = 0;
        for(char c : chars){
            if(c!='.'){
                ct += 1;
                s.add(c);
            }
        }
        if(ct != s.size())
            return false;
        else
            return true;
    }
}
