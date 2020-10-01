package com.xue.test;

import com.xue.leibie.Xueke;
import com.xue.leibie.Xues;

public class Schooltest {
    public static void main(String[] args) {
        //测试学科
        Xueke sub1=new Xueke("计算机科学","J0001",4);
        System.out.println(sub1.info());
        System.out.println("**********************************");

        Xues stu1=new Xues("s01","张三","男",18,sub1);
        System.out.println(stu1.info());
        System.out.println("**********************************");
        Xues stu2=new Xues("s02","李四","男",19,sub1);
        System.out.println(stu2.info());
        System.out.println("**********************************");
        Xues stu3=new Xues("s03","王五","女",17);
        System.out.println(stu3.info(sub1));
        System.out.println("**********************************");
        sub1.addStu(stu1);
        sub1.addStu(stu2);
        sub1.addStu(stu3);
        System.out.println(sub1.getSubName()+"专业已经有了"+sub1.getStuNum()+"名学生报名了");

    }
}
