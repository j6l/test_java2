package com.d727.Dongwu;

public class Monkey extends Animal implements biaoyan{
    //猴子
    private String type;//品种

    public Monkey() {
    }

    public Monkey(String name,int age,String type) {
        setName(name);
        setAge(age);
        setType(type);
    }

    public void info(){
        System.out.println("姓名："+getName());
        System.out.println("年龄："+getAge());
        System.out.println("品种："+getType());
        System.out.println("技能："+jinneng());
        System.out.println("才艺："+caiiyi());
        love();
        System.out.println();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String jinneng() {
        return "骑自行车";
    }

    @Override
    public String caiiyi() {
        return "猴子翻跟头";
    }

    @Override
    public void love() {
        System.out.println("喜爱：吃香蕉");
    }
}
