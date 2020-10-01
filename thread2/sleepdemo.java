package thread2;

class mythread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println(Thread.currentThread().getName() + "执行第" + i + "次！");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}

public class sleepdemo {
    public static void main(String[] args) {
        mythread mt = new mythread();
        Thread mm = new Thread(mt);
        mm.start();
        Thread mo = new Thread(mt);
        mo.start();


    }
}
