package com.d727.test;

import com.d727.Dongwu.*;

import java.util.Scanner;

public class Dongwutest {

    public void hh(){
        System.out.println("****************欢迎来到皮皮马戏团**********************");
        System.out.println("*********************1.熊*******************************");
        System.out.println("*********************2.狮子*****************************");
        System.out.println("*********************3.猴子*****************************");
        System.out.println("*********************4.鹦鹉*****************************");
        System.out.println("*********************5.小丑*****************************");
        System.out.println("*****************选择数字观看表演***********************");
    }

    public void tw(){
        System.out.println("************************0/1******************************");
        System.out.println("********************继续观看/退出************************");
    }

    public static void main(String[] args) {
        Bear bb=new Bear("熊宝",3);
        Lion ll=new Lion("狮王",5,"红色","公");
        Monkey mm=new Monkey("奇奇",3,"西伯利亚猴");
        Parrot pp=new Parrot("八哥",4,"金刚鹦鹉");
        Clown cc=new Clown("皮皮先生",6);
        boolean kl;
        Dongwutest dwy=new Dongwutest();
        do{
            kl=true;
            dwy.hh();
            Scanner sc=new  Scanner(System.in);
            int scc = sc.nextInt();
            switch (scc){
                case 1:bb.info();break;
                case 2:ll.info();break;
                case 3:mm.info();break;
                case 4:pp.info();break;
                case 5:cc.info();break;
            }

            do{
                dwy.tw();
                Scanner sx=new  Scanner(System.in);
                int sxx = sx.nextInt();
                if (sxx==1) {
                    kl = false;
                }
                else
                    System.out.println("输入错误重新输入！！");
            }while (kl);
        }while (kl);
    }


}
