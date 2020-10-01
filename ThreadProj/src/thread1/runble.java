package thread1;

class conee implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"线程"+i+"正在执行");
        }
    }
}

public class runble {
    public static void main(String[] args) {
        /**
         * 线程优先级
         * 有且只有10个级别，10最大1最小
         * getPriority()查询优先级
         * setPriority(8)设置优先级
         */
        conee one=new conee();
        Thread t1=new Thread(one);
        t1.setPriority(2);
        t1.start();
        Thread t2=new Thread(one);
        t2.setPriority(8);
        t2.start();
        System.out.println("111:"+t1.getPriority());
        System.out.println("111:"+t2.getPriority());


    }
}
