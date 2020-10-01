package com.xue.leibie;

public class Xueke {
    //学科名称。编号。年限
    private String subName;
    private String subNo;
    private int sublife;
    private Xues[] Mystu;
    //private Xues[] Mystu=new Xues[100];
    private int stuNum;

    //无参构造
    public Xueke(){

    }

    //带参构造，全部赋值
    public Xueke(String subName,String subNo,int sublife){
        this.setSubName(subName);
        this.setSubNo(subNo);
        this.setSublife(sublife);
    }

    public Xues[] getMystu() {
        if (this.Mystu==null)
            this.Mystu = new Xues[100];
        return Mystu;
    }

    public void setMystu(Xues[] mystu) {
        Mystu = mystu;
    }

    public int getStuNum() {
        return stuNum;
    }

    public void setStuNum(int stuNum) {
        this.stuNum = stuNum;
    }

    public void setSubName(String subName){
        this.subName=subName;
    }
    public String getSubName(){
        return this.subName;
    }

    public String getSubNo() {
        return subNo;
    }

    public void setSubNo(String subNo) {
        this.subNo = subNo;
    }

    public int getSublife() {
        return sublife;
    }

    public void setSublife(int sublife) {
        this.sublife = sublife;
    }

    //专业信息介绍
    public String info(){
        String str="专业信息如下：\n名称："+this.subName+"\n编号："+this.subNo+"\n学制："+this.sublife+"年";
        return str;
    }

    public void addStu(Xues stu){
        for (int i=0;i<this.getMystu().length;i++){
            if (this.getMystu()[i] == null){
                this.getMystu()[i] = stu;
                this.stuNum = i+1;
                break;
            }
        }
    }
}
