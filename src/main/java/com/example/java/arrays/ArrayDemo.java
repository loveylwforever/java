package com.example.java.arrays;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        double[] doubles = {1.1,2.2,3.3};
        double[] doubles1 = new double[3];
        doubles1[0] = 5.5;
        doubles1[1] = 2.2;
        doubles1[2] = 3.3;
        // 普通循环
        for (int i = 0; i < doubles.length; i++) {
            System.out.println(doubles[i]);
        }

        // JDK 1.5 引进了一种新的循环类型，被称为 For-Each 循环或者加强型循环。
        // 它能在不使用下标的情况下遍历数组。
        double total = 0;
        for (double v : doubles1) {
            // 求和
            total += v;
        }
        System.out.println(total);

        // 排序
        Arrays.sort(doubles1);
        for (double v : doubles1) {
            System.out.println(v);
        }

        // 填充数组指定范围中的每个元素

        for (int i = 0; i < doubles.length; i++) {
            if (i==0){
                Arrays.fill(doubles,0,1,8.8);
            }
            System.out.println("填充第一个元素为8.8，当前第" + (i+1) + "个元素的值为：" + doubles[i]);
        }
    }
}
