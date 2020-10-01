package com.yi.trydemo;

import java.util.Scanner;

public class trytwo {
    public static void main(String[] args) {
        try {
            int res = tes();
            System.out.println("两数之商为：" + res);
        }catch (ArithmeticException e){
            System.out.println("除数不允许为0");
            e.printStackTrace();
        }

    }

    public static int tes() throws ArithmeticException {
        Scanner scx = new Scanner(System.in);
        System.out.println("运算开始");
        System.out.println("输入第一个数：");
        int one = scx.nextInt();
        System.out.println("输入第二个数：");
        int two = scx.nextInt();
        System.out.println("运算结束");
        return one / two;
    }
}