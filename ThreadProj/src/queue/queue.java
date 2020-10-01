package queue;

public class queue {
    private int qqq;
    boolean flag=false;


    public synchronized int getQqq() {
        if (!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("消费："+qqq);
        flag=false;
        notifyAll();
        return qqq;
    }

    public synchronized void setQqq(int qqq) {
        if (flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("生产："+qqq);
        this.qqq = qqq;
        flag=true;
        notifyAll();
    }
}
