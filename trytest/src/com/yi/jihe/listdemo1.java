package com.yi.jihe;

import java.util.ArrayList;
import java.util.List;

public class listdemo1 {

    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("java");
        list.add("c");
        list.add("c++");
        list.add("go");
        list.add("swift");
        //输出集合个数
        System.out.println(list.size());
        System.out.println("***********************************");
        //遍历输出集合
        for (int i=0;i<list.size();i++)
            System.out.print(list.get(i)+",");
        //移除c++
        System.out.println();
        System.out.println("***********************************");
        //list.remove(2);
        list.remove("c++");
        for (int i=0;i<list.size();i++)
            System.out.print(list.get(i)+",");





    }
}
