package com.byq.leetcode.ValidPalindrome;

/**
 * Created by yiqibai on 12/31/14.
 */
public class solution {
    // main
    public  boolean isPalindrome(String s) {
        if(s == null)
            return true;
        else {
            char[] cs = s.toLowerCase().toCharArray();
            int font = 0;
            int end = cs.length -1;

            while (font <= end && font < cs.length && end < cs.length){
                if(cs[font] > 122 || cs[font] < 48 || (cs[font] > 57 && cs[font] < 97))
                    font ++;
                if(cs[end] > 122 || cs[end] < 48 || (cs[end] > 57 && cs[end] < 97))
                    end --;

                if(end < cs.length && font < cs.length && ((cs[font] > 96 && cs[font] < 123) || (cs[font] > 47 && cs[font] < 58)) &&
                        ((cs[end] > 96 && cs[end] < 123) || (cs[end] > 47 && cs[end] < 58))){
                    if(cs[font] == cs[end] ){
                        font ++;
                        end --;
                    }
                    else {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
