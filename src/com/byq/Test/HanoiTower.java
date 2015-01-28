package com.byq.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yiqibai on 1/23/15.
 */
public class HanoiTower {
    public static void move(int n, int source, int target, int middle) {
        if (n == 1) {
            System.out.printf("%d ==> %d\n", source, target);
            return;
        }

        move(n - 1, source, middle, target);
        move(1, source, target, middle);
        move(n - 1, middle, target, source);


    }

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        String s = "1";
        String s1 = "2";


        System.out.println(s1 + s);
        System.out.println(Integer.parseInt(s1 + s));
    }

    public static  boolean check(String s){
        if(s.length() == 1)
            return true;
        else{
            int hd = 0;
            int tl = s.length()-1;
            while(hd < tl){
                if(s.charAt(hd) == s.charAt(tl)){
                    hd +=1;
                    tl  -=1;
                }
                else
                    return false;
            }
            return true;
        }
    }

}
