package bank;

public class save implements Runnable{
    //存款100

    bank bank;

    public save(bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        bank.save();
    }
}
