package com.d727.Dongwu;

public class Bear extends Animal implements biaoyan {
    //熊
    public Bear() {
    }

    public Bear(String name,int age) {
        setName(name);
        setAge(age);
    }

    public void info(){
        System.out.println("姓名："+getName());
        System.out.println("年龄："+getAge());
        System.out.println("技能："+jinneng());
        System.out.println("才艺："+caiiyi());
        love();
        System.out.println();
    }

    @Override
    public String jinneng() {

        return getName()+"会游泳";
    }

    @Override
    public String caiiyi() {
        return getName()+"会上树";
    }

    @Override
    public void love() {
        System.out.println("喜爱：喜欢吃蜂蜜");
    }
    //熊
}
