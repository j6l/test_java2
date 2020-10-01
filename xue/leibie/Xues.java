package com.xue.leibie;

public class Xues {
    //学号，姓名，性别，年龄
    private String stuNo;
    private String stuName;
    private String stuSex;
    private int stuAge;
    private Xueke stuXueke;

    //无构造参数
    public Xues(){}

    public Xues(String xxxNo,String xxxName,String xxxSex,int xxxAge,Xueke stuXueke){
        this.setStuNo(xxxNo);
        this.setStuName(xxxName);
        this.setStuAge(xxxAge);
        this.setStuSex(xxxSex);
        this.setStuXueke(stuXueke);
    }

    public Xueke getStuXueke() {
        if(this.stuXueke==null)
            this.stuXueke = new Xueke();
        return stuXueke;
    }

    public void setStuXueke(Xueke stuXueke) {
        this.stuXueke = stuXueke;
    }

    //有构造参数
    public Xues(String xxxNo,String xxxName,String xxxSex,int xxxAge){
        this.setStuNo(xxxNo);
        this.setStuName(xxxName);
        this.setStuAge(xxxAge);
        this.setStuSex(xxxSex);
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        if(stuSex.equals("男"))
            this.stuSex="男";
        else
            this.stuSex="女";
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        if(stuAge<10 | stuAge>100)
            this.stuAge=18;
        else
            this.stuAge = stuAge;
    }

    //学生信息介绍

    public String info(){
        String str="学生信息如下：\n学号："+this.stuNo +"\n名称："+this.stuName +"\n性别："+this.stuSex
                +"\n年龄："+this.stuAge +"岁"+"\n学科："+this.stuXueke.getSubName()+"\n年制："+this.stuXueke.getSublife()
                +"年";
        return str;
    }
    public String info(Xueke myxueke){
        String str="学生信息如下：\n学号："+this.stuNo +"\n名称："+this.stuName +"\n性别："+this.stuSex
                +"\n年龄："+this.stuAge +"岁"+"\n学科："+myxueke.getSubName()+"\n年制："+myxueke.getSublife();
        return str;
    }
}

