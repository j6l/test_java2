package com.jichengdw.test;

import com.jichengdw.Animal.cat;
import com.jichengdw.Animal.dog;

public class Animaltest {

    public static void main(String[] args) {
        cat one=new cat();
        one.setName("花花");
        one.setSpecies("中华田园猫");
        one.eat();
        one.run();
        System.out.println("**********************");
        dog two=new dog();
        two.setName("妞妞");
        two.setMonth(2);
        two.eat();
        two.sleep();
    }

}
