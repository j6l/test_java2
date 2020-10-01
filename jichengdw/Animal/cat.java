package com.jichengdw.Animal;

public class cat extends  Animal{
    private double weight;//体重

    public cat(){

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //跑动的方法
    public void run(){
        System.out.println(this.getName()+"是一只"+this.getSpecies()+"，他在跑动。");
    }
}
