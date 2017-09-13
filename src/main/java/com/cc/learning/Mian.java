package com.cc.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author chengcheng.feng. /  2017/9/9 18:10
 */
public class Mian {
    public static void main(String[] args) {
        System.out.println("Start JdkLearning");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);

        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//            iterator.remove();
//        }
        iterator.next();
        iterator.remove();

        System.out.println(list);

        System.out.println(Math.round(11.2));

    }
}

