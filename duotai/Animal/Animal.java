package com.duotai.Animal;

public class Animal {
    private String Name;
    private int month;

    public Animal(){

    }

    public Animal(String name,int month){
        this.Name=name;
        this.month=month;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    //吃东西
    public void eat(){
        System.out.println("动物都可以吃东西");
    }
}
