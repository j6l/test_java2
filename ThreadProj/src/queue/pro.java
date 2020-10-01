package queue;

public class pro implements Runnable {
    queue queue;

    public pro(queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        int i=0;
        while (true){
        queue.setQqq(i++%10);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
