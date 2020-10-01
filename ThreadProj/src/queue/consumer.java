package queue;

public class consumer implements Runnable {
    queue queue;

    public consumer(queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            queue.getQqq();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
