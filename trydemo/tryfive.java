package com.yi.trydemo;

public class tryfive {
    public static void main(String[] args) {
        try {
            testthree();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testone() throws jiud {
        throw new jiud();
    }

    public static void testtwo() throws Exception {
        try {
            testone();
        } catch (jiud e) {
            Exception e1=new Exception("新异常1");
            e1.initCause(e);
            throw e1;
            //throw new Exception("新异常1");
        }
    }

    public static void testthree() throws Exception {
        try {
            testtwo();
        } catch (Exception e) {
            Exception e1=new Exception("新异常2");
            e1.initCause(e);
            throw e1;
            //throw new Exception("新异常2");
        }
    }
}
