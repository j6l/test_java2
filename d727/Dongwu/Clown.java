package com.d727.Dongwu;

public class Clown {
    private String Name;
    private int sexyes;

    public Clown() {
    }

    public Clown(String name,int sexyes){
        setName(name);
        setSexyes(sexyes);
    }

    public void info(){
        System.out.println("姓名："+getName());
        System.out.println("职业：马戏团小丑");
        System.out.println("艺龄："+getSexyes());
        dress();
        System.out.println();
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSexyes() {
        return sexyes;
    }

    public void setSexyes(int sexyes) {
        this.sexyes = sexyes;
    }

    //衣服特点
    public void dress(){
        System.out.println("外表衣着：衣服华丽，惹人喜欢！");
    }
}
