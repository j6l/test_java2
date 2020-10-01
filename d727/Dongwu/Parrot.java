package com.d727.Dongwu;

public class Parrot extends Animal implements biaoyan {
    //鹦鹉
    private String type;//品种

    public Parrot() {
    }
    public Parrot(String name,int age,String type){
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
        return "鹦鹉学舌";
    }

    @Override
    public String caiiyi() {
        return "唱流行歌曲";
    }

    @Override
    public void love() {
        System.out.println("喜爱：喜欢吃瓜子");
    }
}
