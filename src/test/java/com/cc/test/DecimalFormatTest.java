package com.cc.test;

import java.text.DecimalFormat;

/**
 * @author chengcheng.feng. /  2017/9/12 21:40
 */
public class DecimalFormatTest {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        float s= 1.23456f;
        System.out.println(df.format(s));
    }
}
