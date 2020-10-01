package bank;

public class draw implements Runnable {
    //取款200
    bank bank;

    public draw(bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        bank.draw();
    }
}
