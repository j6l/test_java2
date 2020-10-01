package thread1;

class Mythreadttt extends Thread{
    public Mythreadttt(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+"线程"+i+"正在执行");
        }
    }
}

public class Threadtest {
    public static void main(String[] args) {
//        int youxian=Thread.currentThread().getPriority();
        Mythreadttt one=new Mythreadttt("线程1");
        Mythreadttt two=new Mythreadttt("xianchegn2");
        one.start();
        two.start();



    }
}
