package com.yi.trydemo;

import java.util.Scanner;

public class trythree {
    public static void main(String[] args) {
        try {
            test();
        } catch (jiud e) {
            System.out.println(e.getMessage());
            System.out.println("不允许办理此登记业务");
            //e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void test() throws jiud {
        System.out.println("输入年龄");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if (age<18|age>80){
            //throw new Exception("禁止但如入住");
            throw new jiud();
        }else {
            System.out.println("欢迎入住");
        }
    }
}
