/**
 * FirstReverse.java   2016年8月10日 下午3:13:22 by LIXUEBING 
 *
 * Copyright (c) 2010 - 2016 xuebing.Li. All rights reserved.
 * 
 */
package com.xuebing.algorithm.coderbyte.challenge.easy;

import java.util.Scanner;

public class FirstReverse {

    public String firstReverse(String str) {
        // code goes here   
        /* Note: In Java the return type of a function and the 
           parameter types being passed are defined, so this return 
           call must match the return type of the function.
           You are free to modify the return type. */
        if (str == null || str.equals("")) {
            return null;
        }
        Integer strLen = str.length() - 1;
        StringBuilder res = new StringBuilder();
        for (int i = strLen; i >= 0; i--) {
            res.append(str.charAt(i));
        }
        return res.toString();

    }

    public static void main(String[] args) {
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        FirstReverse fr = new FirstReverse();
        System.out.print(fr.firstReverse(s.nextLine()));
        s.close();
    }

}
