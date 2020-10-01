package com.d727.Dongwu;

public abstract class Animal {
    //名  年龄
    private String Name;
    private int age;

    public Animal(){

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //爱好
    public abstract void love();
}
