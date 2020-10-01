package com.yi.trydemo;

import java.util.Scanner;

public class tryone {
    public static void main(String[] args) {
        int res=tes();
        System.out.println("两数之商为："+res);

    }
    public static int tes(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("运算开始");
            System.out.println("输入第一个数：");
            int one = sc.nextInt();
            System.out.println("输入第二个数：");
            int two = sc.nextInt();
            return one/two;
        }catch (ArithmeticException e){
            System.out.println("除数不允许为0");
            return 0;
        }finally {
            System.out.println("运算结束");
        }


    }
}
