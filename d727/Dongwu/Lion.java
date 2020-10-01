package com.d727.Dongwu;

public class Lion extends Animal implements biaoyan {
    //狮子
    private String color;//颜色
    private String sex;//性别

    public Lion() {
    }

    public Lion(String name, int age, String color, String sex) {
        setName(name);
        setAge(age);
        setColor(color);
        setSex(sex);
    }

    public void info(){
        System.out.println("姓名："+getName());
        System.out.println("年龄："+getAge());
        System.out.println("毛色："+getColor());
        System.out.println("性别："+getSex());
        System.out.println("技能："+jinneng());
        System.out.println("才艺："+caiiyi());
        love();
        System.out.println();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String jinneng() {
        return "跳火圈";
    }

    @Override
    public String caiiyi() {
        return "群师乱舞";
    }

    @Override
    public void love() {
        System.out.println("喜爱：独自趴在高处眺望");
    }
}
