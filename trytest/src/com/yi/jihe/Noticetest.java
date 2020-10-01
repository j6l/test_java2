package com.yi.jihe;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Noticetest {
    public static void main(String[] args) {
        Notice notice1 = new Notice(1, "你好世界", "管理员", new Date());
        Notice notice2 = new Notice(2, "你好中国", "管理员", new Date());
        Notice notice3 = new Notice(3, "你好郑州", "管理员", new Date());

        List list = new ArrayList();
        list.add(notice1);
        list.add(notice2);
        list.add(notice3);

        for (int i=0;i<list.size();i++) {
            System.out.println(i+1+":"+((Notice)list.get(i)).getTitle());
        }
        System.out.println("*********************************************");
        Notice notice4=new Notice(4,"可以使用了","管理员",new Date());

        list.add(1,notice4);

        for (int i=0;i<list.size();i++) {
            System.out.println(i+1+":"+((Notice)list.get(i)).getTitle());
        }

        list.remove(2);

        System.out.println("*********************************************");

        for (int i=0;i<list.size();i++) {
            System.out.println(i+1+":"+((Notice)list.get(i)).getTitle());
        }

        notice4.setTitle("java编辑器可以使用了");
        list.set(1,notice4);
        System.out.println("*********************************************");

        for (int i=0;i<list.size();i++) {
            System.out.println(i+1+":"+((Notice)list.get(i)).getTitle());
        }



    }
}
