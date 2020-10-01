package com.duotai.test;

import com.duotai.Animal.Animal;
import com.duotai.Animal.Cat;
import com.duotai.Animal.Dog;

public class Animaltest {
    public static void main(String[] args) {
        Animal one = new Animal();
        /**
         * 向上转型
         * 只能调用与父类有关的方法，无法调动子类的方法
         */
        Animal two = new Cat();
        Animal three = new Dog();
        one.eat();
        two.eat();
        three.eat();

        System.out.println("***********************************");
        /**
         * 向下转型
         * 子类强转。可以调用子类的方法
         * 不可以二次强制转到其他子类
         * instanceof 判断前者是否存在后者里面，返回true/false
         */
        if (two instanceof Cat) {
            Cat one1 = (Cat) two;
            one1.eat();
            one1.run();
            System.out.println("猫");
        }

        if (two instanceof Dog) {
            Dog one2 = (Dog)two;
            one2.eat();
            one2.sleep();
            System.out.println("狗");
        }

    }
}
