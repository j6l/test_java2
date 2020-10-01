package queue;

public class test {
    public static void main(String[] args) {
        queue queue=new queue();
        new Thread(new pro(queue)).start();
        new Thread(new consumer(queue)).start();

    }
}
