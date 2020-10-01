package com.duotai.Animal;

public class Cat extends Animal {
    private double weight;

    public Cat(){

    }

    public Cat(String name,int month,double weight){
        super(name,month);
        this.weight=weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    //跑动
    public void run(){
        System.out.println("小猫在奔跑");
    }

    //重写吃东西
    @Override
    public void eat() {
        System.out.println("猫吃鱼~~~~~~~~");
        //super.eat();
    }
}
