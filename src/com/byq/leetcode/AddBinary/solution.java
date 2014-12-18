package com.byq.leetcode.AddBinary;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by yiqibai on 12/17/14.
 */
public class solution {
    public static void main(String[] args){

        System.out.println(addBinary("11","1"));




    }

    public static void Test() {}

    public static String addBinary(String a, String b) {

        String[] fomer = a.length() > b.length()? a.split("") : b.split("") ;
        String[] add = a.length() <= b.length()? a.split("")  : b.split("") ;
        String[] dig = new String[fomer.length+1];
        String[] add1 = new String[fomer.length];


        int j = add.length-1;
        for(int i = fomer.length-1; i>0; i--){
            if(j >= 0)
                add1[i] = add[j];
            else
                add1[i] = "0";
            j --;
        }


        j = fomer.length-1;
        for(int i = add1.length-1; i >0; i-- ){
            if(j == fomer.length -1)
                dig[j+1] = "0";

            if(fomer[j].equals(add1[i])){
                fomer[j] = "0";
                if(add1[j].equals("1") ){
                   dig[j] = "1";
                }
                else{
                    dig[j] = "0";
                }
            }
            else{
                fomer[j] = "1";
                dig[j] = "0";
            }

            if(!fomer[j].equals(dig[j +1]))
                fomer[j] = "1";
            else{
                fomer[j] = "0";
                if(fomer[j].equals("1")){
                    dig[j] = "1";
                }
            }




            i--;
            j--;
        }

        if(dig[j + 1] .equals("0") )
            return toString(fomer);
        else
            return "1" + toString(fomer);
    }

    public static String toString(String[] args){
        String ss = "";
        for(String s : args)
            ss += s;
        return ss;
    }
}
