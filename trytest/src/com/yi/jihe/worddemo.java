package com.yi.jihe;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class worddemo {
    public static void main(String[] args) {
        Set set = new HashSet();
        // 向集合中添加元素
        set.add("blue");
        set.add("red");
        set.add("black");
        set.add("yellow");
        set.add("white");
        // 显示集合的内容
        System.out.println("集合中的元素为：");
        Iterator it=set.iterator();

        while (it.hasNext()){
            System.out.print(it.next()+"  ");
        }





    }
}
