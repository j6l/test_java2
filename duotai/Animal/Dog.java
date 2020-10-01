package com.duotai.Animal;

public class Dog extends Animal {
    //性别
    private String sex;

    public Dog(){

    }

    public Dog(String name,int month,String sex){
        super(name,month);
        this.setSex(sex);
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    //睡觉
    public void sleep(){
        System.out.println("小狗在睡觉！");
    }

    //吃东西

    @Override
    public void eat() {
        System.out.println("小狗在吃肉");
        //super.eat();
    }
}
