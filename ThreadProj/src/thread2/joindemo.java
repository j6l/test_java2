package thread2;

import thread2.mythread;

public class joindemo {
    public static void main(String[] args) {
        mythread nt=new mythread();
        Thread mm=new Thread(nt);
        mm.start();
        try {
            mm.join(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        for (int i=0;i<20;i++)
            System.out.println("主线程运行"+i+"次");

        System.out.println("主线程运行结束");
    }
}
