package com.jichengdw.Animal;

public class dog extends Animal {
    private String sex;//性别

    public dog(){

    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    //睡觉的方法
    public void sleep(){
        System.out.println(this.getName()+"现在"+this.getMonth()+"个月大，他现在在睡觉。");
    }
}
